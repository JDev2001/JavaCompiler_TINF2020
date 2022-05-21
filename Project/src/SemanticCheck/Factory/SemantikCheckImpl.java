package SemanticCheck.Factory;

import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Expressions.*;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.*;
import Parser.DataClasses.Statements.*;
import Parser.DataClasses.Types.*;
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
            case InstVarStatementExpression
                instVarStatementExpression -> {
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
        String operator = untyped.operator();

        switch (operator){
            case "+":
            case "-":
            case "/":
            case "*":
                if((typedA.getType() instanceof IntType || typedA.getType() instanceof CharType)
                        && (typedB.getType() instanceof IntType || typedB.getType() instanceof CharType)){
                    return new TypedBinaryExpression(typedA, typedB, operator, typedA.getType());
                }
                else{
                    throw new Exception("Invalid types Expression");
                }
            case "&":
            case "|":
                if(typedA.getType() instanceof BoolType && typedB.getType() instanceof BoolType){
                    return new TypedBinaryExpression(typedA, typedB, operator, typedA.getType());
                }
                else{
                    throw new Exception("Invalid type in Expression");
                }
            case "PlusEqual":
            case "MinusEqual":
                if(typedA.getType() instanceof IntType || typedA.getType() instanceof CharType
                        && typedB.getType() instanceof IntType || typedB.getType() instanceof CharType){
                    return new TypedBinaryExpression(typedA, typedB, operator, typedA.getType()); //TODO: BoolType
                }
                else{
                    throw new Exception("Invalid type");
                }
            case "Equal":
                if(typedA.getType() instanceof BoolType && typedB.getType() instanceof BoolType){
                    return new TypedBinaryExpression(typedA, typedB, operator, typedA.getType()); //TODO: BoolType
                }
            default: throw new Exception("Invalid type");

        }
    }

    public TypedConstExpression semantikCheck(ConstExpression untyped) throws Exception {

        var value = untyped.value();
        switch (value)
        {
            case Integer i ->{return new TypedConstExpression(i,new IntType());}
            case Boolean b ->{return new TypedConstExpression(b,new BoolType());}
            case Character c -> {return  new TypedConstExpression(c,new CharType());}
            default ->     throw new Exception("Invalid type");
        }
    }

    public TypedJNullExpression semantikCheck(JNullExpression untyped) throws Exception {
            return null;
    }

    public TypedSuperExpression semantikCheck(SuperExpression untyped) throws Exception {
        return null;
    }

    public TypedThisExpression semantikCheck(ThisExpression untyped) throws Exception {
            return null;
    }

    public TypedTypeExpression semantikCheck(TypeExpression untyped) throws Exception {
        return null;
    }

    public TypedUnaryExpression semantikCheck(UnaryExpression untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        String operator = untyped.operator();
        switch(operator){
            case "NotOperator":
                if(typedExpression.getType() instanceof BoolType){
                    return new TypedUnaryExpression(typedExpression, operator, typedExpression.getType());
                }
                else {
                    throw new Exception("Invalid type");
                }
            case "AddSubOperator":
            case "PointSlashOperator":
                if(typedExpression.getType() instanceof CharType || typedExpression.getType() instanceof IntType){
                    return new TypedUnaryExpression(typedExpression, operator, typedExpression.getType());
                }
                else{
                    throw new Exception("Invalid type");
                }
            default: throw new Exception("Invalid type");
        }
    }



    public TypedAssignStatementExpression semantikCheck(AssignStatementExpression untyped) throws Exception {
        ITypedExpression typedExpressionA = checkExpression(untyped.expressionA());
        ITypedExpression typedExpressionB = checkExpression(untyped.expressionB());

        return new TypedAssignStatementExpression(typedExpressionA, typedExpressionB, typedExpressionA.getType()); //TODO: void
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
        //List<ITypedExpression> typedParameters = checkExpression(untyped.parameters());
        ITypedExpression typedTarget = checkExpression(untyped.target());
        //return new TypedMethodCallStatementExpression(untyped.name(), typedTarget, typedParameters, typedParameters.getType());
        return null;
    }

    public TypedNewStatementExpression semantikCheck(NewStatementExpression untyped) throws Exception {
        ITypedStatementExpression typedConstructorCall = checkStatementExpression(untyped.constructorCall());

        return new TypedNewStatementExpression((TypedMethodCallStatementExpression) typedConstructorCall, untyped.type(), typedConstructorCall.getType()); //TODO: review
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
        if (typedReturnValue == null) {
            return null;
            //return new TypedReturnStatement(void); TODO: check
        }
        else {
            return new TypedReturnStatement(typedReturnValue, typedReturnValue.getType());
        }
    }

    public TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped) throws Exception {
        //TODO: already defined check
        //return new TypedVarDeclarationStatement(untyped.name(), untyped.type(), Typ); TODO: type
        return null;
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
