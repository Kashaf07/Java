public class s_thread 
{
    public static void main(String args[])
    {
        Table t1=new Table();
        Thread1 th1=new Thread1(t1);
        Thread2 th2=new Thread2(t1);
        th1.start();
        th2.start();
        
    }
    
}

class Table
{
    synchronized public void printTable(int n)
    {
        for(int i = 1;i<=5;i++)
        {
            System.out.println(i*n);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(10);
    }
}