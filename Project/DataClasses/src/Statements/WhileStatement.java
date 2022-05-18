package Statements;

import Common.Block;
import Expressions.BinaryExpression;
import Expressions.IExpression;
import StatementExpression.IStatementExpression;

public record  WhileStatement(IExpression expression, Block block) implements IStatement
{

}
