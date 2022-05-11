import Common.AccessModifiers;
import Common.Block;
import Common.Class;
import Common.Program;
import Expressions.*;
import typedExpressions.*;
import typedStatements.*;
import Statements.*;
import typedCommon.*;

public interface SemantikCheck {
    TypedAccessModifiers semantikCheck(AccessModifiers untyped);
    TypedBlock semantikCheck(Block untyped);
    TypedClass semantikCheck(Class untyped);
    TypedProgram semantikCheck(Program untyped);

    TypedBinaryExpression semantikCheck(BinaryExpression untyped);
    TypedCompareExpression semantikCheck(CompareExpression untyped);
    TypedConstExpression semantikCheck(ConstExpression untyped);
    TypedJNullExpression semantikCheck(JNullExpression untyped);
    TypedSuperExpression semantikCheck(SuperExpression untyped);
    TypedThisExpression semantikCheck(ThisExpression untyped);
    TypedTypeExpression semantikCheck(TypeExpression untyped);
    TypedUnaryExpression semantikCheck(UnaryExpression untyped);

    TypedIfElseStatement semantikCheck(IfElseStatement untyped);

}

