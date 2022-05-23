package ParserTests;


import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import Parser.DataClasses.Common.Class;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithAssignMethod
{
    @Test
    public void ConstAssign() throws IOException
    {
        String src = "class MyClass { public void A() { int x; x = 9; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var asign =  new AssignStatementExpression(new LocalOrFieldVar("x"),new ConstExpression(9));

        Program ast = new Program(List.of(
            new Class("MyClass", new ArrayList<>(),List.of(
                    new Method(AccessModifiers.Public,"A",
                            new ArrayList<>(),
                            new VoidType(),
                            new Block(List.of(
                                    new VarDeclarationStatement("x", new IntType()),asign)))),
                    new ArrayList<>())));

        Assertions.assertEquals(syntaxTree, ast);
    }

    @Test
    public void MethodAssign() throws IOException
    {
        String src = "class MyClass { private int B() { return 5;} public void A() { int x; x = B(); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));



        var methodB = new Method(AccessModifiers.Private,"B",new ArrayList<>(),new IntType(),new Block(List.of(new ReturnStatement(new ConstExpression(5)))));
        var methodA =
                new Method(AccessModifiers.Public,"A",
                new ArrayList<>(),
                new VoidType(),
                new Block(List.of(new VarDeclarationStatement("x", new IntType()),new AssignStatementExpression(new LocalOrFieldVar("x"),new MethodCallStatementExpression("B",new ThisExpression(),new ArrayList<>())))));

        Assertions.assertEquals(syntaxTree,
                new Program(List.of(new Class("MyClass",
                        new ArrayList<>(),
                        List.of(methodB,methodA),
                        new ArrayList<>()))));
    }
}
