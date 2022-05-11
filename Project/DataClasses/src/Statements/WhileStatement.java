package Statements;

import Common.Block;
import Expressions.CompareExpression;

public record  WhileStatement(CompareExpression condition, Block block) implements IStatement
{

}
