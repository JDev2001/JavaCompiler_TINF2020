package ParserTests;

import Common.AccessModifiers;
import Common.Class;
import Common.Program;
import Field.Field;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.BoolType;
import Types.IntType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassWithAttributes
{
    @Test
    public void Test() throws IOException {

        String src = "class MyClass { private int i; public boolean j; }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Program expected = new Program(List.of(new Class("MyClass",new ArrayList<>(),new ArrayList<>(),
                List.of(new Field("i", new IntType(), AccessModifiers.Private),
                        new Field("j", new BoolType(), AccessModifiers.Public)))));


        Assertions.assertEquals(syntaxTree, expected);
    }
}
