package TypedDataClasses.typedCommon;



import DataClasses.Types.IMethodType;

import java.util.List;

public record TypedProgram(List<TypedClass> classes, IMethodType objectType) {


}
