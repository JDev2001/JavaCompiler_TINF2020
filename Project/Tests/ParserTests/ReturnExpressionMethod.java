package ParserTests;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.IntType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReturnExpressionMethod
{    @Test
    public void Test() throws IOException
    {

        String src = "class MyClass { public int A() { return 1+1+1; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A", new ArrayList<>(),
                                new IntType(),
                                new Block(List.of(new ReturnStatement(new BinaryExpression(new BinaryExpression(new ConstExpression(1),new ConstExpression(1),"+"), new ConstExpression(1),"+")))))),
                        new ArrayList<>()))));
    }
}
