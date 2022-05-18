package TypedDataClasses.typedCommon;


import DataClasses.Field.Field;
import DataClasses.Types.IMethodType;
import TypedDataClasses.typedMethod.TypedMethod;

import java.util.List;

public record TypedClass(String identifier, List<TypedMethod> constructor, List<TypedMethod> methods, List<Field> fields, IMethodType objectType) {


}
