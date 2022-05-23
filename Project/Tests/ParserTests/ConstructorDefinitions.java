package ParserTests;

import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Method.MethodParameter;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.CustomType;
import Parser.DataClasses.Types.IntType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Types.VoidType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConstructorDefinitions
{
    @Test
    public void ConstructorWithoutParameters() throws IOException
    {

        String src = "class MyClass { protected MyClass() { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", List.of(
                        new Method(AccessModifiers.Protected,"MyClass",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(new ArrayList<>()))),
                        new ArrayList<>(),new ArrayList<>()))));
    }
    @Test
    public void ConstructorWithParameters() throws IOException
    {

        String src = "class MyClass { public MyClass(int i, MyType t, boolean b) { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        var parameters =  List.of(
                new MethodParameter("i", new IntType()),
                new MethodParameter("t", new CustomType("MyType")),
                new MethodParameter("b", new BoolType())
        );

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", List.of(
                        new Method(AccessModifiers.Public,"MyClass", parameters,
                                new VoidType(),
                                new Block(new ArrayList<>()))),
                        new ArrayList<>(),new ArrayList<>()))));
    }
}
