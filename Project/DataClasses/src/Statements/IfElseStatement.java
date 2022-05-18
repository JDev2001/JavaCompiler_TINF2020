package Statements;

import Common.Block;
import Expressions.BinaryExpression;
import Expressions.IExpression;

/**
 * if(CompareExpression)
 * {
 *  ...
 * }
 * else
 * {
 *     ...
 * }
 *
 * a>b wird eine Binary Expression
 */
public record IfElseStatement(IExpression expression, Block ifBlock, Block elseBlock) implements IStatement
{
}
