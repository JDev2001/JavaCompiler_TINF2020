
public class MyClass
{

    int i;

    public MyClass(){
        i = 3;
    }

    public int GetData(int pI, boolean pB)
    {
        Data d;
        d = new Data(2);
        if(pB)
        {
            return d.GetID()*pI+3-i;
        }
        else
        {
            return -1;
        }
    }

}

public class Data
{
    private int id;
    public Data(int pId)
    {
        this.id = pId;
    }
    public int GetID()
    {
        return id;
    }
}