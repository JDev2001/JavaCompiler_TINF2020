import Statements.IfElseStatement;
import Common.Class;
import typedCommon.TypedClass;
import typedStatements.TypedIfElseStatement;

public class SemantikCheckImpl implements SemantikCheck{

    public TypedClass semantikCheck(Class untyped){
        return null;
    }

    public TypedIfElseStatement semantikCheck(IfElseStatement untyped){

        if( true /*untyped.getCondition().semantikCheck() == boolean */){
            // type
            return null;
        }
        else {
            return null;
            // error
        }
    }


}
