package typedExpressions;

import Expressions.IExpression;
import Expressions.InstVarStatementExpression;
import Types.IType;
import typedStatementExpression.ITypedStatementExpression;

public record TypedInstVarStatementExpression(InstVarStatementExpression unTypedInstVarStatementExpression, IType objectType) implements ITypedExpression
{


}
