package DataClasses.Statements;

import DataClasses.Common.Block;
import DataClasses.Expressions.IExpression;

public record  WhileStatement(IExpression expression, Block block) implements IStatement
{

}
