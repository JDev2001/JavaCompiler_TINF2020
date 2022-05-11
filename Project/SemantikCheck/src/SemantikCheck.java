import Common.*;
import Common.Class;
import Expressions.*;
import Field.*;
import Method.*;
import StatementExpression.*;
import Types.*;
import typedExpressions.*;
import typedField.*;
import typedMethod.*;
import typedStatementExpression.*;
import typedStatements.*;
import Statements.*;
import typedCommon.*;
import typedTypes.*;

public interface SemantikCheck {
    TypedAccessModifiers semantikCheck(AccessModifiers untyped);
    TypedBlock semantikCheck(Block untyped);
    TypedClass semantikCheck(Class untyped);
    TypedProgram semantikCheck(Program untyped);

    TypedBinaryExpression semantikCheck(BinaryExpression untyped);
    TypedCompareExpression semantikCheck(CompareExpression untyped);
    TypedConstExpression semantikCheck(ConstExpression untyped);
    TypedJNullExpression semantikCheck(JNullExpression untyped);
    TypedSuperExpression semantikCheck(SuperExpression untyped);
    TypedThisExpression semantikCheck(ThisExpression untyped);
    TypedTypeExpression semantikCheck(TypeExpression untyped);
    TypedUnaryExpression semantikCheck(UnaryExpression untyped);

    TypedField semantikCheck(Field untyped);

    TypedMethod semantikCheck(Method untyped);
    TypedMethodParameter semantikCheck(MethodParameter untyped);

    TypedAssignStatementExpression semantikCheck(AssignStatementExpression untyped);
    TypedInstVarStatementExpression semantikCheck(InstVarStatementExpression untyped);
    TypedMethodCallStatementExpression semantikCheck(MethodCallStatementExpression untyped);
    TypedNewStatementExpression semantikCheck(NewStatementExpression untyped);

    TypedIfElseStatement semantikCheck(IfElseStatement untyped);
    TypedReturnStatement semantikCheck(ReturnStatement untyped);
    TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped);
    TypedWhileStatement semantikCheck(WhileStatement untyped);

    TypedBoolType semantikCheck(BoolType untyped);
    TypedCharType semantikCheck(CharType untyped);
    TypedCustomType semantikCheck(CustomType untyped);
    TypedIntType semantikCheck(IntType untyped);
    TypedVoidType semantikCheck(VoidType untyped);
}

