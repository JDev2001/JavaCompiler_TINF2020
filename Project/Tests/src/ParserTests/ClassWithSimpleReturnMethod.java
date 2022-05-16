package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Expressions.ConstExpression;
import Method.Method;
import Statements.ReturnStatement;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.BoolType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithSimpleReturnMethod
{
    @Test
    public void Test() throws IOException {

        String src = "class MyClass { public bool A() { return false } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", List.of(
                new Method(AccessModifiers.Public,"A", new ArrayList<>(),
                        new BoolType(),
                        new Block(List.of(new ReturnStatement(new ConstExpression(false)))))),
                        new ArrayList<>()))));
    }
}
