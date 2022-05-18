package TypedDataClasses.typedStatements;

import DataClasses.Types.IMethodType;
import TypedDataClasses.typedCommon.TypedBlock;

import TypedDataClasses.typedExpressions.ITypedExpression;

public record TypedIfElseStatement(ITypedExpression expression, TypedBlock ifBlock, TypedBlock elseBlock, IMethodType objectType ) implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
