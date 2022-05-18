package Tests.ParserTests;


import DataClasses.Common.Program;
import DataClasses.Expressions.*;
import DataClasses.Field.Field;
import DataClasses.Method.Method;
import DataClasses.Statements.ReturnStatement;
import DataClasses.Types.BoolType;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import DataClasses.Common.AccessModifiers;
import DataClasses.Common.Block;
import DataClasses.Common.Program;
import DataClasses.StatementExpression.AssignStatementExpression;
import DataClasses.Statements.VarDeclarationStatement;
import DataClasses.Types.IntType;
import DataClasses.Types.VoidType;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ClassWithExpressionCalcMethod
{
    @Test
    public void TestPlus() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1+4; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var assign =  new AssignStatementExpression(new LocalOrFieldVar("x"),
                new BinaryExpression(new ConstExpression(1), new ConstExpression(4), "+"));
        /*
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
                new BinaryExpression(new ConstExpression(1),
                        new BinaryExpression(new ConstExpression(4), new ConstExpression(2),"*"),
                        "/"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),assign)))),
                        new ArrayList<>()))));


         */
    }
}
