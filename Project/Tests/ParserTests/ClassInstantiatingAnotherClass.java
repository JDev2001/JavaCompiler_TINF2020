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
import Parser.DataClasses.StatementExpression.NewStatementExpression;
import Parser.DataClasses.Types.CustomType;
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

public class ClassInstantiatingAnotherClass
{
    @Test
    public void SimpleInstantiating() throws IOException
    {

        String src = "class MyClass { public MyClass() { new A(); } } class A {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var constructorCall = new NewStatementExpression(new MethodCallStatementExpression("A", new ThisExpression(),new ArrayList<>()),new CustomType("A"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"MyClass",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(constructorCall)))), new ArrayList<>()),
                new Class("A",new ArrayList<>(),new ArrayList<>(),new ArrayList<>())))
        );
    }
    @Test
    public void InstantiatingWithParameter() throws IOException
    {

        String src = "class MyClass { public MyClass() { new A(9); } } class A {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var constructorCall = new NewStatementExpression(new MethodCallStatementExpression("A", new ThisExpression(),List.of(new ConstExpression(9))),new CustomType("A"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"MyClass",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(constructorCall)))), new ArrayList<>()),
                new Class("A",new ArrayList<>(),new ArrayList<>(),new ArrayList<>())))
        );
    }
    @Test
    public void InstantiatingWithAssignment() throws IOException
    {

        String src = "class MyClass { public MyClass() { x =  new A(); } } class A {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var constructorCall = new NewStatementExpression(new MethodCallStatementExpression("A", new ThisExpression(),new ArrayList<>()),new CustomType("A"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"MyClass",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(new AssignStatementExpression(new LocalOrFieldVar("x"),constructorCall))))), new ArrayList<>()),
                new Class("A",new ArrayList<>(),new ArrayList<>(),new ArrayList<>())))
        );
    }
}
