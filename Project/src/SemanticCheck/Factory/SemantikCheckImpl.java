package SemanticCheck.Factory;

import Parser.DataClasses.Common.*;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Expressions.*;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Method.*;
import Parser.DataClasses.StatementExpression.*;
import Parser.DataClasses.Statements.*;
import Parser.DataClasses.Types.*;
import SemanticCheck.TypedDataClasses.typedCommon.*;
import SemanticCheck.TypedDataClasses.typedExpressions.*;
import SemanticCheck.TypedDataClasses.typedMethod.*;
import SemanticCheck.TypedDataClasses.typedStatementExpression.*;
import SemanticCheck.TypedDataClasses.typedStatements.*;

import java.util.*;

public class SemantikCheckImpl implements SemantikCheck{

    Class currentClass;
    Method currentMethod;
    Stack<List<TypedVarDeclarationStatement>> varDeclarationStatements = new Stack<>();
    List<Class> classList;

    public TypedProgram semantikCheckStart(Program semantikCheckProgram) throws Exception {
        classList = semantikCheckProgram.classes();
        List<TypedClass> typedClassList = new ArrayList<>();
        for (Class semantikCheckClass : classList) {
            currentClass = semantikCheckClass;
            typedClassList.add(semantikCheck(semantikCheckClass));
        }
        return new TypedProgram(typedClassList);
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
            case UnaryExpression unaryExpression -> {
                return semantikCheck(unaryExpression);
            }
            case LocalOrFieldVar localOrFieldVar ->
            {
                return semantikCheck(localOrFieldVar);
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
        IMethodType type = null;
        List<ITypedStatement> typedStatements = new ArrayList<>();

        varDeclarationStatements.push(new ArrayList<>());

        for (IStatement statement : untyped.statements()) {
            ITypedStatement typedStatement;
            switch (statement) {
                case IStatementExpression istatementExpression -> typedStatement = checkStatementExpression(istatementExpression);

                case IStatement iStatement -> typedStatement = checkStatement(iStatement);
            }

            switch (typedStatement) {
                case TypedBlock typedBlock -> {
                    if (!(typedBlock.getType() instanceof VoidType)) {
                        if (type != null && type != typedBlock.getType()){
                            throw new Exception("Invalid type");
                        }
                        type = typedBlock.getType();
                    }
                }

                case TypedReturnStatement typedReturnStatement -> {
                    if (type != null && type != typedReturnStatement.getType()){
                        throw new Exception("Invalid type");
                    }
                    type = typedReturnStatement.getType();
                }

                case ITypedStatement iTypedStatement -> {
                }
            }
            typedStatements.add(typedStatement);
        }
        if (type == null){
            type = new VoidType();
        }

        varDeclarationStatements.pop();
        return new TypedBlock(typedStatements, type);
    }

    public TypedClass semantikCheck(Class untyped) throws Exception {
        List<TypedMethod> typedConstructors = new ArrayList<>();
        List<TypedMethod> typedMethods = new ArrayList<>();
        List<Field> typedFields = new ArrayList<>(untyped.fields());

        for (Method constructor : untyped.constructor()){
            semantikCheckMethodParameter(typedConstructors, constructor);
        }

        for (Method semantikCheckMethod : untyped.methods()){
            currentMethod = semantikCheckMethod;
            varDeclarationStatements.push(new ArrayList<>());
            typedMethods.add(checkMethod(semantikCheckMethod));
        }
        return new TypedClass(untyped.identifier(), typedConstructors, typedMethods, typedFields);
    }

    private TypedMethod checkMethod(Method method) throws Exception {
        var typedBlock = checkStatement(method.statement());
        var typedParameters =method.parameters().stream().map(x->new TypedMethodParameter(x.identifier(),x.type(),x.type())).toList();
        return new TypedMethod(method.accessModifier(),method.identifier(),typedParameters,method.returnType(),typedBlock,typedBlock.getType());
    }

    private void semantikCheckMethodParameter(List<TypedMethod> typedMethods, Method method) throws Exception {
        List<TypedMethodParameter> typedMethodParameters = new ArrayList<>();
        ITypedStatement typedStatement = checkStatement(method.statement());

        for (MethodParameter parameter : method.parameters()){
            typedMethodParameters.add(new TypedMethodParameter(parameter.identifier(), parameter.type(), parameter.type()));
        }

        typedMethods.add(new TypedMethod(method.accessModifier(), method.identifier(), typedMethodParameters,
                method.returnType(), typedStatement, typedStatement.getType()));
    }


    public TypedBinaryExpression semantikCheck(BinaryExpression untyped) throws Exception {
        ITypedExpression typedA = checkExpression(untyped.a());
        ITypedExpression typedB = checkExpression(untyped.b());
        String operator = untyped.operator();

        switch (operator) {
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
            default: throw new Exception("Invalid type");
        }
    }

    public TypedConstExpression semantikCheck(ConstExpression untyped) throws Exception {
        var value = untyped.value();

        switch (value) {
            case Integer i -> { return new TypedConstExpression(i, new IntType()); }
            case Boolean b -> { return new TypedConstExpression(b, new BoolType()); }
            case Character c -> { return new TypedConstExpression(c, new CharType()); }
            default -> throw new Exception("Invalid type");
        }
    }

    public TypedLocalOrFieldVar semantikCheck(LocalOrFieldVar untyped) throws Exception {
        var optionalTypedVarDeclarationStatement = varDeclarationStatements.stream().flatMap(Collection::stream).filter(x -> x.name().equals(untyped.name())).findFirst();
        var optionalMethodParameter = currentMethod.parameters().stream().filter(x -> x.identifier().equals(untyped.name())).findFirst();
        var optionalField = currentClass.fields().stream().filter(x-> x.name().equals(untyped.name())).findFirst();

        //TODO: Variable entfernen, nachdem Block verlassen wird
        if (optionalTypedVarDeclarationStatement.isPresent()){
            return new TypedLocalOrFieldVar(untyped.name(), optionalTypedVarDeclarationStatement.get().type());
        }
        else if (optionalMethodParameter.isPresent()){
            return new TypedLocalOrFieldVar(untyped.name(), optionalMethodParameter.get().type());
        }
        else if (optionalField.isPresent()){
            return new TypedLocalOrFieldVar(untyped.name(), optionalField.get().type());
        }
        throw new Exception("Variable" + untyped.name() + "not found");
    }

    public TypedJNullExpression semantikCheck(JNullExpression untyped) throws Exception {
        return new TypedJNullExpression(new CustomType("Object"));
    }

    public TypedSuperExpression semantikCheck(SuperExpression untyped) throws Exception {
        return new TypedSuperExpression(new CustomType("Object"));
    }

    public TypedThisExpression semantikCheck(ThisExpression untyped) throws Exception {
        return new TypedThisExpression(new CustomType(currentClass.identifier()));
    }

    public TypedUnaryExpression semantikCheck(UnaryExpression untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        String operator = untyped.operator();

        switch(operator){
            case "!":
                if(typedExpression.getType() instanceof BoolType){
                    return new TypedUnaryExpression(typedExpression, operator, typedExpression.getType());
                }
                else {
                    throw new Exception("Invalid type");
                }
            case "+":
            case "-":
            case "/":
            case "*":
                if(typedExpression.getType() instanceof IntType){
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

        if (typedExpressionB.getType() == typedExpressionB.getType()){
            return new TypedAssignStatementExpression(typedExpressionA, typedExpressionB, typedExpressionA.getType());
        }
        else{
            throw new Exception("Incompatible types");
        }
    }

    public TypedInstVarStatementExpression semantikCheck(InstVarStatementExpression untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        var optionalClass = classList.stream().filter(x -> x.identifier().equals(typedExpression.getType().getName())).findFirst();

        if (optionalClass.isPresent()){
            var optionalField = optionalClass.get().fields().stream().filter(x -> x.name().equals(untyped.varName())).findFirst();
            if(optionalField.isPresent()){
                return new TypedInstVarStatementExpression(untyped.varName(), typedExpression, optionalField.get().type());
            }
            else {
                throw new Exception("Can not find field");
            }
        }
        else{
            throw new Exception("Can not find class");
        }
    }

    public TypedMethodCallStatementExpression semantikCheck(MethodCallStatementExpression untyped) throws Exception {
        ITypedExpression typedTarget = checkExpression(untyped.target());
        List<ITypedExpression> typedParameters = new ArrayList<>();
        ITypedExpression typedParameter;

        for (IExpression parameter : untyped.parameters()) {
            typedParameter = checkExpression(parameter);
            typedParameters.add(typedParameter);
        }
        var method = currentClass.methods().stream().filter(x-> x.identifier().equals(untyped.name())).findFirst();
        if(method.isEmpty())
            throw new Exception("Method not found");

        var type = method.get().returnType();
        return new TypedMethodCallStatementExpression(untyped.name(), typedTarget, typedParameters, type);
    }

    public TypedNewStatementExpression semantikCheck(NewStatementExpression untyped) throws Exception {
        ITypedStatementExpression typedConstructorCall = checkStatementExpression(untyped.constructorCall());
        return new TypedNewStatementExpression((TypedMethodCallStatementExpression) typedConstructorCall, new CustomType(untyped.constructorCall().name()), typedConstructorCall.getType());
    }

    public TypedIfElseStatement semantikCheck(IfElseStatement untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        ITypedStatement typedIfBlock = checkStatement(untyped.ifBlock());
        ITypedStatement typedElseBlock = checkStatement(untyped.elseBlock());

        if (typedExpression.getType() instanceof BoolType && typedIfBlock.getType().equals(typedElseBlock.getType())) {
            return new TypedIfElseStatement(typedExpression, (TypedBlock) typedIfBlock, (TypedBlock) typedElseBlock, typedIfBlock.getType());
        }
        else{
            throw new Exception("Invalid type");
        }
    }

    public TypedReturnStatement semantikCheck(ReturnStatement untyped) throws Exception {
        ITypedExpression typedReturnValue = checkExpression(untyped.returnValue());

        if (typedReturnValue == null) {
            return new TypedReturnStatement(null, new VoidType());
        }
        else {
            return new TypedReturnStatement(typedReturnValue, typedReturnValue.getType());
        }
    }

    public TypedVarDeclarationStatement semantikCheck(VarDeclarationStatement untyped) throws Exception {
        var typedVarDeclarationStatement = new TypedVarDeclarationStatement(untyped.name(), untyped.type(), new VoidType());

        for(TypedVarDeclarationStatement varDeclarationStatement : varDeclarationStatements.peek()){
            if(varDeclarationStatement.name().equals(typedVarDeclarationStatement.name())){
                throw new Exception("Variable" + untyped.name() + "is already defined");
            }
        }
        varDeclarationStatements.peek().add(typedVarDeclarationStatement);
        return typedVarDeclarationStatement;
    }

    public TypedWhileStatement semantikCheck(WhileStatement untyped) throws Exception {
        ITypedExpression typedExpression = checkExpression(untyped.expression());
        ITypedStatement typedBlock = checkStatement(untyped.block());

        if (typedExpression.getType() instanceof BoolType && typedBlock instanceof TypedBlock) {
            return new TypedWhileStatement((TypedBinaryExpression) typedExpression, (TypedBlock) typedBlock, typedBlock.getType());
        }
        else {
            throw new Exception("Invalid type");
        }
    }
}
