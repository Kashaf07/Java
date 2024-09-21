import java.util.*;
public class Stack_reverse 
{
    public static void PAB(String data, Stack<String> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        String top = s.pop();
        PAB(data,s);
        s.push(top);
    }

    public static void reverse(Stack<String> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        String top = s.pop();
        reverse(s);
        PAB(top, s);
    }

    public static void main(String args[])
    {
        Stack<String> s = new Stack<>();
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sn.nextLine();
        System.out.println("The String:" + s1);
        s.push("K");
        s.push("C");
        s.push("A");
        s.push("T");
        s.push("S");

        System.out.println("String Reversed");
        reverse(s);
        
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}