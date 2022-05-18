package SemanticCheck;

import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.*;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.StatementExpression.IStatementExpression;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.StatementExpression.NewStatementExpression;
import Parser.DataClasses.Statements.*;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedExpressions.*;
import SemanticCheck.TypedDataClasses.typedStatements.*;
import SemanticCheck.TypedDataClasses.typedStatementExpression.ITypedStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedAssignStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedMethodCallStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedNewStatementExpression;

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
