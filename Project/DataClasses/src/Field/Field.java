package Field;

import Common.AccessModifiers;
import Types.IType;

public record Field(String name, IType type, AccessModifiers accessModifiers)
{
}
