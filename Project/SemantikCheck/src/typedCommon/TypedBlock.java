package typedCommon;

import Common.Block;
import Statements.IStatement;
import Types.IMethodType;
import typedStatements.ITypedStatement;

import java.util.List;

public record TypedBlock (List<ITypedStatement> statements, IMethodType objectType) implements ITypedStatement {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
