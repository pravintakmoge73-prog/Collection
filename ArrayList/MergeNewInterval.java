/*. Insert Interval
Description:
Insert a new interval into a sorted list of non-overlapping intervals and merge if required.
Example:
Input: intervals=[[1,3],[6,9]], newInterval=[2,5]
Output: [[1,5],[6,9]]
*/

import java.util.*;
public class MergeNewInterval
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<int[]> intr = new ArrayList<>();
		
		System.out.println("Enter Number of Intervals To be Stored :");
		int n=sc.nextInt();
		
		System.out.println("Insert interval into a sorted list and non-overlapping :");
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter start And end of Intervals :");
			int start = sc.nextInt();
			int end = sc.nextInt();
			intr.add(new int[]{start, end});
		}
		
		System.out.println("Intervals are :");
		/*for(int i=0; i<n; i++)
		{
			System.out.print(Arrays.toString(intr.get(i))+" ");
		}*/
		
		for(int[] elements :intr)
		{
			System.out.println("["+elements[0]+", "+elements[1]+"]");
		}
		System.out.println("Enter intervals do you wants to add :");
		//int m=sc.nextInt();
		
		for(int i=0; i<1; i++)
		{
			System.out.println("Enter start and end of Intervals :");
			int start =sc.nextInt();
			int end = sc.nextInt();
			intr.add(new int[]{start, end});
		}
		
		ArrayList<int[]> intr1 = new ArrayList<>();
		
		int[] secLastEle = intr.get(intr.size()-2);
		int[] lastEle = intr.get(intr.size()-1);
		
		if(secLastEle[0]>lastEle[0])
		{
			intr1 = sortIntervals(intr);
		}
		System.out.println("Intrvals After Merging :");
		for(int[] ele : intr1)
		{
			System.out.print("["+ele[0]+", "+ele[1]+"] ");
		}
	}
		
		//now sort the Intervals
	static ArrayList<int[]> sortIntervals(ArrayList<int[]> intr)
	{
		for(int i=0; i<intr.size(); i++)
		{
			for(int j=i+1; j<intr.size(); j++)
			{
				if(intr.get(i)[0] > intr.get(j)[0])
				{
					int[] temp = intr.get(i);
					intr.set(i, intr.get(j));
					intr.set(j, temp);
				}
			}
		}
			System.out.println("ok");

		
		System.out.println("Intervals After sorting :");
		
		for(int[] elements :intr)
		{
			System.out.println("["+elements[0]+", "+elements[1]+"]");
		}
		ArrayList<int[]> intr1=new ArrayList<>();
		intr1.add(intr.get(0));
		
		for(int j=0; j<intr.size(); j++)
		{
			int[] last = intr1.get(intr1.size()-1);
			int[] current = intr.get(j);
			if(last[1]>=current[0])
			{
				if(last[1]>current[0])
				{
					last[1] = last[1];
				}
				else
				{
					last[1] = current[0];
				}
			}
			else
			{
				intr1.add(current);
			}
			
		}
		return intr1;
	}
}