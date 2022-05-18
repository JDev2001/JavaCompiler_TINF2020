package DataClasses.Field;

import DataClasses.Common.AccessModifiers;
import DataClasses.Types.IType;

public record Field(String name, IType type, AccessModifiers accessModifier)
{
}
