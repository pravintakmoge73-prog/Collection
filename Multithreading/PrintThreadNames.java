/*Q2. Create a thread by implementing Runnable interface and display thread names.
*/

class MyThread implements Runnable
{
	public synchronized void run()
	{
		try{
			System.out.println("Current Thread is "+Thread.currentThread().getName());
		}catch(Exception ex)
		{
			System.out.println("Exception is "+ ex);
		}
	}
}

public class PrintThreadNames
{
	public static void main(String[] args)
	{
		Runnable one = new MyThread();
		Thread t = new Thread(one, "First-Thread");
		t.start();
		
		Runnable two = new MyThread();
		t = new Thread(two, "Second-Thread");
		t.start();
		
		System.out.println("Main method is running in : "+Thread.currentThread().getName());
	}
}