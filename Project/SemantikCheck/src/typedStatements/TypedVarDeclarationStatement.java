package typedStatements;

import Statements.*;
import Types.IMethodType;
import Types.IType;

public record TypedVarDeclarationStatement(String name, IType type, IMethodType objectType)  implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
