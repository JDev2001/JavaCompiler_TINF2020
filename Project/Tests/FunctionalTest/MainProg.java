public class MainProg
{
    public static void main(String[] args)
    {
        MyClass myClass = new MyClass();
        System.out.println(myClass.GetData(3,true));
        System.out.println(myClass.GetData(1,false));
    }
}