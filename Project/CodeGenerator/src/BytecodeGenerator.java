import Common.Class;
import Common.Program;
import Field.Field;
import Method.Method;
import org.objectweb.asm.ClassWriter;
import typedMethod.TypedMethod;
import typedStatementExpression.ITypedStatementExpression;
import typedStatementExpression.TypedAssignStatementExpression;
import typedStatementExpression.TypedMethodCallStatementExpression;
import typedStatementExpression.TypedNewStatementExpression;
import typedStatements.ITypedStatement;
import typedStatements.*;

public class BytecodeGenerator {
    private Program aProgram;

    public BytecodeGenerator(Program pProgram) {
        aProgram = pProgram;
        System.out.println("Help");
    }

    public void genCode() {
        var classList = aProgram.getClasses();
        for (Class pClass : classList) {
            generateClassCode(pClass);
        }
    }
    private void generateClassCode(Class pClass) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

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

    private void generateStatementExpressions(ITypedStatementExpression pStatement) {
        switch (pStatement) {
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
