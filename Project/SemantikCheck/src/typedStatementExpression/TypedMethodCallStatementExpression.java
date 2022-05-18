package typedStatementExpression;

import Expressions.IExpression;
import StatementExpression.*;
import Types.IMethodType;
import typedExpressions.ITypedExpression;

import java.util.List;

public record TypedMethodCallStatementExpression(String name, ITypedExpression target, List<ITypedExpression> parameters, IMethodType objectType) implements ITypedStatementExpression  {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
