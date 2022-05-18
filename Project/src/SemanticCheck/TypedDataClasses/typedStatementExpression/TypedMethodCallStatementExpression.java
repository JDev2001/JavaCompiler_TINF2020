package SemanticCheck.TypedDataClasses.typedStatementExpression;


import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;

import java.util.List;

public record TypedMethodCallStatementExpression(String name, ITypedExpression target, List<ITypedExpression> parameters, IMethodType objectType) implements ITypedStatementExpression  {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
