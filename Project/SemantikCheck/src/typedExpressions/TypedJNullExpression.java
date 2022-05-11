package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedJNullExpression(JNullExpression unTypedJNullExpression, IType objectType) implements ITypedExpression {


}