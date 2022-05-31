package SemanticCheck.TypedDataClasses.typedCommon;

import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedStatements.ITypedStatement;

import java.util.List;

public record TypedBlock (List<ITypedStatement> statements, IMethodType objectType) implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
