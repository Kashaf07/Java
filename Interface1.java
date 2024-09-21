public class Interface1
{
    public static void main(String args[])
    {
       calculator c1=new calculator();
       c1.add();
       c1.mul();
    }        
}
interface addition
{
    void add();
}
interface multiple
{
    void mul();
}
class calculator implements addition,multiple
{
    public void add()
    {
        int c;
        c=10+20;
        System.out.println("addition="+c);
    }
    public void mul()
    {
        int m;
        m=10*20;
        System.out.println("multiplication="+m);
    }        
}
