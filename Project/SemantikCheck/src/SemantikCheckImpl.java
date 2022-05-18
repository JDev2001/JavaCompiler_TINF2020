import java.util.List;

import typedCommon.*;
import typedExpressions.*;
import typedStatementExpression.*;
import typedStatements.*;

import Common.*;
import Common.Class;
import Expressions.*;
import Method.*;
import StatementExpression.*;
import Statements.*;
import Types.*;

public class SemantikCheckImpl implements SemantikCheck{

    public void semantikCheckStart(Program semantikCheckProgram) throws Exception {
        var classList = semantikCheckProgram.classes();
        for (Class semantikCheckClass : classList) {
            semantikCheck(semantikCheckClass);
            for (Method semantikCheckMethod : semantikCheckClass.methods()){
                switch (semantikCheckMethod.statement()) {
                    case IStatementExpression iStatementExpression -> checkStatementExpression(iStatementExpression);

                    case IExpression iExpression -> checkExpression(iExpression);

                    case IStatement iStatement -> checkStatement(iStatement);
                }
            }
        }
    }



    public ITypedExpression checkExpression(IExpression expression) throws Exception {
        switch (expression) {
            case BinaryExpression binaryExpression: { return semantikCheck(binaryExpression); }

            case ConstExpression constExpression: { return semantikCheck(constExpression); }

            case InstVarStatementExpression instVarStatementExpression: { return semantikCheck(instVarStatementExpression); }

            case JNullExpression jNullExpression: { return semantikCheck(jNullExpression); }

            case SuperExpression superExpression: { return semantikCheck(superExpression); }

            case ThisExpression thisExpression: { return semantikCheck(thisExpression); }

            case TypeExpression typeExpression: { return semantikCheck(typeExpression); }

            case UnaryExpression unaryExpression: { return semantikCheck(unaryExpression); }

            default: throw new IllegalStateException("Unexpected value: " + expression);
        }
    }

    public ITypedStatementExpression checkStatementExpression(IStatementExpression statementExpression) throws Exception {
        switch (statementExpression) {
            case AssignStatementExpression assignStatementExpression: { return semantikCheck(assignStatementExpression); }

            case MethodCallStatementExpression methodCallStatementExpression: { return semantikCheck(methodCallStatementExpression); }

            case NewStatementExpression newStatementExpression: { return semantikCheck(newStatementExpression); }

            default: throw new IllegalStateException("Unexpected value: " + statementExpression);
        }
    }

    public ITypedStatement checkStatement(IStatement statement) throws Exception {
        switch (statement) {
            case Block block: { return semantikCheck(block); }

            case IfElseStatement ifElseStatement: { return semantikCheck(ifElseStatement); }

            case ReturnStatement returnStatement: { return semantikCheck(returnStatement); }

            case VarDeclarationStatement varDeclarationStatement: { return semantikCheck(varDeclarationStatement); }

            case WhileStatement whileStatement: { return semantikCheck(whileStatement); }

            default: throw new IllegalStateException("Unexpected value: " + statement);
        }
    }



    public TypedBlock semantikCheck(Block untyped){
        return null;
    }

    public TypedClass semantikCheck(Class untyped){
        return null;
    }



    public TypedBinaryExpression semantikCheck(BinaryExpression untyped){
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
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        ITypedStatement typedIfBlock = checkStatement(untyped.ifBlock());
        ITypedStatement typedElseBlock = checkStatement(untyped.elseBlock());

        if (typedExpression.getType() instanceof BoolType
                && typedIfBlock.getType().equals(typedElseBlock.getType())) {

            return new TypedIfElseStatement(typedExpression, (TypedBlock) typedIfBlock, (TypedBlock) typedElseBlock, typedIfBlock.getType());
        }
        else{
            throw new Exception("");
        }
    }

    public TypedReturnStatement semantikCheck(ReturnStatement untyped){
        return null;
    }

    public TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped){
        return null;
    }

    public TypedWhileStatement semantikCheck(WhileStatement untyped) throws Exception {
        if (true) {
            return null;
        }
        else{
            throw new Exception("");
        }
    }

}
