package SemanticCheckTests;

import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.IntType;
import SemanticCheck.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedBinaryExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedConstExpression;
import SemanticCheck.TypedDataClasses.typedStatements.TypedReturnStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckExpression
{
    @Test
    public void TestSimpleExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),new ConstExpression(5), "+");

        var typedExpression = checker.semantikCheck(expression);

        var expectedBinaryExpression = new TypedBinaryExpression(
                new TypedConstExpression(4,new IntType()),
                new TypedConstExpression(5, new IntType()),
                "+",new IntType());
        Assertions.assertEquals(expectedBinaryExpression,typedExpression);
    }
    @Test
    public void MixedInvalidSimpleExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),new ConstExpression(false), "+");

        var typedExpression = checker.semantikCheck(expression);

        var expectedExpression = new TypedBinaryExpression(
                new TypedConstExpression(4,new IntType()),
                new TypedConstExpression(5, new IntType()),
                "+",new IntType());

        Assertions.assertEquals(expectedExpression,typedExpression);
    }


    @Test
    public void TestExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),
                new BinaryExpression(new ConstExpression(7),new ConstExpression(9), "-"),"*");

        var typedExpression = checker.semantikCheck(expression);


        var expected = new TypedBinaryExpression(new TypedConstExpression(4, new IntType()),
                new TypedBinaryExpression(new TypedConstExpression(7, new IntType()),new TypedConstExpression(9, new IntType()),
                        "-", new IntType()),"*", new IntType());
        Assertions.assertEquals(expected,typedExpression);
    }
    @Test
    public void MixedTestExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(false),
                new BinaryExpression(new ConstExpression(7),new ConstExpression('c'), "-"),"*");

        try
        {
            var typedExpression = checker.semantikCheck(expression);
            Assertions.fail();
        }
        catch (Exception e)
        {
            Assertions.assertTrue(true);
        }

    }
}
