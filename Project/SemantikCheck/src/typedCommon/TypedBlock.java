package typedCommon;

import Common.Block;
import Types.IMethodType;
import typedStatements.ITypedStatement;

public record TypedBlock (Block unTypedBlock, IMethodType objectType) implements ITypedStatement {


}
