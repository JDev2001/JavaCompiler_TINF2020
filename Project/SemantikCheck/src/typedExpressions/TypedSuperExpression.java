package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedSuperExpression (SuperExpression unTypedSuperExpression, IType objectType)  implements ITypedExpression {

}