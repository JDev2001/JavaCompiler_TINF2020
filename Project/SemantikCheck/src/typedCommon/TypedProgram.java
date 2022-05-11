package typedCommon;

import Common.Program;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedProgram extends TypedBaseObject {

    public TypedProgram(Program unTypedProgram, IType objectType){
        super(objectType);
        this.Program = unTypedProgram;
    }

    Program Program;
}
