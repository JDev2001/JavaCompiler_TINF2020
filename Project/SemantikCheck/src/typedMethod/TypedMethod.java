package typedMethod;

import Common.AccessModifiers;
import Method.*;
import Statements.IStatement;
import Types.IMethodType;
import Types.IType;
import typedStatements.ITypedStatement;

import java.util.List;

public record TypedMethod(AccessModifiers accessModfier, String identifer, List<TypedMethodParameter> parameters, IMethodType returnType, ITypedStatement statement, IMethodType objectType)  {


}
