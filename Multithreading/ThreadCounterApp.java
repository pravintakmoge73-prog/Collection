/*Q9. Write a Java program with two threads, where one thread sleeps for 2 seconds and the other executes immediately.
 Observe the execution order.
Explanation : This question helps:
Understand Thread.sleep()
Execution delay effect
Thread scheduling behavior
*/
class FastThread extends Thread {
    public void run()
	{
		//try{
			for (int i = 1; i <= 10; i++) 
			{
				System.out.println("Fast Thread: " + i);
				//Thread.sleep(1000);
			}
			System.out.println("--- Fast Thread Completed ---");
		/*}catch(InterruptedException ex){
			System.out.println("Exception is "+ex);
		}*/
    }
}

class SlowThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Slow Thread: " + i + " (Sleeping 2s)");
                Thread.sleep(2000); // Pause for 2 seconds
            }
            System.out.println("--- Slow Thread Completed ---");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadCounterApp {
    public static void main(String[] args)
	{
        FastThread fast = new FastThread();
        SlowThread slow = new SlowThread();

        // Starting both threads
        slow.start();
        fast.start();
    }
}
