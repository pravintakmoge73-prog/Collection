/*Q1. Create a thread by extending Thread class and print numbers from 1 to 5.
*/

import java.util.*;
class ThreadOne extends Thread
{
	public void run()
	{
		try{
			for(int i=1; i<=5; i++)
			{
				System.out.printf("%d\t",i);
			}
		}catch(Exception ex){
			System.out.println("Exception Occur is "+ex);
		}
	}
}

public class PrintNumThread
{
	public static void main(String[] args)
	{
		ThreadOne t1 = new ThreadOne();
		t1.start();
	}
}