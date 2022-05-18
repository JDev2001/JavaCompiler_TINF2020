package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Expressions.InstVarStatementExpression;
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

public class ClassWithExpressionCalcMethod
{
    @Test
    public void Test() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 1+4 } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

//        Assertions.assertEquals(syntaxTree,new Program(List.of(
//                new Class("MyClass", new ArrayList<>(),List.of(
//                        new Method(AccessModifiers.Public,"A",
//                                new ArrayList<>(),
//                                new VoidType(),
//                                new Block(List.of(
//                                        new VarDeclarationStatement("x", new IntType(),
//                                                new AssignStatementExpression(null,null)))))),
//                        new ArrayList<>()))));
    }
}
