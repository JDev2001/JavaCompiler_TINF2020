package DataClasses.Statements;

import DataClasses.Common.Block;
import DataClasses.Expressions.IExpression;

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
