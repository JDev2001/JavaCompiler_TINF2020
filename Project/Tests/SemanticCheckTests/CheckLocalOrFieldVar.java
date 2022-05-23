package SemanticCheckTests;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Expressions.ConstExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Method.Method;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.VoidType;
import SemanticCheck.Factory.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedConstExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedLocalOrFieldVar;
import SemanticCheck.TypedDataClasses.typedStatementExpression.TypedAssignStatementExpression;
import SemanticCheck.TypedDataClasses.typedStatements.TypedVarDeclarationStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckLocalOrFieldVar
{
    @Test
    public void CheckLocalVarBool() throws Exception
    {

        //bool b; b=false;
        var block = new Block(List.of(
                new VarDeclarationStatement("b", new BoolType()),
                new AssignStatementExpression(new LocalOrFieldVar("b"), new ConstExpression(false))
        ));
        var untyped = new Class("MyClass",new ArrayList<>(),
                List.of(new Method(AccessModifiers.Public,"Foo", new ArrayList<>(), new VoidType(), block)), new ArrayList<>());

        var checker = new SemantikCheckImpl();
        var typedClass = checker.semantikCheck(untyped);

        var typedBlock= ((TypedBlock)typedClass.methods().get(0).statement());

        var expected = new TypedBlock(List.of(
                new TypedVarDeclarationStatement("b", new BoolType(), new VoidType()),
                new TypedAssignStatementExpression(
                        new TypedLocalOrFieldVar("b", new BoolType()),
                        new TypedConstExpression(false,new BoolType())
                , new BoolType())), new VoidType());

        Assertions.assertEquals(expected,typedBlock);

    }
    @Test
    public void CheckFieldVarBool() throws Exception
    {

        //private bool b; void Foo() { b=false; } ;
        var block = new Block(List.of(
                new AssignStatementExpression(new LocalOrFieldVar("b"), new ConstExpression(false))
        ));
        var untyped = new Class("MyClass",new ArrayList<>(),
                List.of(new Method(AccessModifiers.Public,"Foo", new ArrayList<>(), new VoidType(), block)),
                List.of(new Field("b", new BoolType(),AccessModifiers.Private)));

        var checker = new SemantikCheckImpl();
        var typedClass = checker.semantikCheck(untyped);

        var typedBlock= ((TypedBlock)typedClass.methods().get(0).statement());

        var expected = new TypedBlock(List.of(
                new TypedAssignStatementExpression(
                        new TypedLocalOrFieldVar("b", new BoolType()),
                        new TypedConstExpression(false,new BoolType())
                        , new BoolType())), new VoidType());

        Assertions.assertEquals(expected,typedBlock);

    }
}
