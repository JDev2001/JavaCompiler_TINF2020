import typedCommon.*;
import typedExpressions.*;
import typedStatements.*;

import Common.*;
import Common.Class;
import Expressions.*;
import Field.*;
import Method.*;
import StatementExpression.*;
import Statements.*;
import Types.*;

import typedStatements.TypedIfElseStatement;

public class SemantikCheckImpl implements SemantikCheck{



    public TypedAccessModifiers semantikCheck(AccessModifiers untyped){
        return null;
    }

    public TypedBlock semantikCheck(Block untyped){
        return null;
    }

    public TypedClass semantikCheck(Class untyped){
        return null;
    }

    public TypedProgram semantikCheck(Program untyped){
        return null;
    }



    public TypedBinaryExpression semantikCheck(BinaryExpression untyped){
        return null;
    }

    public TypedCompareExpression semantikCheck(CompareExpression untyped){
        return null;
    }

    public TypedConstExpression semantikCheck(ConstExpression untyped){
        return null;
    }

    public TypedJNullExpression semantikCheck(JNullExpression untyped){
        return null;
    }

    public TypedSuperExpression semantikCheck(SuperExpression untyped){
        return null;
    }

    public TypedThisExpression semantikCheck(ThisExpression untyped){
        return null;
    }

    public TypedTypeExpression semantikCheck(TypeExpression untyped){
        return null;
    }

    public TypedUnaryExpression semantikCheck(UnaryExpression untyped){
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
