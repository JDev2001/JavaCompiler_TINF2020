package Tests.ParserTests;


import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Parser.DataClasses.Common.Class;
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
                        new ArrayList<>()))));
    }
}
