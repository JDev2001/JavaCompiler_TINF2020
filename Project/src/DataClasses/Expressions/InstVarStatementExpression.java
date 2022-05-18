package DataClasses.Expressions;

/**
 * Instanzvariable: myObj.x
 */
public record InstVarStatementExpression(String varName, IExpression expression) implements IExpression
{

}
