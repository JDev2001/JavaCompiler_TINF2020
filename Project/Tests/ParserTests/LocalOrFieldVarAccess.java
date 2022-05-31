package ParserTests;


import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Expressions.TypeExpression;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.CustomType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Types.IntType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalOrFieldVarAccess
{
    @Test
    public void Test() throws IOException
    {

        String src = "class MyClass { private int x; public int A() { return x; } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new IntType(),
                                new Block(List.of(new ReturnStatement(new LocalOrFieldVar("x")))))),
                        List.of(new Field("x", new IntType(),AccessModifiers.Private))))));
    }
}
