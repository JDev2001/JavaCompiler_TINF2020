package SemanticCheck.TypedDataClasses.typedStatements;

import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;

import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;

public record TypedIfElseStatement(ITypedExpression expression, TypedBlock ifBlock, TypedBlock elseBlock, IMethodType objectType ) implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
