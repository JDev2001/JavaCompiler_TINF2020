package StatementExpression;

import Expressions.IExpression;

/**
 * Instanzvariable: myObj.x
 */
public record InstVarStatementExpression(String varName, IExpression expression) implements IStatementExpression
{

}
