package Tests.ParserTests;


import DataClasses.Common.Program;
import DataClasses.Expressions.InstVarStatementExpression;
import DataClasses.Expressions.ThisExpression;
import DataClasses.Field.Field;
import DataClasses.Method.Method;
import DataClasses.Statements.ReturnStatement;
import DataClasses.Types.BoolType;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import DataClasses.Common.Class;
import DataClasses.Common.AccessModifiers;
import DataClasses.Common.Block;
import DataClasses.Common.Program;
import DataClasses.Expressions.ConstExpression;
import DataClasses.Expressions.LocalOrFieldVar;
import DataClasses.StatementExpression.AssignStatementExpression;
import DataClasses.Statements.VarDeclarationStatement;
import DataClasses.Types.IntType;
import DataClasses.Types.VoidType;
import Parser.SyntaxTreeGenerator.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ClassWithEmptyMethod
{
    @Test
    public void Test() throws IOException
    {

        String src = "class MyClass { public void A() { } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                new Method(AccessModifiers.Public,"A",
                        new ArrayList<>(),
                        new VoidType(),
                        new Block(new ArrayList<>()))),
                        new ArrayList<>()))));
    }
}
