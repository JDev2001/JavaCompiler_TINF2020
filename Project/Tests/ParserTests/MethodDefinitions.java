package ParserTests;


import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.BooleanExpression;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Method.MethodParameter;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.CharType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Parser.DataClasses.Common.Class;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MethodDefinitions
{
    @Test
    public void EmptyMethod() throws IOException
    {

        String src = "class MyClass { public void A() { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(new ArrayList<>()))),
                        new ArrayList<>()))));
    }
    @Test
    public void EmptyMethodWithParameter() throws IOException
    {

        String src = "class MyClass { public void A(int x, boolean b, char c) { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                new Method(AccessModifiers.Public,"A",
                        List.of(
                                new MethodParameter("x", new IntType()),
                                new MethodParameter("b", new BoolType()),
                                new MethodParameter("c", new CharType())
                        ),
                        new VoidType(),
                        new Block(new ArrayList<>()))),
                        new ArrayList<>()))));
    }
    @Test
    public void MethodReturningExpression() throws IOException
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
    @Test
    public void ReturnConstBool() throws IOException
    {

        String src = "class MyClass { public bool A() { return false; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A", new ArrayList<>(),
                                new BoolType(),
                                new Block(List.of(new ReturnStatement(new BooleanExpression(false)))))),
                        new ArrayList<>()))));
    }
}
