/*Q5. Create a Java program to process a range of numbers using multithreading.
Requirements:
1. Accept a number N from the user.
2. Create two threads:
EvenThread: Prints all even numbers from 1 to N and calculates their sum.
OddThread: Prints all odd numbers from 1 to N and calculates their product.
3. Use Thread.join() to ensure both threads complete before the main thread
prints results.
4. Display the sum of even numbers and product of odd numbers at the end.
Logic Operations Involved:
. Thread creation and execution order
. Mathematical sum and product calculations
. Thread coordination*/

import java.util.*;
class opClass
{
	public long doOperation(int n, boolean isEven)
	{
		long result = isEven ? 0 :1;
		String label = isEven ? "Even" : "Odd";
        
        System.out.print(label + " Numbers: ");
		
		for(int i=1; i<=n; i++)
		{
			if(isEven && i%2==0)
			{
				System.out.print(i+" ");
				result += i;
			}
			else if(!isEven && i%2!=0)
			{
				System.out.print(i+" ");
				result *= i;
			}
		}
		System.out.println();
		return result;
	}
}

class Even extends Thread
{
	opClass op = new opClass();
	int n;
	Even(int n)
	{
		this.n=n;
	}
	long sum;
	
	public void run()
	{
		sum = op.doOperation(n, true);
	}
}

class Odd extends Thread
{
	opClass opr = new opClass();
	int n;
	Odd(int n)
	{
		this.n=n;
	}
	long mul;
	public void run()
	{
		mul=opr.doOperation(n,false);
	}
}

class EvenOddSumMul
{
	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number :");
		int n = sc.nextInt();
		
		Even e = new Even(n);
		Odd o = new Odd(n);
		
		e.start();
		e.join();
		o.start();
		
		
		o.join();
		
		System.out.println("Result :");
		System.out.println("Sum of Evem number : "+e.sum);
		System.out.println("Multiplication of odd Num : "+o.mul);
		
		
		
	}
}