package Statements;

import Common.Block;
import Expressions.CompareExpression;

import java.util.List;

/**
 * if(CompareExpression)
 * {
 *  ...
 * }
 * else
 * {
 *     ...
 * }
 */
public class IfElseStatement implements IStatement
{
    CompareExpression condition;
    Block ifBlock;
    Block elseBlock;

    public IfElseStatement(CompareExpression condition, Block ifBlock, Block elseBlock)
    {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    public CompareExpression getCondition()
    {
        return condition;
    }

    public Block getIfBlock()
    {
        return ifBlock;
    }

    public Block getElseBlock()
    {
        return elseBlock;
    }
}
