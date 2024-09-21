import java.util.Scanner;
public class Reverse_stack {
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String s1 =  sn.nextLine();
        int n = s1.length();
        char[] charArray = s1.toCharArray();
        //System.out.print(n);
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(" "+charArray[i]);
        }
    }
}