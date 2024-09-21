public class con_overload 
{
    int a,b;
    
    public con_overload()
    {
        System.out.println("default constructor");

    }
    
    public con_overload(int x,int y)
    {
        a=x;
        b=y;
    }

    public void display()
    {
        System.out.println( "x="+a);  
        System.out.println( "y="+b);

    }

    public static void main(String args[])
    {
        con_overload c1=new con_overload(10,20);
        con_overload c2=new con_overload();
        c1.display(); 

    }

}