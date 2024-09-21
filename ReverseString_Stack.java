// Practical Question Set-B. Write a code for printing reverse string using Stack Concept.
import java.util.Scanner;
public class ReverseString_Stack
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sn.nextLine();
        int n = s1.length();
        char[] charArray = s1.toCharArray();
        System.out.println("The String in Reverse Order:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(" "+charArray[i]);
        }
    }
}