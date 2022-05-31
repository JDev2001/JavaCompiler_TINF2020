package SemanticCheck.TypedDataClasses.typedStatementExpression;

import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;

public record TypedInstVarStatementExpression(String varName, ITypedExpression expression, IMethodType objectType) implements ITypedStatementExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
