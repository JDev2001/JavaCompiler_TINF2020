package typedStatements;

import Common.Block;
import Expressions.BinaryExpression;
import Statements.*;
import Types.IMethodType;
import Types.IType;
import typedCommon.TypedBlock;
import typedExpressions.TypedBinaryExpression;

public record TypedWhileStatement(TypedBinaryExpression condition, TypedBlock block, IMethodType objectType)  implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
