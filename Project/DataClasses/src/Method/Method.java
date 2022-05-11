package Method;

import Common.AccessModifiers;
import Statements.IStatement;
import Types.IMethodType;

import java.util.List;

public record Method(AccessModifiers accessModfier, String identifer, List<MethodParameter> parameters, IMethodType returnType, IStatement statement)
{

}

