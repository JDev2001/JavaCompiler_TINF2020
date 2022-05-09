package Method;

import Types.IType;

public class MethodParameter
{
    public MethodParameter(String identifier, IType type)
    {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public IType getType()
    {
        return type;
    }

    private String identifier;
    private IType type;
}
