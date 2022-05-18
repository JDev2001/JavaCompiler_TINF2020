package TypedDataClasses.typedCommon;


import DataClasses.Types.IMethodType;
import TypedDataClasses.typedStatements.ITypedStatement;

import java.util.List;

public record TypedBlock (List<ITypedStatement> statements, IMethodType objectType) implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
