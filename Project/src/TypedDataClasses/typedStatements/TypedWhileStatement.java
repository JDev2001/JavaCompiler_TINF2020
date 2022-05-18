package TypedDataClasses.typedStatements;

import DataClasses.Types.IMethodType;
import TypedDataClasses.typedCommon.TypedBlock;
import TypedDataClasses.typedExpressions.TypedBinaryExpression;

public record TypedWhileStatement(TypedBinaryExpression condition, TypedBlock block, IMethodType objectType)  implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
