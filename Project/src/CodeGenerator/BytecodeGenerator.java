package CodeGenerator;

import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Field.Field;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import Parser.DataClasses.Common.AccessModifiers;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import SemanticCheck.TypedDataClasses.typedExpressions.*;
import SemanticCheck.TypedDataClasses.typedMethod.TypedMethod;
import SemanticCheck.TypedDataClasses.typedMethod.TypedMethodParameter;
import SemanticCheck.TypedDataClasses.typedStatementExpression.*;
import SemanticCheck.TypedDataClasses.typedStatements.*;
import Parser.DataClasses.Types.*;
import org.objectweb.asm.*;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;

import static com.company.Main.debugFlag;

public class BytecodeGenerator {
    private static TypedProgram aProgram;
    private ClassWriter cw;
    private FieldVisitor fieldVisitor;
    private ITypedExpression currentLocalOrFieldVar;
    private String currentClassName;
    private boolean doAssignA = false;

    public BytecodeGenerator(TypedProgram pProgram) {
        aProgram = pProgram;
        if (debugFlag)
            System.out.println(pProgram);
    }

    public HashMap<String, byte[]> genCode() {
        var classList = aProgram.classes();
        HashMap<String, byte[]> allClasses = new HashMap<String, byte[]>();
        for (TypedClass pClass : classList) {
            allClasses.put(pClass.identifier(), generateClassCode(pClass));
        }
        return allClasses;
    }

    private byte[] generateClassCode(TypedClass pClass) {
        //Save classname in field for put-/getfield operations
        currentClassName = pClass.identifier();
        //Initiate class
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        MethodVisitor methodVisitor;
        FieldVisitor fieldVisitor;
        //V18 for Java Version
        //cw.visit(Opcodes.V18, Opcodes.ACC_SUPER, pClass.identifier(), null, "java/lang/Object", null);
        cw.visit(Opcodes.V18, Opcodes.ACC_PUBLIC, pClass.identifier(), null, "java/lang/Object", null);

        //visit Fields first
        generateFieldCode(pClass.fields());

        //visit Constructors
        generateConstructors(cw, pClass.constructor());

        //visit Methods next
        generateMethodCode(cw, pClass.methods());


        //Close classwriter
        cw.visitEnd();
        var classBytecode = cw.toByteArray();
        return classBytecode;
    }

    private void generateFieldCode(List<Field> pField) {
        for (Field field : pField) {
            int accessmod = -1;
            String descriptor;
            // Extract access modifier
            accessmod = generateAccessMod(field.accessModifier());
            // extract field type
            descriptor = generateTypeString(field.type());
            fieldVisitor = cw.visitField(accessmod, field.name(), descriptor, null, null);
            fieldVisitor.visitEnd();
        }
    }

    private void generateConstructors(ClassWriter cw, List<TypedMethod> pConstructors) {
        if (pConstructors.isEmpty()) {
            //No constructors means standard constructor
            generateStandardConstructor(cw);
        } else {
            for (var method : pConstructors) {
                //Initiate HashMap for local variables inside the method
                HashMap<String, Integer> locals = generateParameters(method.parameters());
                MethodVisitor methodVisitor = cw.visitMethod(generateAccessMod(method.accessModfier()), "<init>", generateDescriptorParameter(method.parameters(), new VoidType()), null, null);
                methodVisitor.visitCode();
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
                System.out.println("ALOAD, 0");
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
                generateStatement(methodVisitor, locals, method.statement());
                methodVisitor.visitInsn(Opcodes.RETURN);
                methodVisitor.visitMaxs(0, 0);
                methodVisitor.visitEnd();
            }
        }
    }

    private void generateStandardConstructor(ClassWriter cw) {
        MethodVisitor methodVisitor = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        System.out.println("ALOAD, 0");
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(0, 0);
        methodVisitor.visitEnd();
    }

    private void generateMethodCode(ClassWriter cw, List<TypedMethod> pMethods) {
        for (var method : pMethods) {
            //Initiate HashMap for local variables inside the method
            HashMap<String, Integer> locals = generateParameters(method.parameters());
            MethodVisitor methodVisitor = cw.visitMethod(generateAccessMod(method.accessModfier()), method.identifer(), generateDescriptorParameter(method.parameters(), method.returnType()), null, null);
            methodVisitor.visitCode();
            generateStatement(methodVisitor, locals, method.statement());
            if (method.objectType() instanceof VoidType) {
                methodVisitor.visitInsn(Opcodes.RETURN);
            }
            methodVisitor.visitMaxs(0, 0);
            methodVisitor.visitEnd();
        }
    }

    private int generateAccessMod(AccessModifiers accessModifier) {
        switch (accessModifier) {
            case Public:
                return Opcodes.ACC_PUBLIC;
            case Private:
                return Opcodes.ACC_PRIVATE;
            case Protected:
                return Opcodes.ACC_PROTECTED;
            default:
                throw new IllegalStateException("Unexpected value: " + accessModifier);
        }
    }

    private String generateDescriptor(List<ITypedExpression> parameters, IMethodType returnType) {
        String descriptor = "(";
        for (var parameter : parameters) {
            descriptor = descriptor + generateTypeString(parameter.getType());
        }
        descriptor = descriptor + ")" + generateTypeString(returnType);
        return descriptor;
    }

    private String generateDescriptorParameter(List<TypedMethodParameter> parameters, IMethodType returnType) {
        String descriptor = "(";
        for (var parameter : parameters) {
            descriptor = descriptor + generateTypeString(parameter.type());
        }
        descriptor = descriptor + ")" + generateTypeString(returnType);
        return descriptor;
    }

    private String generateTypeString(IMethodType returnType) {
        String typeString;
        switch (returnType) {
            case BoolType type -> {
                typeString = "Z";
            }
            case IntType type -> {
                typeString = "I";
            }
            case CharType type -> {
                typeString = "C";
            }
            case CustomType type -> {
                typeString = "L" + type.getName() + ";";
            }
            case VoidType type -> {
                typeString = "V";
            }
            default -> throw new IllegalStateException("Unexpected value: " + returnType);
        }
        return typeString;
    }

    private HashMap<String, Integer> generateParameters(List<TypedMethodParameter> methodParameters) {
        HashMap<String, Integer> parameters = new HashMap<String, Integer>();
        for (var parameter : methodParameters) {
            parameters.put(parameter.identifier(), parameters.size() + 1);
        }
        return parameters;
    }

    private void generateStatement(MethodVisitor mv, HashMap<String, Integer> locals, ITypedStatement pStatement) {
        switch (pStatement) {
            case TypedBlock statement -> {
                System.out.println(statement);
                generateBlock(mv, locals, statement);
            }
            case TypedIfElseStatement statement -> {
                System.out.println(statement);
                generateIfElse(mv, locals, statement);
            }
            case TypedReturnStatement statement -> {
                System.out.println(statement);
                generateReturn(mv, locals, statement);
            }
            case TypedVarDeclarationStatement statement -> {
                System.out.println(statement);
                generateVarDeclaration(mv, locals, statement);
            }
            case TypedWhileStatement statement -> {
                System.out.println(statement);
                generateWhile(mv, locals, statement);
            }
            //StatementExpressions
            case TypedInstVarStatementExpression expression -> {
                //TODO
                System.out.println(expression);
                generateInstVarStatementExpression(mv, locals, expression);
            }
            case TypedAssignStatementExpression statement -> {
                System.out.println(statement);
                generateAssignStatementExpression(mv, locals, statement);
            }
            case TypedMethodCallStatementExpression statement -> {
                System.out.println(statement);
                generateTypedMethodCallStatementExpression(mv, locals, statement);
            }
            case TypedNewStatementExpression statement -> {
                System.out.println(statement);
                generateNewStatementExpression(mv, locals, statement);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pStatement);
        }
    }

    private void generateInstVarStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedInstVarStatementExpression expression) {
        currentLocalOrFieldVar = expression;
        generateExpression(mv, locals, expression.expression());
        if (!doAssignA) {
            mv.visitFieldInsn(Opcodes.GETFIELD, expression.expression().getType().getName(), expression.varName(), generateTypeString(expression.getType()));
        }
    }

    private void generateNewStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedNewStatementExpression statement) {
        mv.visitTypeInsn(Opcodes.NEW, statement.type().getName());
        System.out.printf("mv.visitTypeInsn(Opcodes.NEW, " + statement.type().getName() + ")");
        mv.visitInsn(Opcodes.DUP);
        System.out.println("mv.visitInsn(Opcodes.DUP)");
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, statement.type().getName(), "<init>", generateDescriptor(statement.constructorCall().parameters(), new VoidType()), false);
        System.out.println("mv.visitMethodInsn(Opcodes.INVOKESPECIAL, " + "statement.type().getName()" + ", " + "<init>" + ", " + generateDescriptor(statement.constructorCall().parameters(), new VoidType()) + ", " + false + ")");
    }

    private void generateReturn(MethodVisitor mv, HashMap<String, Integer> locals, TypedReturnStatement statement) {
        generateExpression(mv, locals, statement.returnValue());
        switch (statement.getType()) {
            case BoolType type -> mv.visitInsn(Opcodes.IRETURN); //IRETURN, 0 = false, 1 = true
            case IntType type -> mv.visitInsn(Opcodes.IRETURN);
            case CharType type -> mv.visitInsn(Opcodes.IRETURN);
            case CustomType type -> mv.visitInsn(Opcodes.ARETURN);
            case VoidType type -> mv.visitInsn(Opcodes.RETURN);
            default -> throw new IllegalStateException("Unexpected value: " + statement.getType());
        }
    }

    private void generateVarDeclaration(MethodVisitor mv, HashMap<String, Integer> locals, TypedVarDeclarationStatement statement) {
        locals.put(statement.name(), locals.size() + 1);
    }

    private void generateWhile(MethodVisitor mv, HashMap<String, Integer> locals, TypedWhileStatement statement) {
        Label startLabel = new Label();
        Label endLabel = new Label();
        //Expression to decide jump to label
        generateExpression(mv, locals, statement.condition());
        mv.visitLabel(startLabel);
        //check expression
        generateExpression(mv, locals, statement.condition());
        mv.visitJumpInsn(Opcodes.IFEQ, endLabel); //break loop if value from condition expression equals 0
        //code block of while
        generateStatement(mv, locals, statement.block());
        //end of loop
        mv.visitJumpInsn(Opcodes.GOTO, startLabel);
        //outside of loop
        mv.visitLabel(endLabel);
    }

    private void generateIfElse(MethodVisitor mv, HashMap<String, Integer> locals, TypedIfElseStatement statement) {
        Label elseLabel = new Label();
        Label endLabel = new Label();
        generateExpression(mv, locals, statement.expression());
        //IFEQ compares to 0, if value on stack is not ICONST_0, skip if block
        mv.visitJumpInsn(Opcodes.IFEQ, elseLabel);
        generateStatement(mv, locals, statement.ifBlock());
        mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        //do else code
        mv.visitLabel(elseLabel);
        generateStatement(mv, locals, statement.elseBlock());
        mv.visitLabel(endLabel);
    }

    private void generateBlock(MethodVisitor mv, HashMap<String, Integer> locals, TypedBlock block) {
        for (var statement : block.statements()) {
            generateStatement(mv, locals, statement);
        }
    }

    private void generateExpression(MethodVisitor mv, HashMap<String, Integer> locals, ITypedExpression pExpression) {
        //If an expression is true, load ICONST_1 onto stack, false is ICONST_0
        switch (pExpression) {
            case TypedBinaryExpression expression -> {
                System.out.println(expression);
                generateTypedBinaryExpression(mv, locals, expression);

            }
            case TypedConstExpression expression -> {
                System.out.println(expression);
                generateConstExpression(mv, locals, expression);

            }
            case TypedJNullExpression expression -> {
                System.out.println(expression);
                mv.visitInsn(Opcodes.ACONST_NULL);

            }
            case TypedSuperExpression expression -> {
                //TODO
                System.out.println(expression);
            }
            case TypedThisExpression expression -> {
                System.out.println(expression);
                mv.visitVarInsn(Opcodes.ALOAD, 0);
                System.out.println("ALOAD, 0");

            }
            case TypedLocalOrFieldVar expression -> {
                System.out.println(expression);
                generateLocalOrFieldVarExpression(mv, locals, expression);

            }
            /*
            case TypedTypeExpression expression -> {
                //TODO
                System.out.println(expression);
            }*/
            case TypedUnaryExpression expression -> {
                System.out.println(expression);
                generateUnaryExpression(mv, locals, expression);

            }
            //StatementExpressions
            case TypedInstVarStatementExpression expression -> {
                //TODO
                //put-/getfield in different class
                System.out.println(expression);
                generateInstVarStatementExpression(mv, locals, expression);

            }
            case TypedAssignStatementExpression statement -> {
                System.out.println(statement);
                generateAssignStatementExpression(mv, locals, statement);

            }
            case TypedMethodCallStatementExpression statement -> {
                System.out.println(statement);
                generateTypedMethodCallStatementExpression(mv, locals, statement);

            }
            case TypedNewStatementExpression statement -> {
                System.out.println(statement);
                generateNewStatementExpression(mv, locals, statement);

            }
            default -> throw new IllegalStateException("Unexpected value: " + pExpression);
        }
    }

    private void generateLocalOrFieldVarExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedLocalOrFieldVar expression) {
        if (!doAssignA) {
            if (checkIfLocalVar(locals, expression)) {
                if (expression.getType() instanceof CustomType) {
                    mv.visitVarInsn(Opcodes.ALOAD, locals.get(expression.name()));
                    System.out.println("mv.visitVarInsn(Opcodes.ALOAD, " + locals.get(expression.name()) + ")");
                } else {
                    mv.visitVarInsn(Opcodes.ILOAD, locals.get(expression.name()));

                    System.out.println("mv.visitVarInsn(Opcodes.ILOAD, " + locals.get(expression.name()) + ")");
                }
            } else {

                mv.visitVarInsn(Opcodes.ALOAD, 0);
                mv.visitFieldInsn(Opcodes.GETFIELD, currentLocalOrFieldVar.getType().getName(), expression.name(), generateTypeString(expression.getType()) + ")");

                System.out.println("Opcodes.ALOAD, 0");
                System.out.println("Opcodes.GETFIELD," + currentLocalOrFieldVar.getType().getName() + ", " + expression.name() + ", " + generateTypeString(expression.getType()) + ")");
            }
        }
        if (doAssignA) mv.visitVarInsn(Opcodes.ALOAD, 0);
        currentLocalOrFieldVar = expression;
    }

    private void generateTypedMethodCallStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedMethodCallStatementExpression statement) {
        //for (var parameter : statement.parameters()) {
        //            generateExpression(mv, locals, parameter);
        //        }
        generateExpression(mv, locals, statement.target());
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, statement.target().getType().getName(), statement.name(),
                generateDescriptor(statement.parameters(), statement.getType()), false);
    }

    private void generateConstExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedConstExpression expression) {
        switch (expression.getType()) {
            case IntType type -> {
                mv.visitIntInsn(Opcodes.BIPUSH, (Integer) expression.value());
                System.out.println("Pushed " + expression.value() + " onto stack");
            }
            case CharType type -> {
                mv.visitIntInsn(Opcodes.BIPUSH, (Integer) expression.value());
                System.out.println("Pushed " + expression.value() + " onto stack");
            }
            case BoolType type -> {
                if ((Boolean) expression.value()) {
                    mv.visitInsn(Opcodes.ICONST_1);
                    System.out.println("Pushed Opcodes.ICONST_1 onto stack");
                } else {
                    mv.visitInsn(Opcodes.ICONST_0);
                    System.out.println("Pushed Opcodes.ICONST_0 onto stack");
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + expression.getType());
        }
    }

    private void generateAssignStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedAssignStatementExpression statement) {
        //TODO
        doAssignA = true;
        generateExpression(mv, locals, statement.expressionA());
        var valueToAssign = currentLocalOrFieldVar;
        doAssignA = false;
        generateExpression(mv, locals, statement.expressionB());
        //value of expressionB is on top of stack

        switch (valueToAssign) {
            case TypedLocalOrFieldVar exp -> {
                if (checkIfLocalVar(locals, exp)) {
                    if (exp.getType() instanceof CustomType) {
                        mv.visitVarInsn(Opcodes.ASTORE, locals.get(exp.name()));
                        System.out.println("mv.visitFieldInsn(Opcodes.ASTORE, " + locals.get(exp.name()) + ")");
                    } else {
                        mv.visitVarInsn(Opcodes.ISTORE, locals.get(exp.name()));
                        System.out.println("mv.visitFieldInsn(Opcodes.ISTORE, " + locals.get(exp.name()) + ")");
                    }
                } else {
                    mv.visitFieldInsn(Opcodes.PUTFIELD, currentClassName, exp.name(), generateTypeString(exp.getType()));
                    System.out.println("mv.visitFieldInsn(Opcodes.PUTFIELD, " + currentClassName + ", " + exp.name() + ", " + generateTypeString(exp.getType()) + ")");
                }
            }
            case TypedInstVarStatementExpression exp -> {
                mv.visitFieldInsn(Opcodes.PUTFIELD, currentLocalOrFieldVar.getType().getName(), exp.varName(), generateTypeString(exp.getType()));
                System.out.println("mv.visitFieldInsn(Opcodes.PUTFIELD, " + currentLocalOrFieldVar.getType().getName() + ", " + exp.varName() + ", " + generateTypeString(exp.getType()) + ")");
            }
            default -> throw new IllegalStateException("Unexpected value: " + valueToAssign);
        }
    }

    private boolean checkIfLocalVar(HashMap<String, Integer> locals, TypedLocalOrFieldVar exp) {
        if (locals.get(exp.name()) != null) {
            return true;
        } else {
            return false;
        }
    }

    private void generateUnaryExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedUnaryExpression expression) {
        switch (expression.operator()) {
            case "+":
                break;
            case "-":
                //Load next expression and multiply with -1
                generateExpression(mv, locals, expression.expression());
                mv.visitInsn(Opcodes.ICONST_M1);
                mv.visitInsn(Opcodes.IMUL);
                break;
            case "!":
                //check if expression is true (ICONST_1) or false (ICONST_0) and negate value
                Label falseLabel = new Label();
                mv.visitInsn(Opcodes.ICONST_1);
                generateExpression(mv, locals, expression.expression());
                mv.visitJumpInsn(Opcodes.IF_ICMPEQ, falseLabel);
                //not equal means expression is false -> load 1 onto stack
                mv.visitInsn(Opcodes.ICONST_1);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                //equal means means expression is true -> load 0 onto stack
                mv.visitLabel(falseLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitLabel(endLabel);
                break;
            default: {
                throw new IllegalStateException("Unexpected value: " + expression.operator());
            }
        }
    }

    private void generateTypedBinaryExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedBinaryExpression expression) {
        generateExpression(mv, locals, expression.a());
        generateExpression(mv, locals, expression.b());
        //Bytecode operation with the two values on top of stack
        switch (expression.operator()) {
            case "+": {
                mv.visitInsn(Opcodes.IADD);
                break;
            }
            case "-": {
                mv.visitInsn(Opcodes.ISUB);
                break;
            }
            case "*": {
                mv.visitInsn(Opcodes.IMUL);
                break;
            }
            case "/": {
                mv.visitInsn(Opcodes.IDIV);
                break;
            }
            case "%": {
                mv.visitInsn(Opcodes.IREM);
                break;
            }
            case "==": {
                Label trueLabel = new Label();
                mv.visitJumpInsn(Opcodes.IF_ICMPEQ, trueLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(trueLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endLabel);
                break;
            }
            case "!=": {
                Label trueLabel = new Label();
                mv.visitJumpInsn(Opcodes.IF_ICMPNE, trueLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(trueLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endLabel);
                break;
            }
            case "<": {
                Label trueLabel = new Label();
                mv.visitJumpInsn(Opcodes.IF_ICMPLT, trueLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(trueLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endLabel);
                break;
            }
            case "<=": {
                Label trueLabel = new Label();
                mv.visitJumpInsn(Opcodes.IF_ICMPLE, trueLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(trueLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endLabel);
                break;
            }
            case ">": {
                Label trueLabel = new Label();
                mv.visitJumpInsn(Opcodes.IF_ICMPGT, trueLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(trueLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endLabel);
                break;
            }
            case ">=": {
                Label trueLabel = new Label();
                mv.visitJumpInsn(Opcodes.IF_ICMPGE, trueLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(trueLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endLabel);
                break;
            }
            case "&&": {
                generateExpression(mv, locals, expression.a());
                Label falseLabel = new Label();
                mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
                generateExpression(mv, locals, expression.b());
                mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                Label endLabel = new Label();
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(falseLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitLabel(endLabel);
                break;
            }
            case "||": {
                generateExpression(mv, locals, expression.a());
                Label bLabel = new Label();
                mv.visitJumpInsn(Opcodes.IFEQ, bLabel);
                Label endLabel = new Label();
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(bLabel);
                generateExpression(mv, locals, expression.b());
                Label falseLabel = new Label();
                mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitJumpInsn(Opcodes.GOTO, endLabel);
                mv.visitLabel(falseLabel);
                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitLabel(endLabel);
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + expression.operator());
            }
        }
    }

}