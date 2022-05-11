package ParserTests;
import Common.Program;

import SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class EmptyClass {
    @Test
    public void Test() throws IOException {

        String src = "class Empty {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        var emptyClass = syntaxTree.getClasses().get(0);

        Assertions.assertEquals("Empty", emptyClass.getIdentifier());
    }
}
