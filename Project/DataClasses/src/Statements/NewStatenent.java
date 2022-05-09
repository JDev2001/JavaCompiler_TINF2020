package Statements;

import Expressions.IExpression;
import Expressions.InstVarExpression;
import Types.IType;

/***
 * Instanzierung einer Klasse
 * new ABC(5,false);
 */
public class NewStatenent implements IStatement
{
    MethodCallStatement constructorCall; //Konstruktoren müssen als Methoden mit Rückgabetyp Void geparst werden
    IType type;

    public NewStatenent(MethodCallStatement constructorCall, IType type)
    {
        this.constructorCall = constructorCall;
        this.type = type;
    }

    public MethodCallStatement getConstructorCall()
    {
        return constructorCall;
    }

    public IType getType()
    {
        return type;
    }
}
