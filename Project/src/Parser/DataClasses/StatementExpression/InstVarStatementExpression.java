package Parser.DataClasses.StatementExpression;

import Parser.DataClasses.Expressions.IExpression;

/**
 * Instanzvariable: myObj.x
 */
public record InstVarStatementExpression(String varName, IExpression expression) implements IStatementExpression
{

}
