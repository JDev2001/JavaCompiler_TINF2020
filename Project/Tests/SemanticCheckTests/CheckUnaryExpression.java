package SemanticCheckTests;

import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Expressions.UnaryExpression;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.IntType;
import SemanticCheck.Factory.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedConstExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedUnaryExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckUnaryExpression
{
    @Test
    public void UnaryInt() throws Exception
    {
        var untypedUnaryExp = new UnaryExpression(new ConstExpression(5), "-");
        var checker = new SemantikCheckImpl();
        var typedUnaryExpression = checker.semantikCheck(untypedUnaryExp);

        var expected = new TypedUnaryExpression(new TypedConstExpression(5, new IntType()), "-", new IntType());

        Assertions.assertEquals(expected, typedUnaryExpression);
    }
    @Test
    public void UnaryChar() throws Exception
    {
        var untypedUnaryExp = new UnaryExpression(new ConstExpression('c'), "-");
        var checker = new SemantikCheckImpl();
        try
        {
            var typedUnaryExpression = checker.semantikCheck(untypedUnaryExp);
            Assertions.fail();
        }
        catch (Exception e)
        {
            //Muss failen, weil Char keine Unary Operationen erlaubt
            Assertions.assertTrue(true);
        }

    }
  
    @Test
    public void UnaryBool() throws Exception
    {
        var untypedUnaryExp = new UnaryExpression(new ConstExpression(false), "!");
        var checker = new SemantikCheckImpl();

        var typedUnaryExpression = checker.semantikCheck(untypedUnaryExp);
        var expected = new TypedUnaryExpression(new TypedConstExpression(false, new BoolType()), "!", new BoolType());

        Assertions.assertEquals(expected, typedUnaryExpression);
    }

}
