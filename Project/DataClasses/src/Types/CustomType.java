package Types;

public class CustomType implements IType
{
    private String name;

    public CustomType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
