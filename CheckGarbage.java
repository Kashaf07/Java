public class CheckGarbage
{
    public void finalize()
    {
        System.out.println("Object is garbage collected");
    }
    public static void main(String args[])
    {
        CheckGarbage s1=new CheckGarbage();
        CheckGarbage s2=new CheckGarbage();
        s1=null;
        s2=null;
        System.gc();
    }
}