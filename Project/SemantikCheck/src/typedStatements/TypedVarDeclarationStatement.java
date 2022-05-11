package typedStatements;

import Statements.*;
import Types.IType;

public record TypedVarDeclarationStatement(VarDeclarationStatement unTypedVarDeclarationStatement, IType objectType)  implements ITypedStatement {


}
