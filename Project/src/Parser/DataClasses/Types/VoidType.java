package Parser.DataClasses.Types;

public record VoidType() implements  IMethodType
{
    @Override
    public String getName()
    {
        return "Void";
    }
}
