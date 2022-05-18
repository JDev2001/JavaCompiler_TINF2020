package Tests.ParserTests;


import DataClasses.Common.Program;
import DataClasses.Expressions.*;
import DataClasses.Field.Field;
import DataClasses.Method.Method;
import DataClasses.Statements.IfElseStatement;
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
import DataClasses.Common.Class;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IfElse
{
    @Test
    public void TestSimple() throws IOException {

        String src = "class MyClass { public void A() { if(true) {} else {} } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        var block = new Block(List.of(new IfElseStatement(new ConstExpression(true), new Block(new ArrayList<>()), new Block(new ArrayList<>()))));

        var program = new Program(List.of(
                new Class("MyClass",  new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(), block)),
                        new ArrayList<>())));

        Assertions.assertEquals(syntaxTree,program);
    }
    @Test
    public void Test() throws IOException
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
}
