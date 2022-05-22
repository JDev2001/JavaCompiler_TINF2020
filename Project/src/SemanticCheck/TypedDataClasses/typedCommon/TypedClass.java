package SemanticCheck.TypedDataClasses.typedCommon;


import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedMethod.TypedMethod;

import java.util.List;

public record TypedClass(String identifier, List<TypedMethod> constructor, List<TypedMethod> methods, List<Field> fields) {


}
