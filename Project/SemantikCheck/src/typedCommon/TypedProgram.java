package typedCommon;

import Common.Class;
import Types.IMethodType;
import Types.IType;

import java.util.List;

public record TypedProgram(List<TypedClass> classes, IMethodType objectType) {


}
