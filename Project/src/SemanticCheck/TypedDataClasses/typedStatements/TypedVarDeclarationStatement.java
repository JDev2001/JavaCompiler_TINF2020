package SemanticCheck.TypedDataClasses.typedStatements;

import Parser.DataClasses.Types.IMethodType;
import Parser.DataClasses.Types.IType;

public record TypedVarDeclarationStatement(String name, IType type, IMethodType objectType)  implements ITypedStatement {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}
