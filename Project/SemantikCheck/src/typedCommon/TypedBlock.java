package typedCommon;

import Common.Block;
import Types.IMethodType;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedBlock extends TypedBaseObject {

    public TypedBlock(Block unTypedBlock, IMethodType objectType){
        super(objectType);
        this.Block = unTypedBlock;
    }

    Block Block;
}
