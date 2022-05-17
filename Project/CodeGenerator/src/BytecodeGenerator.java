import Common.Class;
import Common.Program;
import Field.Field;
import Method.Method;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import typedExpressions.*;
import typedStatements.*;
import typedStatementExpression.*;

public class BytecodeGenerator {
    private static Program aProgram;

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
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        //visit Constructor method
        //visit Fields next
        //visit Methods next
        cw.visitEnd();
        var classBytecode = cw.toByteArray();
        return classBytecode;
    }

    private void generateMethodCode(Method pMethod, ClassWriter cw) {

    }

    private void generateFieldCode(Field pField) {

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
            default -> {

            }
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
            default -> {

            }
        }
    }
}