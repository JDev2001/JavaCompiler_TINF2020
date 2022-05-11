package Types;

public class CustomType implements IType
{
    private final String name;

    public CustomType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
