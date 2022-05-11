import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import typedStatements.*;
import Statements.*;
import typedCommon.*;

public interface SemantikCheck {
    TypedAccessModifiers semantikCheck(AccessModifiers untyped);
    TypedBlock semantikCheck(Block untyped);
    TypedClass semantikCheck(Class untyped);
    TypedProgram semantikCheck(Program untyped);

    TypedIfElseStatement semantikCheck(IfElseStatement untyped);

}

