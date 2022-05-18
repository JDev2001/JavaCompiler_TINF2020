package DataClasses.Common;

import DataClasses.Method.Method;
import DataClasses.Field.Field;

import java.util.List;

public record Class (String identifier, List<Method> constructor, List<Method> methods, List<Field> fields)
{
}

