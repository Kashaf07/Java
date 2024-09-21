public class Fibonacci 
{
    public static int fibonacci(int n) 
    {
        if (n <= 1) 
        {
            return n; // Base case: F(0) = 0 and F(1) = 1
        } 
        else 
        {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: F(n) = F(n-1) + F(n-2)
        }
    }

    public static void main(String[] args) 
    {
        int n = 10; // Number of terms to calculate
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacci(i) + " "); // Print each Fibonacci number
        }
    }
}
