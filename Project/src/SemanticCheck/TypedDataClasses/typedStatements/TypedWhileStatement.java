package SemanticCheck.TypedDataClasses.typedStatements;

import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedBinaryExpression;

public record TypedWhileStatement(TypedBinaryExpression condition, TypedBlock block, IMethodType objectType)  implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
