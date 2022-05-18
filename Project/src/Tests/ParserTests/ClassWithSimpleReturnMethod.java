package ParserTests;


import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.BoolType;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Expressions.ConstExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Parser.DataClasses.Common.Class;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithSimpleReturnMethod
{
    @Test
    public void Test() throws IOException
    {

        String src = "class MyClass { public bool A() { return false } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",new ArrayList<>(), List.of(
                new Method(AccessModifiers.Public,"A", new ArrayList<>(),
                        new BoolType(),
                        new Block(List.of(new ReturnStatement(new ConstExpression(false)))))),
                        new ArrayList<>()))));
    }
}
