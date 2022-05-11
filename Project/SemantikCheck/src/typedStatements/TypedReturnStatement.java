package typedStatements;

import Statements.*;
import Types.IType;

public record TypedReturnStatement(ReturnStatement unTypedReturnStatement, IType objectType)  implements ITypedStatement {

}
