package Parser.DataClasses.StatementExpression;

import Parser.DataClasses.Types.IType;

/***
 * Instanzierung einer Klasse
 * new ABC(5,false);
 */
public record NewStatementExpression(MethodCallStatementExpression constructorCall) implements IStatementExpression
{
  
}
