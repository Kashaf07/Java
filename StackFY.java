public class StackFY 
{
    int top=0;
    int[] stackData;
    StackFY(int n)
    {
        stackData = new int[n];
    }
    void push(int x)
    { 
        int t = isFull();
        if(t==0)
        {
            System.out.println("Stack is Overflow");
        }
        else
        {
            stackData[top]=x;
            top++;
            System.out.println("One Element is Pushed ");
        }
    
    }
    void pop()
    { 
        int t = isEmpty();
        if(t==0)
        {
            System.out.println("Stack is Underflow");
        }
        else
        {
            top--;
            System.out.println("One Element is Poped");
        }
    
    }
    void display()
    {
        int t = isEmpty();
        if(t==0)
        {
            System.out.println("Stack is Underflow");
        }
        else
        {
            for(int i=0;i<top;i++)
            {
                System.out.println("Element -> "+stackData[i]);
            }
        }
    }
    int isEmpty()
    {
        if(top==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    int isFull()
    {
        if(top==5)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[]) 
    {
        StackFY sfy = new StackFY(5);
        sfy.display();
        sfy.push(5);
        sfy.push(10);
        sfy.push(15);
        sfy.push(20);
        sfy.push(25);
        sfy.push(30);
        sfy.display();
        sfy.pop();
        sfy.pop();
        sfy.pop();
        sfy.pop();
        sfy.pop();
        sfy.pop();
    }
}