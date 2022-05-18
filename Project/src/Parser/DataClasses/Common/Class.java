package Parser.DataClasses.Common;

import Parser.DataClasses.Method.Method;
import Parser.DataClasses.Field.Field;

import java.util.List;

public record Class (String identifier, List<Method> constructor, List<Method> methods, List<Field> fields)
{
}

