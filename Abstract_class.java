public class Abstract_class

{
    public static void main(String args[])
    {
        derived d1=new derived();
        d1.fun();
    }
}
abstract class Base
{
    Base()
    {
        System.out.println("Base Constructor call");
    }
    abstract void fun();
}
class derived extends Base
{
    derived()
    {
        System.out.println("Derived Constructor call");
    }
    void fun()
    {
        System.out.println("Derived fun() call");
    }
}