package Parser.DataClasses.Statements;

import Parser.DataClasses.Expressions.IExpression;

public record ReturnStatement(IExpression returnValue) implements IStatement
{

}





