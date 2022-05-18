package DataClasses.Types;

public record CustomType(String name) implements IType
{

    public String getName()
    {
        return name;
    }

}
