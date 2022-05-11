package Common;

import Field.Field;
import Method.Method;

import java.util.List;

public class Class
{
    private final String identifier;
    private final List<Method> methods;
    private final List<Field> fields;

    public Class(String identifier, List<Method> methods, List<Field> fields)
    {
        this.identifier = identifier;
        this.methods = methods;
        this.fields = fields;
    }

    public List<Field> getFields()
    {
        return fields;
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

