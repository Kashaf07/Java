public class Interface3
{
    public static void main(String args[])
    {
       calculator c1=new calculator();
       c1.add();
       c1.mul();
       c1.sub();
       c1.div();
       c1.per();
       
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
interface subtraction
{
    void sub();
}
interface division
{
    void div();
}
interface percantage
{
    void per();
}        
class calculator implements addition,multiple,subtraction,division,percantage
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
    public void sub()
    {
        int s;
        s=30-20;
        System.out.println("subtraction="+s);
    }
    public void div()
    {
        int d;
        d=50/10;
        System.out.println("division="+d);
    } 
    public void per()
    {
        float p;
        p=20*100/100;
        System.out.println("percantage="+p+"%");
    }        
    
}