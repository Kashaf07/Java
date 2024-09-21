public class Super_keyword
{
    public static void main(String args[])
    {
        mybox b1=new mybox(2,3,4);
        b1.area();
        b1.volume();
    }
}

class box
{
    int l,w,area1;
    box(int l1, int w1)
    {
        l=l1;
        w=w1;
    }
    void area()
    {
        area1=l*w;
    }
}
class mybox extends box
{
    int d;
    mybox(int l1, int w1, int d1)
    {
        super(l1,w1);
        d=d1;
    }
    void volume()
    {
        int vol;
        vol=l*w*d;
        System.out.println("Volume is: "+vol);
    }
}