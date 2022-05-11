package typedStatementExpression;

import StatementExpression.*;
import Types.IType;

public record TypedInstVarStatementExpression(InstVarStatementExpression unTypedInstVarStatementExpression, IType objectType) implements ITypedStatementExpression {


}
