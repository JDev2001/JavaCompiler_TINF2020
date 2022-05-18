package Parser.DataClasses.Method;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Statements.IStatement;
import Parser.DataClasses.Types.IMethodType;

import java.util.List;

public record Method(AccessModifiers accessModfier, String identifer, List<MethodParameter> parameters, IMethodType returnType, IStatement statement)
{

}

