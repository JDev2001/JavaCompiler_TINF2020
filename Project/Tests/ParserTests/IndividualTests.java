package ParserTests;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.Types.VoidType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//This class is for debugging reasons
public class IndividualTests {

    @Test
    public void ExtendedMethodCall() throws IOException
    {

        String src = "class MyClass { public void A() { A().B(); } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);

        Assertions.assertEquals(syntaxTree,new Program(List.of(
                new Class("MyClass",  new ArrayList<>(), List.of(
                        new Method(AccessModifiers.Public,"A",
                                new ArrayList<>(),
                                new VoidType(),
                                new Block(List.of(new MethodCallStatementExpression("B",
                                        new MethodCallStatementExpression("A", new ThisExpression(), new ArrayList<>()),new ArrayList<>()))))),
                        new ArrayList<>()))));
    }

    @Test
    public void TestNegativeConst() throws IOException
    {
        String src = "public class MyClass {  public MyClass() { i = -1;} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        Assertions.assertNotNull(syntaxTree);
    }
}
