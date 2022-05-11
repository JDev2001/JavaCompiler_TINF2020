package typedStatementExpression;

import StatementExpression.*;
import Types.IType;

public record TypedNewStatementExpression(NewStatementExpression unTypedNewStatementExpression, IType objectType) implements ITypedStatementExpression {


}
