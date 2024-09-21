public class method_swap
{
    static void swap(int a, int b)
    {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swap x="+ a);
        System.out.println("After swap y="+ b);
    }
    public static void main(String[] args)
    {
        int x=10,y=20;
        System.out.println("Before swap x="+x);
        System.out.println("Before swap y="+y);
        swap(x,y);
    }
}