package Statements;

import Common.Block;
import Expressions.CompareExpression;

public class WhileStatement implements IStatement
{
    CompareExpression condition;
    Block block;

    public WhileStatement(CompareExpression condition, Block block)
    {
        this.condition = condition;
        this.block = block;
    }

        public CompareExpression getCondition()
    {
        return condition;
    }
    public Block getBlock()
    {
        return block;
    }
}
