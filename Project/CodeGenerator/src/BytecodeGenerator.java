import Common.Class;
import Common.Program;
import Field.Field;
import Method.Method;
import StatementExpression.IStatementExpression;
import Statements.IStatement;
import org.objectweb.asm.ClassWriter;
import typedStatements.TypedIfElseStatement;
import typedStatements.TypedBaseObject;

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

    private void generateStatements(TypedBaseObject pStatement) {
        switch (pStatement) {
            case TypedIfElseStatement statement -> {

                System.out.println("Typed");
            }
            default -> {

            }
        }
    }

    private void generateStatementExpressions() {

    }
}
