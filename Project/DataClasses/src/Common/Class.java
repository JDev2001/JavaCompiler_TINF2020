package Common;

import Method.Method;

import java.util.List;

public class Class
{

    private String identifier;
    private List<Method> methods;

    public Class(String identifier, List<Method> methods)
    {
        this.identifier = identifier;
        this.methods = methods;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public List<Method> getMethods()
    {
        return methods;
    }
}
