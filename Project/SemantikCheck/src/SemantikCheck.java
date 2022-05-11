import Common.Class;
import typedStatements.*;
import Statements.*;
import typedCommon.*;

public interface SemantikCheck {
    
    TypedClass semantikCheck(Class untyped);

    TypedIfElseStatement semantikCheck(IfElseStatement untyped);

}

