package typedStatements;

import Statements.IfElseStatement;
import Types.IType;

public record TypedIfElseStatement(IfElseStatement unTypedifElseStatement, IType objectType) implements ITypedStatement {


}
