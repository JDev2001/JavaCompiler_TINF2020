package CodeGenerator;

import DataClasses.Common.AccessModifiers;
import DataClasses.Common.Class;
import DataClasses.Common.Program;
import DataClasses.Field.Field;
import DataClasses.Method.Method;
import DataClasses.Method.MethodParameter;
import DataClasses.Types.*;
import TypedDataClasses.typedExpressions.*;
import TypedDataClasses.typedStatementExpression.ITypedStatementExpression;
import TypedDataClasses.typedStatementExpression.TypedAssignStatementExpression;
import TypedDataClasses.typedStatementExpression.TypedMethodCallStatementExpression;
import TypedDataClasses.typedStatementExpression.TypedNewStatementExpression;
import TypedDataClasses.typedStatements.*;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.HashMap;
import java.util.List;

public class BytecodeGenerator {
    private static Program aProgram;
    private ClassWriter cw;
    private MethodVisitor methodVisitor;
    private FieldVisitor fieldVisitor;

    public BytecodeGenerator(Program pProgram) {
        aProgram = pProgram;
        System.out.println(pProgram);
    }

    public HashMap<String, byte[]> genCode() {
        var classList = aProgram.classes();
        HashMap<String, byte[]> allClasses = new HashMap<String, byte[]>();
        for (Class pClass : classList) {
            allClasses.put(pClass.identifier(),generateClassCode(pClass));
        }
        return allClasses;
    }

    private byte[] generateClassCode(Class pClass) {
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

    private void generateConstructors(ClassWriter cw, List<Method> pConstructors) {
        if (pConstructors.isEmpty()) {
            //No constructors means standard constructor
            generateStandardConstructor(cw);
        } else {
            //TODO
            for (Method pMethod : pConstructors) {
                HashMap<String, Integer> locals = addParameters(pMethod.parameters());
                generateDescriptor(pMethod.parameters(), new VoidType());
            }
        }
    }

    private String generateDescriptor(List<MethodParameter> parameters, IMethodType returnType) {
        String descriptor = "(";
        for(var parameter : parameters) {
            descriptor = descriptor + generateTypeString(parameter.type());
            }
        descriptor = descriptor + ")" + generateTypeString(returnType);
        return descriptor;
    }

    private String generateTypeString(IMethodType returnType) {
    String typestring;
        switch (returnType) {
            case BoolType type -> {
                typestring = "B";
            }
            case IntType type -> {
                typestring = "I";
            }
            case CharType type -> {
                typestring = "C";
            }
            case CustomType type -> {
                typestring = "L";
            }
            case VoidType type -> {
                typestring = "V";
            }
            default -> throw new IllegalStateException("Unexpected value: " + returnType);
        }
        return typestring;
}

    private void generateStandardConstructor(ClassWriter cw) {
        methodVisitor = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        //Initialize fields

        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(0, 0);
        methodVisitor.visitEnd();
    }

    private HashMap<String, Integer> addParameters(List<MethodParameter> methodParameters) {
        HashMap<String,Integer> parameters = new HashMap<String, Integer>();
        for (var parameter : methodParameters) {
            parameters.put(parameter.identifier(), parameters.size()+1);
        }
        return parameters;
    }

    private void generateMethodCode(Method pMethod, ClassWriter cw) {

    }

    private void generateStatement(ITypedStatement pStatement) {
        switch (pStatement) {
            case TypedIfElseStatement statement -> {
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
            default -> throw new IllegalStateException("Unexpected value: " + pStatement);
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
            case TypedInstVarStatementExpression expression -> {
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
            default -> throw new IllegalStateException("Unexpected value: " + pExpression);
        }
    }

    private void generateStatementExpression(ITypedStatementExpression pStatementExpression) {
        switch (pStatementExpression) {
            case TypedAssignStatementExpression statement -> {
                System.out.println(statement);
            }
            case    TypedMethodCallStatementExpression statement -> {
                System.out.println(statement);
            }
            case TypedNewStatementExpression statement -> {
                System.out.println(statement);
            }
            default -> {

            }
        }
    }
}