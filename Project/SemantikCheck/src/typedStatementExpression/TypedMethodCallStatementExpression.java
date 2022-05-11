package typedStatementExpression;

import StatementExpression.*;
import Types.IType;

public record TypedMethodCallStatementExpression(MethodCallStatementExpression unTypedMethodCallStatementExpression, IType objectType) implements ITypedStatementExpression  {


}
