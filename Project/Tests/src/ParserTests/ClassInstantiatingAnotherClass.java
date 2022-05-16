package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Expressions.ThisExpression;
import Method.Method;
import StatementExpression.MethodCallStatementExpression;
import StatementExpression.NewStatementExpression;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.CustomType;
import Types.VoidType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassInstantiatingAnotherClass
{
    @Test
    public void Test() throws IOException
    {

        String src = "class MyClass { public MyClass() { new A(); } } class A {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var constructorCall = new NewStatementExpression(new MethodCallStatementExpression("A", new ThisExpression(),new ArrayList<>()),new CustomType("A"));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", List.of(
                        new Method(AccessModifiers.Public,"MyClass",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(constructorCall)))), new ArrayList<>()),
                new Class("A",new ArrayList<>(),new ArrayList<>())))
        );
    }
}
