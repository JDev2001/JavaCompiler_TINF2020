package Field;

import Common.AccessModfiers;
import Types.IType;

public class Field
{
    String name;
    IType type;
    AccessModfiers accessModfiers;

    public Field(String name, IType type, AccessModfiers accessModfiers)
    {
        this.name = name;
        this.type = type;
        this.accessModfiers = accessModfiers;
    }

    public String getName()
    {
        return name;
    }

    public IType getType()
    {
        return type;
    }

    public AccessModfiers getAccessModfiers()
    {
        return accessModfiers;
    }
}
