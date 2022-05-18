package DataClasses.Method;

import DataClasses.Common.AccessModifiers;
import DataClasses.Statements.IStatement;
import DataClasses.Types.IMethodType;

import java.util.List;

public record Method(AccessModifiers accessModfier, String identifer, List<MethodParameter> parameters, IMethodType returnType, IStatement statement)
{

}

