package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Expressions.BinaryExpression;
import Expressions.ConstExpression;
import Method.Method;
import Statements.IfElseStatement;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.VoidType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
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
    public void Test() throws IOException {

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
