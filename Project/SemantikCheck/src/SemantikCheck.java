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

    TypedBlock semantikCheck(Block untyped);
    TypedClass semantikCheck(Class untyped);

    TypedBinaryExpression semantikCheck(BinaryExpression untyped);
    TypedConstExpression semantikCheck(ConstExpression untyped);
    TypedJNullExpression semantikCheck(JNullExpression untyped);
    TypedSuperExpression semantikCheck(SuperExpression untyped);
    TypedThisExpression semantikCheck(ThisExpression untyped);
    TypedTypeExpression semantikCheck(TypeExpression untyped);
    TypedUnaryExpression semantikCheck(UnaryExpression untyped);

    TypedAssignStatementExpression semantikCheck(AssignStatementExpression untyped);
    TypedInstVarStatementExpression semantikCheck(InstVarStatementExpression untyped);
    TypedMethodCallStatementExpression semantikCheck(MethodCallStatementExpression untyped);
    TypedNewStatementExpression semantikCheck(NewStatementExpression untyped);

    TypedIfElseStatement semantikCheck(IfElseStatement untyped) throws Exception;
    TypedReturnStatement semantikCheck(ReturnStatement untyped);
    TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped);
    TypedWhileStatement semantikCheck(WhileStatement untyped);
}

