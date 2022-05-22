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
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.HashMap;
import java.util.List;

import static com.company.Main.debugFlag;

public class BytecodeGenerator {
    private static TypedProgram aProgram;
    private ClassWriter cw;
    private MethodVisitor methodVisitor;
    private FieldVisitor fieldVisitor;

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
        //Initiate class
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        MethodVisitor methodVisitor;
        FieldVisitor fieldVisitor;
        //V18 for Java Version
        cw.visit(Opcodes.V18, Opcodes.ACC_SUPER, pClass.identifier(), null, "java/lang/Object", null);

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
                MethodVisitor methodVisitor = cw.visitMethod(generateAccessMod(method.accessModfier()), method.identifer(), generateDescriptor(method.parameters(), new VoidType()), null, null);
            }
        }
    }

    private void generateMethodCode(ClassWriter cw, List<TypedMethod> pMethods) {
        for (var method : pMethods) {
            //Initiate HashMap for local variables inside the method
            HashMap<String, Integer> locals = generateParameters(method.parameters());
            MethodVisitor methodVisitor = cw.visitMethod(generateAccessMod(method.accessModfier()), method.identifer(), generateDescriptor(method.parameters(), method.returnType()), null, null);
            methodVisitor.visitCode();
            generateBlock(cw, (TypedBlock) method.statement());
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

    private String generateDescriptor(List<TypedMethodParameter> parameters, IMethodType returnType) {
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
                typeString = "L";
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
        int counter = 1;
        for (var parameter : methodParameters) {
            parameters.put(parameter.identifier(), counter);
            counter++;
        }
        return parameters;
    }

    private void generateStatement(ClassWriter cw, ITypedStatement pStatement) {
        switch (pStatement) {
            case TypedBlock statement -> {
                generateBlock(cw, statement);
            }
            case TypedIfElseStatement statement -> {
                generateIfElse(cw, statement);
                System.out.println(statement);
            }
            case TypedReturnStatement statement -> {
                System.out.println(statement);
            }
            case TypedVarDeclarationStatement statement -> {
                System.out.println(statement);
            }
            case TypedWhileStatement statement -> {
                System.out.println(statement);
            }
            //StatementExpressions
            case TypedAssignStatementExpression statement -> {
                System.out.println(statement);
            }
            case TypedMethodCallStatementExpression statement -> {
                System.out.println(statement);
            }
            case TypedNewStatementExpression statement -> {
                System.out.println(statement);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pStatement);
        }
    }

    private void generateIfElse(ClassWriter cw, TypedIfElseStatement statement) {

    }

    private void generateBlock(ClassWriter cw, TypedBlock block) {
        for(var statement : block.statements()) {
            generateStatement(cw, statement);
        }
    }

    private void generateExpression(ITypedExpression pExpression) {
        switch (pExpression) {
            case TypedBinaryExpression expression -> {
                System.out.println(expression);
            }
            case TypedConstExpression expression -> {
                System.out.println(expression);
            }
            case TypedJNullExpression expression -> {
                System.out.println(expression);
            }
            case TypedSuperExpression expression -> {
                System.out.println(expression);
            }
            case TypedThisExpression expression -> {
                System.out.println(expression);
            }
            case TypedTypeExpression expression -> {
                System.out.println(expression);
            }
            case TypedUnaryExpression expression -> {
                System.out.println(expression);
            }
            //StatementExpressions
            case TypedInstVarStatementExpression expression -> {
                System.out.println(expression);
            }
            case TypedAssignStatementExpression statement -> {
                System.out.println(statement);
            }
            case TypedMethodCallStatementExpression statement -> {
                System.out.println(statement);
            }
            case TypedNewStatementExpression statement -> {
                System.out.println(statement);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pExpression);
        }
    }

}