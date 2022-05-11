package Field;

import Common.AccessModifiers;
import Types.IType;

public class Field
{
    String name;
    IType type;
    AccessModifiers accessModifiers;

    public Field(String name, IType type, AccessModifiers accessModifiers)
    {
        this.name = name;
        this.type = type;
        this.accessModifiers = accessModifiers;
    }

    public String getName()
    {
        return name;
    }

    public IType getType()
    {
        return type;
    }

    public AccessModifiers getAccessModfiers()
    {
        return accessModifiers;
    }
}
