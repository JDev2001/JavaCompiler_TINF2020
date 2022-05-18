package Parser.DataClasses.Statements;

import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Expressions.IExpression;

public record  WhileStatement(IExpression expression, Block block) implements IStatement
{

}
