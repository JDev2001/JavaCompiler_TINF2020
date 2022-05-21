package SemanticCheckTests;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.Statements.IStatement;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.CustomType;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import SemanticCheck.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedThisExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedMethodCallStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatements.ITypedStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckMethodCall
{
     @Test
    public void TypeVoidMethodCall() throws Exception
    {
        //void A() { B(); }  int B() { return 5;}
        var methodA =  new Method(AccessModifiers.Public,"A",
                new ArrayList<>(),
                new VoidType(),
                new Block(List.of(new MethodCallStatementExpression("B", new ThisExpression(),new ArrayList<>()))));
        var methodB = new Method(AccessModifiers.Public, "B",new ArrayList<>(),new IntType(), new Block(List.of(new ReturnStatement(new ConstExpression(5)))));
        var untypedClass = new Class("MyClass",  new ArrayList<>(), List.of(methodA,methodB),new ArrayList<>());

        var checker = new SemantikCheckImpl();
        var typedClass = checker.semantikCheck(untypedClass);

        var blockStatement = typedClass.methods().stream().filter(x->x.identifer().equals("A")).findFirst().get().statement();

        var typedThisExpression = new TypedThisExpression(new CustomType("MyClass"));
        var typedMethodCall = new TypedMethodCallStatementExpression("A",typedThisExpression, new ArrayList<>(),new IntType());
        var expected = new TypedBlock(List.of(typedMethodCall),new IntType());
        Assertions.assertEquals(expected,blockStatement);
    }
}

