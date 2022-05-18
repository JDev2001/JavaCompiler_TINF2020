import typedCommon.*;
import typedExpressions.*;
import typedField.*;
import typedMethod.*;
import typedStatementExpression.*;
import typedStatements.*;

import Common.*;
import Common.Class;
import Expressions.*;
import Field.*;
import Method.*;
import StatementExpression.*;
import Statements.*;
import Types.*;

public class SemantikCheckImpl implements SemantikCheck{


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



    public TypedField semantikCheck(Field untyped){
        return null;
    }



    public TypedMethod semantikCheck(Method untyped){
        return null;
    }

    public TypedMethodParameter semantikCheck(MethodParameter untyped){
        return null;
    }



    public TypedAssignStatementExpression semantikCheck(AssignStatementExpression untyped){
        return null;
    }

    public TypedInstVarStatementExpression semantikCheck(InstVarStatementExpression untyped){
        return null;
    }

    public TypedMethodCallStatementExpression semantikCheck(MethodCallStatementExpression untyped){
        return null;
    }

    public TypedNewStatementExpression semantikCheck(NewStatementExpression untyped){
        return null;
    }



    public TypedIfElseStatement semantikCheck(IfElseStatement untyped) throws Exception {

        if(semantikCheck(untyped.condition()).equals(new BoolType())
                && semantikCheck(untyped.ifBlock()).equals(semantikCheck(untyped.elseBlock()))){
            //Type type = semantikCheck(untyped.ifBlock());
            //return type;
            return new TypedIfElseStatement(untyped, new IType() {
                public String getName() {
                    return "objectType";
                }
            });
        }
        else {
            throw new Exception("Error");
        }
    }

    public TypedReturnStatement semantikCheck(ReturnStatement untyped){
        return null;
    }

    public TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped){
        return null;
    }

    public TypedWhileStatement semantikCheck(WhileStatement untyped){
        return null;
    }

    public BoolType semantikCheck(BoolType untyped){
        return new BoolType();
    }

    public CharType semantikCheck(CharType untyped){
        return new CharType();
    }

    public CustomType semantikCheck(CustomType untyped){
        return new CustomType("titel");
    }

    public IntType semantikCheck(IntType untyped){
        return new IntType();
    }

    public VoidType semantikCheck(VoidType untyped){
        return new VoidType();
    }

}
