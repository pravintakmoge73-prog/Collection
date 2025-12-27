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
		
		System.out.println("Enter Intervals :");
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter start And end of Intervals :");
			int start = sc.nextInt();
			int end = sc.nextInt();
			intr.add(new int[]{start, end});
		}
		
		System.out.println("Intervals are :");
		for(int i=0; i<n; i++)
		{
			System.out.print(Arrays.toString(intr.get(i))+" ");
		}
		
		for(int[] elements :intr)
		{
			System.out.println("["+elements[0]+", "+elements[1]+"]");
		}
	}
}