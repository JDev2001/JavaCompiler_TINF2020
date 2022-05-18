package DataClasses.Types;

public record BoolType() implements IType
{
    @Override
    public String getName()
    {
        return "Bool";
    }
}
