package Parser.DataClasses.Field;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Types.IType;

public record Field(String name, IType type, AccessModifiers accessModifier)
{
}
