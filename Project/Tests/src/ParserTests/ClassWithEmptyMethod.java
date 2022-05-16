package ParserTests;

import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Method.Method;
import Statements.IStatement;
import SyntaxTreeGenerator.SyntaxTreeGenerator;
import Types.VoidType;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassWithEmptyMethod
{
    @Test
    public void Test() throws IOException {

        String src = "class MyClass { public void A() { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        //Felix Debugging
        Program expextedResult1 = new Program(List.of(
                                    new Class(
                                            "MyClass",
                                            List.of(new Method(
                                                    AccessModifiers.Public,
                                                    "A",
                                                    new ArrayList<>(),
                                                    new VoidType(),
                                                    new Block(new ArrayList<>()))),
                                            new ArrayList<>())));

        //Felix Debugging
        List<Method> method = new ArrayList<>();
        method.add(new Method(
                        AccessModifiers.Public,
                        "A",
                        new ArrayList<>(),
                        new VoidType(),
                        new Block(new ArrayList<>())));

        List<Class> myClass = new ArrayList<>();
        myClass.add(new Class("MyClass", method, new ArrayList<>()));
        Program expextedResult2 = new Program(myClass);

        /*
        Jona seins

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass", List.of(
                new Method(AccessModifiers.Public,"A",
                        new ArrayList<>(),
                        new VoidType(),
                        new Block(new ArrayList<>()))),
                        new ArrayList<>()))));
         */

        System.out.println("Debug_1");

        Assertions.assertEquals(syntaxTree, expextedResult2);
    }
}
