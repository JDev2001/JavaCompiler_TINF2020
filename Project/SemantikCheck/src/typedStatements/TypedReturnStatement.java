package typedStatements;

import Statements.*;
import Types.IMethodType;
import Types.IType;

public record TypedReturnStatement(ReturnStatement unTypedReturnStatement, IMethodType objectType)  implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
