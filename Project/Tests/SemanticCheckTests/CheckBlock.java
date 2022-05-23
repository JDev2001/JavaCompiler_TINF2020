package SemanticCheckTests;

import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.CharType;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import SemanticCheck.Factory.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedConstExpression;
import SemanticCheck.TypedDataClasses.typedStatements.TypedReturnStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckBlock
{
    @Test
    public void TestSimpleReturnInt() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var block = new Block(List.of(new ReturnStatement(new ConstExpression(5)))); //return 5;
        var typedBlock = checker.semantikCheck(block);

        var expected = new TypedBlock(List.of(new TypedReturnStatement(new TypedConstExpression(5, new IntType()),new IntType())), new IntType());
        Assertions.assertEquals(expected,typedBlock);
    }
    @Test
    public void TestSimpleReturnBool() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var block = new Block(List.of(new ReturnStatement(new ConstExpression(false)))); //return false// ;
        var typedBlock = checker.semantikCheck(block);

        var expected = new TypedBlock(List.of(new TypedReturnStatement(new TypedConstExpression(false, new BoolType()),new BoolType())), new BoolType());
        Assertions.assertEquals(expected,typedBlock);
    }
    @Test
    public void TestSimpleReturnChar() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var block = new Block(List.of(new ReturnStatement(new ConstExpression('c')))); //return 'c'// ;
        var typedBlock = checker.semantikCheck(block);

        var expected = new TypedBlock(List.of(new TypedReturnStatement(new TypedConstExpression('c', new CharType()),new CharType())), new CharType());
        Assertions.assertEquals(expected,typedBlock);
    }

    @Test
    public void TestEmptyBlock() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var block = new Block(new ArrayList<>());;
        var typedBlock = checker.semantikCheck(block);

        var expected = new TypedBlock(new ArrayList<>(), new VoidType());
        Assertions.assertEquals(expected,typedBlock);
    }

    @Test
    public void TestNestedBlock() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var block = new Block(List.of(
                new Block(List.of(new ReturnStatement(new ConstExpression('c')))),
                new Block(List.of(new ReturnStatement(new ConstExpression('b'))))));
        var typedBlock = checker.semantikCheck(block);

        var expected =  new TypedBlock(List.of(
            new TypedBlock(List.of(new TypedReturnStatement(new TypedConstExpression('c', new CharType()),new CharType())), new CharType()),
            new TypedBlock(List.of(new TypedReturnStatement(new TypedConstExpression('b', new CharType()), new CharType())),new CharType())),new CharType());

        Assertions.assertEquals(expected,typedBlock);

    }

    @Test
    public void TestInvalidBlock() throws Exception
    {
        var checker = new SemantikCheckImpl();
        var block = new Block(List.of(
                new Block(List.of(new ReturnStatement(new ConstExpression(5)))),
                new Block(List.of(new ReturnStatement(new ConstExpression(false))))));

        try{
            var typedBlock = checker.semantikCheck(block);
            Assertions.fail();
        }
        catch (Exception e)
        {
            Assertions.assertTrue(true);
        }

    }
}
