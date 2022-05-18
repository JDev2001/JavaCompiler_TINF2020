package SemanticCheck;

import DataClasses.Common.Class;
import DataClasses.Common.Block;
import DataClasses.Common.Program;
import DataClasses.Expressions.*;
import DataClasses.StatementExpression.AssignStatementExpression;
import DataClasses.StatementExpression.IStatementExpression;
import DataClasses.StatementExpression.MethodCallStatementExpression;
import DataClasses.StatementExpression.NewStatementExpression;
import DataClasses.Statements.*;
import TypedDataClasses.typedCommon.TypedBlock;
import TypedDataClasses.typedCommon.TypedClass;
import TypedDataClasses.typedExpressions.*;
import TypedDataClasses.typedStatementExpression.ITypedStatementExpression;
import TypedDataClasses.typedStatementExpression.TypedAssignStatementExpression;
import TypedDataClasses.typedStatementExpression.TypedMethodCallStatementExpression;
import TypedDataClasses.typedStatementExpression.TypedNewStatementExpression;
import TypedDataClasses.typedStatements.*;

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

    default TypedThisExpression semantikCheck(ThisExpression untyped) throws Exception
    {
        return null;
    }

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

