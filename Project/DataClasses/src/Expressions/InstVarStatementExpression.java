package Expressions;

import Expressions.IExpression;
import Statements.IStatement;

/**
 * Instanzvariable: myObj.x
 */
public record InstVarStatementExpression(String varName, IExpression expression) implements IExpression
{

}
