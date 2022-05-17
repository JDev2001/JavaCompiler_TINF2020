package Common;

import Field.Field;
import Method.Method;

import java.util.List;

public record Class (String identifier, List<Method> constructors, List<Method> methods, List<Field> fields)
{
}

