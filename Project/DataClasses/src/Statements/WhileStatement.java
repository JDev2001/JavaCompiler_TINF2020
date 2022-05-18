package Statements;

import Common.Block;
import Expressions.BinaryExpression;

public record  WhileStatement(BinaryExpression condition, Block block) implements IStatement
{

}
