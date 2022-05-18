package Parser.DataClasses.Types;

public record IntType() implements IType
{

    @Override
    public String getName()
    {
        return "Int";
    }
}


