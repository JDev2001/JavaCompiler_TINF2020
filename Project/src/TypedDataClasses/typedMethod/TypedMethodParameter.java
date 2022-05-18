package TypedDataClasses.typedMethod;

import DataClasses.Types.IMethodType;
import DataClasses.Types.IType;

public record TypedMethodParameter(String identifier, IType type, IMethodType objectType)   {

}
