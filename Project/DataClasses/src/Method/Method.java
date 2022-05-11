package Method;

import Common.AccessModifiers;
import Statements.IStatement;
import Types.IMethodType;

import java.util.List;

public class Method
{
    public Method(AccessModifiers accessModfier, String identifer, List<MethodParameter> parameters, IMethodType returnType, IStatement statement)
    {
        this.accessModfier = accessModfier;
        this.identifer = identifer;
        this.parameters = parameters;
        this.returnType = returnType;
        this.statement = statement;
    }

    public IMethodType getReturnType()
    {
        return returnType;
    }

    public AccessModifiers getAccessModfier()
    {
        return accessModfier;
    }

    public String getIdentifer()
    {
        return identifer;
    }

    public List<MethodParameter> getParameters()
    {
        return parameters;
    }


    private final IMethodType returnType;
    private final AccessModifiers accessModfier;
    private final String identifer;
    private final List<MethodParameter> parameters;

    public IStatement getStatement() {
        return statement;
    }

    private final IStatement statement;
}

