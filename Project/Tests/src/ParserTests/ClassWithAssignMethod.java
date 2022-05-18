package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Expressions.BinaryExpression;
import Expressions.ConstExpression;
import Expressions.LocalOrFieldVar;
import Method.Method;
import StatementExpression.AssignStatementExpression;
import Statements.VarDeclarationStatement;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.IntType;
import Types.VoidType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithAssignMethod
{
    @Test
    public void Test() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 9; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var asign =  new AssignStatementExpression(new LocalOrFieldVar("x"),new ConstExpression(9));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()),asign)))),
                        new ArrayList<>())))));
    }
}
