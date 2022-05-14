package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Method.Method;
import Method.MethodParameter;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.IntType;
import Types.VoidType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithEmptyMethod
{
    @Test
    public void Test() throws IOException {

        String src = "class MyClass { public void A(int x) { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        var emptyClass = syntaxTree.getClasses().get(0);

        Assertions.assertEquals(emptyClass,
                new Class("MyClass", List.of(
                new Method(AccessModifiers.Public,"A",
                        List.of(new MethodParameter("x", new IntType())),
                        new VoidType(),
                        new Block(new ArrayList<>()))),
                        new ArrayList<>()));
    }
}
