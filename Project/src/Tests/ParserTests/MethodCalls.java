package ParserTests;


import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.Types.VoidType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MethodCalls
{
    @Test
    public void SimpleMethodCall() throws IOException
    {

        String src = "class MyClass { public void A() { B(); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                new Method(AccessModifiers.Public,"A",
                        new ArrayList<>(),
                        new VoidType(),
                        new Block(List.of(new MethodCallStatementExpression("B", new ThisExpression(),new ArrayList<>()))))),
                        new ArrayList<>()))));
    }
    @Test
    public void SimpleMethodCallWithThis() throws IOException
    {

        String src = "class MyClass { public void A() { this.B(); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(new MethodCallStatementExpression("B", new ThisExpression(),new ArrayList<>()))))),
                        new ArrayList<>()))));
    }

    @Test
    public void MethodWithConstParameters() throws IOException
    {

        String src = "class MyClass { public void A() { B(5,'c',false); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(new MethodCallStatementExpression("B", new ThisExpression(),
                                        List.of(new ConstExpression(5), new ConstExpression('c'), new ConstExpression(false) )))))),
                        new ArrayList<>()))));
    }
    @Test
    public void MethodWithExpressionParameters() throws IOException
    {

        String src = "class MyClass { public void A() { B(5,this.C()); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(new MethodCallStatementExpression("B", new ThisExpression(),
                                        List.of(new ConstExpression(5),new MethodCallStatementExpression("C", new ThisExpression(), new ArrayList<>()))))))),
                        new ArrayList<>()))));
    }

    @Test
    public void MethodOnTarget() throws IOException
    {

        String src = "class MyClass { public void A() { a.Foo(false); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        var block =  new Block(List.of(new MethodCallStatementExpression("Foo", new LocalOrFieldVar("a"), List.of(new ConstExpression(false)))));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),block)), new ArrayList<>()))));
    }

    @Test
    public void ComplexMethodCallMixedUp() throws IOException
    {

        String src = "class MyClass { public void A() { a.Foo(this.X(false)); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(new MethodCallStatementExpression("a", new LocalOrFieldVar("a"),
                                        List.of(new MethodCallStatementExpression("X", new ThisExpression(), List.of(new ConstExpression(false))))))))),
                        new ArrayList<>()))));
    }

}
