package Method;

import Common.AccessModfiers;
import Common.Block;
import Types.IMethodType;
import Types.IType;

import java.util.List;

public class Method
{
    public Method(AccessModfiers accessModfier, String identifer, List<MethodParameter> parameters, Block block, IMethodType returnType)
    {
        this.accessModfier = accessModfier;
        this.identifer = identifer;
        this.parameters = parameters;
        this.block = block;
        this.returnType = returnType;
    }

    public IMethodType getReturnType()
    {
        return returnType;
    }

    public AccessModfiers getAccessModfier()
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

    public Block getBlock()
    {
        return block;
    }
    private IMethodType returnType;
    private AccessModfiers accessModfier;
    private String identifer;
    private List<MethodParameter> parameters;
    private Block block;

}

