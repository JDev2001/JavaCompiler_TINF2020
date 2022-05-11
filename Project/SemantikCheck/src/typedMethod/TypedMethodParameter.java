package typedMethod;

import Method.*;
import Types.IType;

public record TypedMethodParameter(MethodParameter unTypedMethodParameter, IType objectType)   {

}
