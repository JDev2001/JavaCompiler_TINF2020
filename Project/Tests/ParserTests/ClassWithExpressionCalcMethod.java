package ParserTests;


import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import Parser.DataClasses.Common.Class;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithExpressionCalcMethod
{
    @Test
    public void TestPlus() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1+4; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var assign =  new AssignStatementExpression(new LocalOrFieldVar("x"),
                new BinaryExpression(new ConstExpression(1), new ConstExpression(4), "+"));
        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),assign)))),
                        new ArrayList<>()))));
    }
    @Test
    public void TestMinus() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1-4; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var assign =  new AssignStatementExpression(new LocalOrFieldVar("x"),
                new BinaryExpression(new ConstExpression(1),
                        new ConstExpression(4), "-"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),assign)))),
                        new ArrayList<>()))));
    }
    @Test
    public void TestMul() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1*4; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var assign =  new AssignStatementExpression(new LocalOrFieldVar("x"),
                new BinaryExpression(new ConstExpression(1),
                        new ConstExpression(4), "*"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),assign)))),
                        new ArrayList<>()))));
    }
    @Test
    public void TestDiv() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1/4; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var assign =  new AssignStatementExpression(new LocalOrFieldVar("x"),
                new BinaryExpression(new ConstExpression(1),
                        new ConstExpression(4), "/"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),assign)))),
                        new ArrayList<>()))));
    }

    @Test
    public void TestComplex() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1/4*2; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var assign =  new AssignStatementExpression(new LocalOrFieldVar("x"),
                new BinaryExpression(
                        new BinaryExpression(new ConstExpression(1),
                                new ConstExpression(4), "/"),
                        new ConstExpression(2), "*"));

        Program ast = new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),assign)))),
                        new ArrayList<>())));

        Assertions.assertEquals(syntaxTree, ast);
    }
}
