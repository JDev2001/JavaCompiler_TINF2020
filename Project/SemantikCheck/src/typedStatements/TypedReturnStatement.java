package typedStatements;

import Expressions.IExpression;
import Statements.*;
import Types.IMethodType;
import Types.IType;
import typedExpressions.ITypedExpression;

public record TypedReturnStatement(ITypedExpression returnValue, IMethodType objectType)  implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
