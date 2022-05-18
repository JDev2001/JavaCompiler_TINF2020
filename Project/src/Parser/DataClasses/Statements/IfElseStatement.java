package Parser.DataClasses.Statements;

import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Expressions.IExpression;

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
