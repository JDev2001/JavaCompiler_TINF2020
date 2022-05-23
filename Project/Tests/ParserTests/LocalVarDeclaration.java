package ParserTests;


import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Statements.IStatement;
import Parser.DataClasses.Types.*;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Parser.DataClasses.Common.Class;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalVarDeclaration
{
    @Test
    public void DeclareInteger() throws IOException
    {
        String src = "class MyClass { public void A() { int x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new IntType()))))),
                        new ArrayList<>()))));
    }
    @Test
    public void DeclareBoolean() throws IOException
    {
        String src = "class MyClass { public void A() { boolean x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new BoolType()))))),
                        new ArrayList<>()))));
    }
    @Test
    public void DeclareObject() throws IOException
    {
        String src = "class MyClass { public void A() { Object x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x", new CustomType("Object")))))),
                        new ArrayList<>()))));
    }
    @Test
    public void DeclareCharacter() throws IOException
    {
        String src = "class MyClass { public void A() { char x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x",new CharType()))))),
                        new ArrayList<>()))));
    }
    @Test
    public void DeclareCustomType() throws IOException
    {
        String src = "class MyClass { public void A() { MyType x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(
                                        new VarDeclarationStatement("x",new CustomType("MyType")))))),
                        new ArrayList<>()))));
    }
    @Test
    public void MixedLocalVarDeclaration() throws IOException
    {
        String src = "class MyClass { public void A() { MyType x; int y; boolean b; char c; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        List<IStatement> declarations =  List.of(
                new VarDeclarationStatement("x",new CustomType("MyType")),
                new VarDeclarationStatement("y",new IntType()),
                new VarDeclarationStatement("b",new BoolType()),
                new VarDeclarationStatement("c",new CharType())
        );

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", new ArrayList<>(),List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(declarations))),
                        new ArrayList<>()))));
    }
}
