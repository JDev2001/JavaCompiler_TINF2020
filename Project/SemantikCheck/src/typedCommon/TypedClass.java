package typedCommon;

import Common.Class;
import Field.Field;
import Method.Method;
import Types.IMethodType;
import Types.IType;
import typedMethod.TypedMethod;

import java.util.List;

public record TypedClass(String identifier, List<TypedMethod> constructor, List<TypedMethod> methods, List<Field> fields, IMethodType objectType) {


}
