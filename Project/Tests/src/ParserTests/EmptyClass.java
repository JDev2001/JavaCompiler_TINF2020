package ParserTests;
import Common.Program;
import com.company.common.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;

public class EmptyClass {
    @Test
    public void Test()
    {
        String src = "public class Empty {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(new ANTLRInputStream(src));
        var emptyClass = syntaxTree.getClasses().get(0);
        Assertions.assertSame("Empty", emptyClass.getIdentifier());
    }
}
