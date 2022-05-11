package typedStatements;

import Statements.*;
import Types.IType;

public record TypedWhileStatement(WhileStatement unTypedWhileStatement, IType objectType)  implements ITypedStatement {


}
