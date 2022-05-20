package SemanticCheck;

import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.*;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.StatementExpression.IStatementExpression;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.DataClasses.StatementExpression.NewStatementExpression;
import Parser.DataClasses.Statements.*;
import Parser.DataClasses.Types.BoolType;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedExpressions.*;
import SemanticCheck.TypedDataClasses.typedStatements.*;
import SemanticCheck.TypedDataClasses.typedStatementExpression.ITypedStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedAssignStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedMethodCallStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedNewStatementExpression;
import Parser.DataClasses.Common.Class;
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
            case BinaryExpression binaryExpression -> {
                return semantikCheck(binaryExpression);
            }
            case ConstExpression constExpression -> {
                return semantikCheck(constExpression);
            }
            case InstVarStatementExpression instVarStatementExpression -> {
                return semantikCheck(instVarStatementExpression);
            }
            case JNullExpression jNullExpression -> {
                return semantikCheck(jNullExpression);
            }
            case SuperExpression superExpression -> {
                return semantikCheck(superExpression);
            }
            case ThisExpression thisExpression -> {
                return semantikCheck(thisExpression);
            }
            case TypeExpression typeExpression -> {
                return semantikCheck(typeExpression);
            }
            case UnaryExpression unaryExpression -> {
                return semantikCheck(unaryExpression);
            }
            default -> throw new IllegalStateException("Unexpected value: " + expression);
        }
    }

    public ITypedStatementExpression checkStatementExpression(IStatementExpression statementExpression) throws Exception {
        switch (statementExpression) {
            case AssignStatementExpression assignStatementExpression -> {
                return semantikCheck(assignStatementExpression);
            }
            case MethodCallStatementExpression methodCallStatementExpression -> {
                return semantikCheck(methodCallStatementExpression);
            }
            case NewStatementExpression newStatementExpression -> {
                return semantikCheck(newStatementExpression);
            }
            default -> throw new IllegalStateException("Unexpected value: " + statementExpression);
        }
    }

    public ITypedStatement checkStatement(IStatement statement) throws Exception {
        switch (statement) {
            case Block block -> {
                return semantikCheck(block);
            }
            case IfElseStatement ifElseStatement -> {
                return semantikCheck(ifElseStatement);
            }
            case ReturnStatement returnStatement -> {
                return semantikCheck(returnStatement);
            }
            case VarDeclarationStatement varDeclarationStatement -> {
                return semantikCheck(varDeclarationStatement);
            }
            case WhileStatement whileStatement -> {
                return semantikCheck(whileStatement);
            }
            default -> throw new IllegalStateException("Unexpected value: " + statement);
        }
    }



    public TypedBlock semantikCheck(Block untyped) throws Exception {
        //ITypedStatement typedStatements = checkStatement(untyped.statements());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedClass semantikCheck(Class untyped) throws Exception {
        //ITypedExpression typedConstructor = checkExpression(untyped.constructor());
        //ITypedExpression typedFields = checkExpression(untyped.fields());
        //ITypedExpression typedIdentifier = checkExpression(untyped.identifier());
        //ITypedExpression typedMethods = checkExpression(untyped.methods());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }



    public TypedBinaryExpression semantikCheck(BinaryExpression untyped) throws Exception {
        ITypedExpression typedA = checkExpression(untyped.a());
        ITypedExpression typedB = checkExpression(untyped.b());

        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedConstExpression semantikCheck(ConstExpression untyped) throws Exception {
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedJNullExpression semantikCheck(JNullExpression untyped) throws Exception {
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedSuperExpression semantikCheck(SuperExpression untyped) throws Exception {
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedThisExpression semantikCheck(ThisExpression untyped) throws Exception {
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedTypeExpression semantikCheck(TypeExpression untyped) throws Exception {
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedUnaryExpression semantikCheck(UnaryExpression untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }



    public TypedAssignStatementExpression semantikCheck(AssignStatementExpression untyped) throws Exception {
        ITypedExpression typedExpressionA = checkExpression(untyped.expressionA());
        ITypedExpression typedExpressionB = checkExpression(untyped.expressionB());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedInstVarStatementExpression semantikCheck(InstVarStatementExpression untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedMethodCallStatementExpression semantikCheck(MethodCallStatementExpression untyped) throws Exception {
        //ITypedExpression typedParameters = checkExpression(untyped.parameters());
        ITypedExpression typedTarget = checkExpression(untyped.target());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedNewStatementExpression semantikCheck(NewStatementExpression untyped) throws Exception {
        ITypedStatementExpression typedConstructorCall = checkStatementExpression(untyped.constructorCall());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
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
            throw new Exception("Invalid type");
        }
    }

    public TypedReturnStatement semantikCheck(ReturnStatement untyped) throws Exception {
        ITypedExpression typedReturnValue = checkExpression(untyped.returnValue());
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped) throws Exception {
        if (true) {
            return null;
        }
        else {
            throw new Exception("Invalid type");
        }
    }

    public TypedWhileStatement semantikCheck(WhileStatement untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        ITypedStatement typedBlock = checkStatement(untyped.block());

        if (typedExpression.getType() instanceof BoolType
                && typedBlock instanceof TypedBlock) {
            return new TypedWhileStatement((TypedBinaryExpression) typedExpression, (TypedBlock) typedBlock, typedBlock.getType());
        }
        else {
            throw new Exception("Invalid type");
        }
    }

}
