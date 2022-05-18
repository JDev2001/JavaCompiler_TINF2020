package TypedDataClasses.typedMethod;


import DataClasses.Common.AccessModifiers;
import DataClasses.Types.IMethodType;
import TypedDataClasses.typedStatements.ITypedStatement;

import java.util.List;

public record TypedMethod(AccessModifiers accessModfier, String identifer, List<TypedMethodParameter> parameters, IMethodType returnType, ITypedStatement statement, IMethodType objectType)  {


}
