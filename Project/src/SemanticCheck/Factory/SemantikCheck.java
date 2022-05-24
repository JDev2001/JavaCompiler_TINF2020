package SemanticCheck.Factory;

import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.*;
import Parser.DataClasses.StatementExpression.*;
import Parser.DataClasses.Statements.*;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import SemanticCheck.TypedDataClasses.typedExpressions.*;
import SemanticCheck.TypedDataClasses.typedStatementExpression.*;
import SemanticCheck.TypedDataClasses.typedStatements.*;

public interface SemantikCheck {
    TypedProgram semantikCheckStart(Program program) throws Exception;
    ITypedExpression checkExpression(IExpression expression) throws Exception;
    ITypedStatement checkStatement(IStatement statement) throws Exception;
    ITypedStatementExpression checkStatementExpression(IStatementExpression statementExpression) throws Exception;

    TypedBlock semantikCheck(Block untyped) throws Exception;
    TypedClass semantikCheck(Class untyped) throws Exception;

    TypedBinaryExpression semantikCheck(BinaryExpression untyped) throws Exception;
    TypedConstExpression semantikCheck(ConstExpression untyped) throws Exception;
    TypedJNullExpression semantikCheck(JNullExpression untyped) throws Exception;
    TypedLocalOrFieldVar semantikCheck(LocalOrFieldVar untyped) throws Exception;
    TypedSuperExpression semantikCheck(SuperExpression untyped) throws Exception;
    TypedThisExpression semantikCheck(ThisExpression untyped) throws Exception;
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

