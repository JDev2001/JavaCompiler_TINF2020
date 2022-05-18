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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithAttributeAccessMethod
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
                                new BoolType(),
                                new Block(List.of(new ReturnStatement(new InstVarStatementExpression("x", new ThisExpression())))))),
                        List.of(new Field("x", new IntType(),AccessModifiers.Private))))));
    }
}
