package typedCommon;

import Common.Block;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedBlock extends TypedBaseObject {

    public TypedBlock(Block unTypedBlock, IType objectType){
        super(objectType);
        this.Block = unTypedBlock;
    }

    Block Block;
}
