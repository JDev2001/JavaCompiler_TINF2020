package SemanticCheck.TypedDataClasses.typedStatements;


import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;


public record TypedReturnStatement(ITypedExpression returnValue, IMethodType objectType)  implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
