public class thread_2 implements Runnable 
{
    public void run()
    {
        System.out.println("Thread is Running...");
    }
    public static void main(String args[])
    {
        thread_2 t1 = new thread_2();
        Thread th1 = new Thread(t1);
        th1.start();
    }
}