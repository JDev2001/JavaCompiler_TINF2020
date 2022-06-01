
public class MyClass
{

    int i;

    public MyClass(){
        i = 13;
    }

    public int Method(int a, int b)
    {
        return a+b;
    }
    public int Method2()
    {
        return A();
    }

    public int A(){
        return i;
    }

    public int GetData()
    {
        Data d;
        d = new Data(2);
        return d.GetID()*10+2;
    }

}

public class Data
{
    private int id;
    public Data(int id)
    {
        this.id = id;
    }
    public int GetID()
    {
        return id;
    }
}