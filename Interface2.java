public class Interface2
{
    public static void main(String args[])
    {
        drawable d1=new rectangle();
        d1.draw();
        drawable d2=new circle();
        d2.draw();
    }
    
}
interface drawable
{
    void draw();
}
class rectangle implements drawable
{
    public void draw()
    {
           System.out.println("draw rectangle");
    }
    
}   
class circle implements drawable
{
    public void draw()
    {
        System.out.println("draw circle");
    }        
}