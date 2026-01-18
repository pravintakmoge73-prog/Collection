/*Q3. Demonstrate the use of sleep() method to pause a thread for some time.
*/

class Table 
{
	public synchronized void printTable(int num)
	{
		try{
			for(int i=1 ; i<=10; i++)
			{
				System.out.println(num +" X "+i+" ---> "+num*i);
				if(i==5)
				{
					System.out.println("Sleep method is working");
					Thread.sleep(5000);
				}
			}
		}catch(Exception ex)
		{
			System.out.println("Exception Occure "+ex);
		}
	}
}

class OneTable extends Thread
{
	Table table;
	public void setTable(Table table)
	{
		this.table = table;
	}
	
	public void run()
	{
		table.printTable(1);
	}
	
}

class TwoTable extends Thread
{
	Table table;
	TwoTable(Table table)
	{
		this.table=table;
	}
	
	public void run()
	{
		table.printTable(2);
	}
}

public class UseOfSleepMethod
{
	public static void main(String[] args)throws InterruptedException
	{
		Table t = new Table();
		
		OneTable one = new OneTable();
		one.setTable(t);
		one.start();
		
		TwoTable two = new TwoTable(t);
		two.start();
		one.join();
		
	}
}