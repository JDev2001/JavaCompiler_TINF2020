package typedStatementExpression;

import StatementExpression.*;
import Types.IType;

public record TypedAssignStatementExpression(AssignStatementExpression unTypedAssignStatementExpression, IType objectType) implements ITypedStatementExpression {


}
