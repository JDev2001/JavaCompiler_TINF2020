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
public record IfElseStatement(CompareExpression condition, Block ifBlock, Block elseBlock) implements IStatement
{
}
