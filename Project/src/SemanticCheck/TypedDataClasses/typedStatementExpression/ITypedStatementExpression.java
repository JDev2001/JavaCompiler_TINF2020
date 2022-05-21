package SemanticCheck.TypedDataClasses.typedStatementExpression;

import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;
import SemanticCheck.TypedDataClasses.typedStatements.ITypedStatement;

public interface ITypedStatementExpression extends ITypedStatement, ITypedExpression
{
    public IMethodType getType();
}
