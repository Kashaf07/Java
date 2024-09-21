public class con_para
{
    int id;
    String name;

    public con_para(int i, String n)
    {
        id=i;
        name=n;
    }
    public void display()
    {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
    public static void main(String args[])
    {
        con_para c1=new con_para(101,"Kashaf");
        c1.display();
    }
}