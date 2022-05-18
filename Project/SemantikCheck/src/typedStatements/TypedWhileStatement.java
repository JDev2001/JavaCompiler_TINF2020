package typedStatements;

import Statements.*;
import Types.IMethodType;
import Types.IType;

public record TypedWhileStatement(WhileStatement unTypedWhileStatement, IMethodType objectType)  implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
