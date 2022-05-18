package ParserTests;
import Common.Class;
import Common.Program;

import SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import java.io.IOException;
import java.util.ArrayList;

public class EmptyClass {

    @Test
    public void Test() throws IOException {

        String src = "class Empty {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        var emptyClass = syntaxTree.classes().get(0);

        Assertions.assertEquals(emptyClass, new Class("Empty",new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));
    }
}
