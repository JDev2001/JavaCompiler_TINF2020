package Statements;

import Common.Block;

public record  WhileStatement(CompareExpression condition, Block block) implements IStatement
{

}
