package ParserTests;

import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Method.Method;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Types.VoidType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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
