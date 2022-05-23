package SemanticCheckTests;

import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.IntType;
import SemanticCheck.Factory.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedBinaryExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedConstExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckBinaryExpression
{
    @Test
    public void TestAddExpression() throws Exception
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
    public void TestMinusExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),new ConstExpression(5), "-");

        var typedExpression = checker.semantikCheck(expression);

        var expectedBinaryExpression = new TypedBinaryExpression(
                new TypedConstExpression(4,new IntType()),
                new TypedConstExpression(5, new IntType()),
                "-",new IntType());
        Assertions.assertEquals(expectedBinaryExpression,typedExpression);
    }
    @Test
    public void TestMulExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),new ConstExpression(5), "*");

        var typedExpression = checker.semantikCheck(expression);

        var expectedBinaryExpression = new TypedBinaryExpression(
                new TypedConstExpression(4,new IntType()),
                new TypedConstExpression(5, new IntType()),
                "*",new IntType());
        Assertions.assertEquals(expectedBinaryExpression,typedExpression);
    }
    @Test
    public void TestDivExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),new ConstExpression(5), "/");

        var typedExpression = checker.semantikCheck(expression);

        var expectedBinaryExpression = new TypedBinaryExpression(
                new TypedConstExpression(4,new IntType()),
                new TypedConstExpression(5, new IntType()),
                "/",new IntType());
        Assertions.assertEquals(expectedBinaryExpression,typedExpression);
    }

    @Test
    public void TestAndExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(false),new ConstExpression(true), "&");

        var typedExpression = checker.semantikCheck(expression);

        var expectedBinaryExpression = new TypedBinaryExpression(
                new TypedConstExpression(false,new BoolType()),
                new TypedConstExpression(true, new BoolType()),
                "&",new BoolType());
        Assertions.assertEquals(expectedBinaryExpression,typedExpression);
    }
    @Test
    public void TestOrExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(false),new ConstExpression(true), "|");

        var typedExpression = checker.semantikCheck(expression);

        var expectedBinaryExpression = new TypedBinaryExpression(
                new TypedConstExpression(false,new BoolType()),
                new TypedConstExpression(true, new BoolType()),
                "|",new BoolType());
        Assertions.assertEquals(expectedBinaryExpression,typedExpression);
    }
    @Test
    public void InvalidLogicalExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(5),new ConstExpression(true), "|");

        try{
            var typedExpression = checker.semantikCheck(expression);
            Assertions.fail();
        }
        catch (Exception e)
        {
            Assertions.assertTrue(true);
        }

    }
    @Test
    public void MixedInvalidSimpleExpression() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var expression = new BinaryExpression(new ConstExpression(4),new ConstExpression(false), "+");
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
