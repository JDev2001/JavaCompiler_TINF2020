package typedStatements;

import Types.IMethodType;
import Types.IType;
import typedCommon.TypedBlock;
import typedExpressions.ITypedExpression;

public record TypedIfElseStatement(ITypedExpression expression, TypedBlock ifBlock, TypedBlock elseBlock, IMethodType objectType ) implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
