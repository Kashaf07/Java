public class Encapsulation
{
    public static void main(String args[])
    {
        Emp e1=new Emp();
        e1.setEid(101);
        e1.setEname("Kashaf");
        System.out.println("EmpID: "+e1.getEid());
        System.out.println("Emp Name: "+e1.getEname());
    }
}

class Emp
{
    private int eid;
    private String ename;

    void setEid(int id)
    {
        eid=id;
    }
    int getEid()
    {
        return eid;
    }

    void setEname(String name)
    {
        ename=name;
    }
    String getEname()
    {
        return ename;
    }
}