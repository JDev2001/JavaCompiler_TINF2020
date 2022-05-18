import Common.AccessModifiers;
import Common.Class;
import Common.Program;
import Field.Field;
import Method.*;
import Types.*;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import typedExpressions.*;
import typedStatements.*;
import typedStatementExpression.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import static Common.AccessModifiers.*;

public class BytecodeGenerator {
    private static Program aProgram;
    private ClassWriter cw;
    private MethodVisitor methodVisitor;
    private FieldVisitor fieldVisitor;

    public BytecodeGenerator(Program pProgram) {
        aProgram = pProgram;
        System.out.println(pProgram);
    }

    public void genCode() {
        var classList = aProgram.getClasses();
        for (Class pClass : classList) {
            generateClassCode(pClass);
        }
    }

    private byte[] generateClassCode(Class pClass) {
        //Initiate class
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        HashMap<String, Integer> fieldNames = new HashMap<String, Integer>();
        MethodVisitor methodVisitor;
        FieldVisitor fieldVisitor;
        //V18 for Java Version
        cw.visit(Opcodes.V18, Opcodes.ACC_SUPER, pClass.identifier(), null, "java/lang/Object", null);

        //visit Fields first
        generateFieldCode(pClass.fields(), fieldNames);

        //visit Constructors
        generateConstructors(cw, pClass.constructors());

        //visit Methods next

        //Close classwriter
        cw.visitEnd();
        var classBytecode = cw.toByteArray();
        return classBytecode;
    }

    private void generateFieldCode(List<Field> pField, HashMap<String, Integer> fieldNames) {
        for (Field field : pField) {
            int accessmod = -1;
            fieldNames.put(field.name(), fieldNames.size()+1);
            String descriptor;
            // Extract access modifier
            switch (field.accessModifiers()) {
                case Public:
                    accessmod = Opcodes.ACC_PUBLIC;
                    break;
                case Private:
                    accessmod = Opcodes.ACC_PRIVATE;
                    break;
                case Protected:
                    accessmod = Opcodes.ACC_PROTECTED;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + field.type());
            }
            // extract field type
            switch (field.type()) {
                case BoolType type -> {
                    descriptor = "B";
                }
                case IntType type -> {
                    descriptor = "I";
                }
                case CharType type -> {
                    descriptor = "C";
                }
                case CustomType type -> {
                    descriptor = "L" + type.getName();
                }
                default -> throw new IllegalStateException("Unexpected value: " + field.type());
            }

            fieldVisitor = cw.visitField(accessmod, field.name(), descriptor, null, null);
            fieldVisitor.visitEnd();
        }
    }

    private void generateConstructors(ClassWriter cw, List<Method> pConstructors) {
        if (pConstructors.isEmpty()) {
            //No constructors means standard constructor
            generateStandardConstructor(cw);
        } else {
            //TODO
            for (Method pMethod : pConstructors) {
                HashMap<String, Integer> variables = addParameters(pMethod.parameters());
            }
        }
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

    private void generateStatements(ITypedStatement pStatement) {
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
            case TypedCompareExpression expression -> {
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

    private void generateStatementExpressions(ITypedStatementExpression pStatementExpression) {
        switch (pStatementExpression) {
            case TypedAssignStatementExpression statement -> {
                System.out.println(statement);
            }
            case TypedMethodCallStatementExpression statement -> {
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