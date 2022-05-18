package typedStatements;

import Statements.*;
import Types.IMethodType;
import Types.IType;

public record TypedVarDeclarationStatement(VarDeclarationStatement unTypedVarDeclarationStatement, IMethodType objectType)  implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
