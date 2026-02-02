import java.util.Scanner;

class SharedResource
{
    synchronized void useResource(String name)
    {
        System.out.println(name + " got the lock");

        try
        {
            System.out.println(name + " is working (sleep)");
            Thread.sleep(2000);        // lock NOT released

            System.out.println(name + " is waiting");
            wait();                    // lock RELEASED
        }
        catch (Exception e) {}

        System.out.println(name + " resumed and finished work");
    }

    synchronized void notifyThreads()
    {
        System.out.println("CMD triggered notifyAll()");
        notifyAll();   // wake ALL waiting threads
    }
}

class WorkerThread extends Thread
{
    SharedResource res;

    WorkerThread(SharedResource res)
    {
        this.res = res;
    }

    public void run()
    {
        res.useResource(Thread.currentThread().getName());
    }
}

public class SleepWaitSingleExample
{
    public static void main(String[] args)
    {
        SharedResource resource = new SharedResource();

        WorkerThread t1 = new WorkerThread(resource);
        WorkerThread t2 = new WorkerThread(resource);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        // ---- CMD CONTROL ----
        Scanner sc = new Scanner(System.in);
        System.out.println("Type ENTER to notify waiting threads...");
        sc.nextLine();     // wait for user input from CMD

        resource.notifyThreads();
    }
}
