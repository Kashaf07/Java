public class emp
{
    int id;
    String name;
    long salary;
    public void display()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
    }
    public static void main(String[] args)
    {
        emp e1=new emp();
        e1.id=101;
        e1.name="Kashaf";
        e1.salary=90000;
        e1.display();
    } 
}