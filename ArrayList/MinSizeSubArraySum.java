/*7. Minimum Size Subarray Sum
Description:
Find minimal length of a subarray whose sum ≥ target.
Example:
Input: target=7, nums=[2,3,1,2,4,3]
Output: 2
*/

import java.util.*;
public class MinSizeSubArraySum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();

		System.out.println("Enter how many elements do you want to Enter :");
		int n= sc.nextInt();
		System.out.println();
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}

		System.out.println("ArrayList is :");
		System.out.println(al);

		System.out.println("ENter Target sum k :");
		int k=sc.nextInt();


		int start=0;
		int end=0;
		int sum=0;
		int minLen=Integer.MAX_VALUE;

		for(end=0; end<al.size(); end++)
		{
			sum+=al.get(end);
			
			while(sum>=k)
			{
				if(minLen >(end-start+1))
				{
					minLen=(end-start+1);
				}
				
				sum-=al.get(start);
				start++;
			}
		}
		if (minLen == Integer.MAX_VALUE) {
            System.out.println("No subarray found with sum ≥ " + k);
        } else {
            System.out.println("Minimal subarray size: " + minLen);
        }
		sc.close();
	}
}