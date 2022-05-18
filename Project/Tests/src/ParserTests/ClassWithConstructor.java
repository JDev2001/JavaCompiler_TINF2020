package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Method.Method;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.VoidType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithConstructor
{
    @Test
    public void Test() throws IOException
    {

        String src = "class MyClass { protected MyClass() { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", List.of(
                        new Method(AccessModifiers.Protected,"MyClass",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(new ArrayList<>()))),
                        new ArrayList<>(),new ArrayList<>()))));
    }
}
