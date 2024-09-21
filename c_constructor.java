public class c_constructor
{
    String sname;
    
    public c_constructor()
    {
        sname="Kashaf"; 
    } 
    public static void main(String[] args)
    {
        c_constructor myObj=new c_constructor();
        System.out.println(myObj.sname);
    }
}