class emp
{
    int id;
    String name;
    
    public void show()
    {
        System.out.println("Empid="+id);
        System.out.println("EmpName="+name);
    }
}
class dept extends emp
{
    int sal;
    String dname;
    
    public void display()
    {
        System.out.println("Emp Id="+id);
        System.out.println("Emp Name="+name);
        System.out.println("Dept Name="+dname);
        System.out.println("Salary="+sal);
    }
}

public class emp_dept
{
    public static void main(String args[])
    {
        dept d1=new dept();
        d1.id=101;
        d1.name="Kashaf";
        d1.dname="CEO";
        d1.sal=1000000;
        d1.show();
        d1.display();
    }
}