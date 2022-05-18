package SemanticCheck.TypedDataClasses.typedMethod;


import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedStatements.ITypedStatement;

import java.util.List;

public record TypedMethod(AccessModifiers accessModfier, String identifer, List<TypedMethodParameter> parameters, IMethodType returnType, ITypedStatement statement, IMethodType objectType)  {


}
