package ParserTests;


import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.BooleanExpression;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.Statements.IfElseStatement;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Types.VoidType;
import Parser.DataClasses.Common.Class;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IfElse
{
    @Test
    public void SimpleIfWithConstCondition() throws IOException {

        String src = "class MyClass { public void A() { if(true) {} else {} } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        var block = new Block(List.of(new IfElseStatement(new BooleanExpression(true), new Block(new ArrayList<>()), new Block(new ArrayList<>()))));

        var program = new Program(List.of(
                new Class("MyClass",  new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(), block)),
                        new ArrayList<>())));

        Assertions.assertEquals(syntaxTree,program);
    }
    @Test
    public void SimpleIfWithExpressionCondition() throws IOException
    {

        String src = "class MyClass { public void A() { if(5>3) {} else {} } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        var block = new Block(List.of(new IfElseStatement(new BinaryExpression(new ConstExpression(5),new ConstExpression(3),">"), new Block(new ArrayList<>()), new Block(new ArrayList<>()))));

        var program = new Program(List.of(
                new Class("MyClass",  new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(), block)),
                        new ArrayList<>())));

        Assertions.assertEquals(syntaxTree,program);
    }
    @Test
    public void SimpleIfWithMethodCallCondition() throws IOException
    {

        String src = "class MyClass { public void A() { if(foo()) {} else {} } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        var block = new Block(List.of(new IfElseStatement(new MethodCallStatementExpression("foo",new ThisExpression(),new ArrayList<>()), new Block(new ArrayList<>()), new Block(new ArrayList<>()))));

        var program = new Program(List.of(
                new Class("MyClass",  new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(), block)),
                        new ArrayList<>())));

        Assertions.assertEquals(syntaxTree,program);
    }
    @Test
    public void NeastedIf() throws IOException
    {

        String src = "class MyClass { public void A() { if(5>3) {} else {  if(5>3) {} else { } } } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);
        var innerblock = new Block(List.of(new IfElseStatement(new BinaryExpression(new ConstExpression(5),new ConstExpression(3),">"), new Block(new ArrayList<>()), new Block(new ArrayList<>()))));

        var block = new Block(List.of(new IfElseStatement(new BinaryExpression(new ConstExpression(5),new ConstExpression(3),">"), new Block(new ArrayList<>()), innerblock)));

        var program = new Program(List.of(
                new Class("MyClass",  new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(), block)),
                        new ArrayList<>())));

        Assertions.assertEquals(syntaxTree,program);
    }
}
