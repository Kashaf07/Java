public class emps
{
    int id;
    String name;
    long salary;

    public void getdata()
    {
        id=101;
        name="Kashaf";
        salary=1000000;
    }
    
    public void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }
    public static void main(String[] args)
    {
        emps e1=new emps();
        e1.getdata();
        e1.display();
    } 
}