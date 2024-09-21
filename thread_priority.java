public class thread_priority extends Thread  // default priority is 5 and lowest priority is 1 & max is 10
{
    public void run()
    {
        
    }
    public static void main(String args[])
    {
        thread_priority t1=new thread_priority();
        thread_priority t2=new thread_priority();
        thread_priority t3=new thread_priority();
        
        System.out.println("Thread1 Priority="+t1.getPriority());
        System.out.println("Thread2 Priority="+t2.getPriority());
        System.out.println("Thread3 Priority="+t3.getPriority());
        
        t1.setPriority(4);
        t2.setPriority(6);
        t3.setPriority(9); 
        
        System.out.println("Thread1 Priority="+t1.getPriority());
        System.out.println("Thread2 Priority="+t2.getPriority());
        System.out.println("Thread3 Priority="+t3.getPriority());
        
        System.out.println("Thread name is= "+Thread.currentThread().getName());
        System.out.println("Main thread Priority= "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread Priority= "+Thread.currentThread().getPriority());
    }
}