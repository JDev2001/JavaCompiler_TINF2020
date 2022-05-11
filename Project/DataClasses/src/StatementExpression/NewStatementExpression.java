package StatementExpression;

import Types.IType;

/***
 * Instanzierung einer Klasse
 * new ABC(5,false);
 */
public record NewStatementExpression(MethodCallStatementExpression constructorCall, IType type) implements IStatementExpression
{
  
}
