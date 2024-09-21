public class studs
{
    int no;
    String name;
    int percentage;
    String grade;

    public void getdata()
    {
        no=101;
        name="Kashaf";
        percentage=100;
        grade="A";
    }
    
    public void display()
    {
        System.out.println("Roll no="+no);
        System.out.println("name="+name);
        System.out.println("percentage="+percentage+"%");
        System.out.println("grade="+grade);
    }
    public static void main(String[] args)
    {
        studs s1=new studs();
        s1.getdata();
        s1.display();
    } 
}