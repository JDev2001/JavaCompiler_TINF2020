package TypedDataClasses.typedStatements;


import DataClasses.Types.IMethodType;
import TypedDataClasses.typedExpressions.ITypedExpression;


public record TypedReturnStatement(ITypedExpression returnValue, IMethodType objectType)  implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
