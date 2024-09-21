class A 
{
    int i;
    int j;
    
    public void show()
    {
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
class B extends A
{
    int k;
    
    public void display()
    {
        System.out.println("k="+i);
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}

public class single_inherit
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.i=10;
        b1.j=20;
        b1.k=30;
        b1.show();
        b1.display();
    }
}