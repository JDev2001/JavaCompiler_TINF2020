package DataClasses.Types;

public record CharType() implements IType
{

    @Override
    public String getName()
    {
        return "Char";
    }
}

