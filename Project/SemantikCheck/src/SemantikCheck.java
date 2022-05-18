import Common.*;
import Common.Class;
import Expressions.*;
import StatementExpression.*;
import typedExpressions.*;
import typedStatementExpression.*;
import typedStatements.*;
import Statements.*;
import typedCommon.*;

public interface SemantikCheck {
    void semantikCheckStart(Program program) throws Exception;
    ITypedExpression checkExpression(IExpression expression) throws Exception;
    ITypedStatement checkStatement(IStatement statement) throws Exception;
    ITypedStatementExpression checkStatementExpression(IStatementExpression statementExpression) throws Exception;

    TypedBlock semantikCheck(Block untyped) throws Exception;
    TypedClass semantikCheck(Class untyped) throws Exception;

    TypedBinaryExpression semantikCheck(BinaryExpression untyped) throws Exception;
    TypedConstExpression semantikCheck(ConstExpression untyped) throws Exception;
    TypedJNullExpression semantikCheck(JNullExpression untyped) throws Exception;
    TypedSuperExpression semantikCheck(SuperExpression untyped) throws Exception;
    TypedThisExpression semantikCheck(ThisExpression untyped) throws Exception;
    TypedTypeExpression semantikCheck(TypeExpression untyped) throws Exception;
    TypedUnaryExpression semantikCheck(UnaryExpression untyped) throws Exception;

    TypedAssignStatementExpression semantikCheck(AssignStatementExpression untyped) throws Exception;
    TypedInstVarStatementExpression semantikCheck(InstVarStatementExpression untyped) throws Exception;
    TypedMethodCallStatementExpression semantikCheck(MethodCallStatementExpression untyped) throws Exception;
    TypedNewStatementExpression semantikCheck(NewStatementExpression untyped) throws Exception;

    TypedIfElseStatement semantikCheck(IfElseStatement untyped) throws Exception;
    TypedReturnStatement semantikCheck(ReturnStatement untyped) throws Exception;
    TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped) throws Exception;
    TypedWhileStatement semantikCheck(WhileStatement untyped) throws Exception;
}

