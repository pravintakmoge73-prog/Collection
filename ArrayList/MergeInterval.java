/*2. Merge intervals
Description:
Given a list of intervals, merge all overlapping intervals and return the merged list sorted by starting time.
Example:
Input: [[1,3],[2,6],[8,10]]
Output: [[1,6],[8,10]]
*/

import java.util.*;
public class MergeInterval
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		ArrayList<int[]> intervals = new ArrayList<>();
		
		System.out.println("Enter Number of intervals :");
		int n= sc.nextInt();
		
		
		//Take inpuit intervals
		for(int i=0; i<n; i++)
		{
			System.out.println("ENter start and end of intervals :");
			int start = sc.nextInt();
			int end = sc.nextInt();
			intervals.add(new int[]{start, end});
		}
		
		//Sorting The intervals
		//Collections.sort(intervals, (a, b) -> a[0] - b[0]);

		for(int i=0; i<intervals.size(); i++)
		{
			for(int j=i+1; j<intervals.size(); j++)
			{
				if(intervals.get(i)[0] > intervals.get(j)[0])
				{
					int[] temp = intervals.get(i);
					intervals.set(i, intervals.get(j));
					intervals.set(j, temp);
				}
			}
		}
		
		//declare new ArrayList to Store merged intervals
		
		ArrayList<int[]> merged = new ArrayList<>();
		merged.add(intervals.get(0));
		
		//merged logic
		
		for(int i=0; i<intervals.size(); i++)
		{
			int[] last = merged.get(merged.size()-1);
			int[] current = intervals.get(i);
			
			if(last[1] >= current[0])
			{
				if(last[1] > current[1])
				{
					last[1]=last[1];
				}
				else
				{
					last[1]=current[1];
				}
			}
			else
			{
				merged.add(current);
			}
		}
		
		//printing result
		System.out.println("Merged Intervals :");
		for(int[] interval : merged) 
		{
			System.out.print("["+interval[0]+", "+interval[1]+"]  ");
		}
		sc.close();
	}
}
/*{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		while(b!=0)
		{
			int carry = a&b;
			a = a^b;
			b= carry<<1;
		}
		System.out.println("Addition is "+a);
	}
}*/