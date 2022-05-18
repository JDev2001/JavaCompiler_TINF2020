package TypedDataClasses.typedStatements;

import DataClasses.Types.IMethodType;
import DataClasses.Types.IType;

public record TypedVarDeclarationStatement(String name, IType type, IMethodType objectType)  implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
