package ParserTests;


import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Method.Method;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Parser.DataClasses.Common.Class;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithLocalVarDecMethod
{
    @Test
    public void Test() throws IOException
    {
        String src = "class MyClass { public void A() { int x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()))))),
                        new ArrayList<>()))));
    }
}
