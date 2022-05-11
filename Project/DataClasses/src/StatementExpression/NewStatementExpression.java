package StatementExpression;

import Types.IType;

/***
 * Instanzierung einer Klasse
 * new ABC(5,false);
 */
public class NewStatementExpression implements IStatementExpression
{
    MethodCallStatementExpression constructorCall; //Konstruktoren müssen als Methoden mit Rückgabetyp Void geparst werden
    IType type;

    public NewStatementExpression(MethodCallStatementExpression constructorCall, IType type)
    {
        this.constructorCall = constructorCall;
        this.type = type;
    }

    public MethodCallStatementExpression getConstructorCall()
    {
        return constructorCall;
    }

    public IType getType()
    {
        return type;
    }
}
