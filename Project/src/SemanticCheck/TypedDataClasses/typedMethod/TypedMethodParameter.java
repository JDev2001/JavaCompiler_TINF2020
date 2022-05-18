package SemanticCheck.TypedDataClasses.typedMethod;

import Parser.DataClasses.Types.IMethodType;
import Parser.DataClasses.Types.IType;

public record TypedMethodParameter(String identifier, IType type, IMethodType objectType)   {

}
