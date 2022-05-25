package CodeGenerator;

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

import java.util.HashMap;
import java.util.List;

import static com.company.Main.debugFlag;

public class BytecodeGenerator {
    private static TypedProgram aProgram;
    private ClassWriter cw;
    private MethodVisitor methodVisitor;
    private FieldVisitor fieldVisitor;

    private String currentClassName;
    private TypedLocalOrFieldVar targetOfInstVar;
    private String targetName;
    private IMethodType currentTargetType;

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
                MethodVisitor methodVisitor = cw.visitMethod(generateAccessMod(method.accessModfier()), method.identifer(), generateDescriptorParameter(method.parameters(), new VoidType()), null, null);
                methodVisitor.visitCode();
                generateStatement(methodVisitor, locals, method.statement());
                methodVisitor.visitMaxs(0, 0);
                methodVisitor.visitEnd();
            }
        }
    }

    private void generateMethodCode(ClassWriter cw, List<TypedMethod> pMethods) {
        for (var method : pMethods) {
            //Initiate HashMap for local variables inside the method
            HashMap<String, Integer> locals = generateParameters(method.parameters());
            MethodVisitor methodVisitor = cw.visitMethod(generateAccessMod(method.accessModfier()), method.identifer(), generateDescriptorParameter(method.parameters(), method.returnType()), null, null);
            methodVisitor.visitCode();
            generateStatement(methodVisitor, locals, method.statement());
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

    private void generateStandardConstructor(ClassWriter cw) {
        methodVisitor = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(0, 0);
        methodVisitor.visitEnd();
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
                generateBlock(mv, locals, statement);
                System.out.println(statement);
            }
            case TypedIfElseStatement statement -> {
                generateIfElse(mv, locals, statement);
                System.out.println(statement);
            }
            case TypedReturnStatement statement -> {
                generateReturn(mv, locals, statement);
                System.out.println(statement);
            }
            case TypedVarDeclarationStatement statement -> {
                generateVarDeclaration(mv, locals, statement);
                System.out.println(statement);
            }
            case TypedWhileStatement statement -> {
                generateWhile(mv, locals, statement);

                System.out.println(statement);
            }
            //StatementExpressions
            case TypedInstVarStatementExpression expression -> {
                //TODO
                generateInstVarStatementExpression(mv, locals, expression);

                System.out.println(expression);
            }
            case TypedAssignStatementExpression statement -> {
                generateAssignStatementExpression(mv, locals, statement);

                System.out.println(statement);
            }
            case TypedMethodCallStatementExpression statement -> {
                generateTypedMethodCallStatementExpression(mv, locals, statement);

                System.out.println(statement);
            }
            case TypedNewStatementExpression statement -> {
                generateNewStatementExpression(mv, locals, statement);

                System.out.println(statement);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pStatement);
        }
    }

    private void generateInstVarStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedInstVarStatementExpression expression) {
        generateExpression(mv, locals, expression);
        mv.visitFieldInsn(Opcodes.GETFIELD, targetOfInstVar.getType().getName(), expression.varName(), generateTypeString(expression.getType()));
    }

    private void generateNewStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedNewStatementExpression statement) {
        mv.visitTypeInsn(Opcodes.NEW, statement.type().getName());
        mv.visitInsn(Opcodes.DUP);
        generateStatement(mv, locals, statement.constructorCall());
    }

    private void generateReturn(MethodVisitor mv, HashMap<String, Integer> locals, TypedReturnStatement statement) {
        //TODO
        generateExpression(mv, locals, statement.returnValue());
        switch (statement.getType()) {
            case BoolType type -> mv.visitInsn(Opcodes.IRETURN); //IRETURN, 0 = false, 1 = true
            case IntType type -> mv.visitInsn(Opcodes.IRETURN);
            case CharType type -> mv.visitInsn(Opcodes.IRETURN);
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
        Label ifLabel = new Label();
        generateExpression(mv, locals, statement.expression());
        //IFEQ compares to 0, if value on stack is not ICONST_0, skip if block
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, ifLabel);
        //do if code
        generateStatement(mv, locals, statement.ifBlock());
        mv.visitLabel(ifLabel);
        Label elseLabel = new Label();
        //do else code
        mv.visitLabel(elseLabel);
        generateStatement(mv, locals, statement.elseBlock());
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
                generateTypedBinaryExpression(mv, locals, expression);

                System.out.println(expression);
            }
            case TypedConstExpression expression -> {
                generateConstExpression(mv, locals, expression);

                System.out.println(expression);
            }
            case TypedJNullExpression expression -> {
                mv.visitInsn(Opcodes.ACONST_NULL);

                System.out.println(expression);
            }
            case TypedSuperExpression expression -> {
                //TODO
                System.out.println(expression);
            }
            case TypedThisExpression expression -> {
                mv.visitVarInsn(Opcodes.ALOAD, 0);

                System.out.println(expression);
            }
            case TypedLocalOrFieldVar expression -> {
                generateLocalOrFieldVarExpression(mv, locals, expression);

                System.out.println(expression);
            }
            /*
            case TypedTypeExpression expression -> {
                //TODO
                System.out.println(expression);
            }*/
            case TypedUnaryExpression expression -> {
                generateUnaryExpression(mv, locals, expression);

                System.out.println(expression);
            }
            //StatementExpressions
            case TypedInstVarStatementExpression expression -> {
                //TODO
                //put-/getfield in different class
                generateInstVarStatementExpression(mv, locals, expression);

                System.out.println(expression);
            }
            case TypedAssignStatementExpression statement -> {
                generateAssignStatementExpression(mv, locals, statement);

                System.out.println(statement);
            }
            case TypedMethodCallStatementExpression statement -> {
                generateTypedMethodCallStatementExpression(mv, locals, statement);

                System.out.println(statement);
            }
            case TypedNewStatementExpression statement -> {
                generateNewStatementExpression(mv, locals, statement);

                System.out.println(statement);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pExpression);
        }
    }

    private void generateLocalOrFieldVarExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedLocalOrFieldVar expression) {
        if(checkIfLocalVar(mv, locals, expression)) {
            mv.visitVarInsn(Opcodes.ILOAD, locals.get(expression.name()));
            targetOfInstVar = expression;
        } else {
            mv.visitFieldInsn(Opcodes.GETFIELD, targetName, expression.name(), generateTypeString(expression.getType()));
            targetOfInstVar = expression;
        }
    }

    private void generateTypedMethodCallStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedMethodCallStatementExpression statement) {
        for (var parameter : statement.parameters()) {
            generateExpression(mv, locals, parameter);
        }
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, statement.target().getType().getName(), statement.name(),
                generateDescriptor(statement.parameters(), statement.getType()), false);
        currentTargetType = statement.target().getType();
    }

    private void generateConstExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedConstExpression expression) {
        switch (expression.getType()) {
            case IntType type -> mv.visitIntInsn(Opcodes.BIPUSH, (Integer) expression.value());
            case CharType type -> mv.visitIntInsn(Opcodes.BIPUSH, (Integer) expression.value());
            case BoolType type -> {
                if ((Boolean) expression.value()) {
                    mv.visitInsn(Opcodes.ICONST_1);
                } else {
                    mv.visitInsn(Opcodes.ICONST_0);
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + expression.getType());
        }
    }

    private void generateAssignStatementExpression(MethodVisitor mv, HashMap<String, Integer> locals, TypedAssignStatementExpression statement) {
        /*

        //TODO
        generateExpression(mv, locals, statement.expressionA());
        var toAssign;
        var targetOfAssign;
        generateExpression(mv, locals, statement.expressionB());

        //getfield of b expression

        if(checkIfLocalVar(mv, locals, )) {
            //is localVar
            mv.visitVarInsn(Opcodes.ISTORE, locals.get());
        } else {
            //is field
            //mv.visitVar
        }


         */
    }

    private boolean checkIfLocalVar(MethodVisitor mv, HashMap<String, Integer> locals, TypedLocalOrFieldVar exp) {
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
                mv.visitJumpInsn(Opcodes.GOTO,endLabel);
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