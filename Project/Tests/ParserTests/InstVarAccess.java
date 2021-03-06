package ParserTests;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.StatementExpression.InstVarStatementExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.Types.VoidType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstVarAccess
    {  @Test
        public void Test() throws IOException
        {

            String src = "class MyClass { public MyClass() { myInstance.attr = 5; } }";
            Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

            var block = new Block(List.of(new AssignStatementExpression(new InstVarStatementExpression("attr", new LocalOrFieldVar("myInstance")), new ConstExpression(5))));
            Assertions.assertEquals(syntaxTree,new Program(List.of(
                    new Class("MyClass", List.of(
                            new Method(AccessModifiers.Public,"MyClass",
                                    new ArrayList<>(),
                                    new VoidType(), block)), new ArrayList<>(), new ArrayList<>()))));
        }
}
