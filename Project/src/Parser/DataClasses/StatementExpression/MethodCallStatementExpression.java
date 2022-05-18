package Parser.DataClasses.StatementExpression;

import Parser.DataClasses.Expressions.IExpression;

import java.util.List;

/**
 * target.name();
 */
public record MethodCallStatementExpression(String name, IExpression target, List<IExpression> parameters) implements IStatementExpression
{
    
}
