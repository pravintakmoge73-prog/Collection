/*1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.
*/

import java.util.*;
public class LongestSubarraySumArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(4);
		
		System.out.println("Enter target value k:");
		int k = sc.nextInt();
		
		int sum = 0;//2147483646
		int maxSum =0;
		int start =0;
		int end =0;
		int maxLen=0;
		
		for(end=0; end<al.size(); end++)
		{
			sum +=(int)al.get(end);
			while(sum>k)
			{
				sum = sum-(int)al.get(start);
				start++;
			}
			if(sum<=k)
			{
				int length = end - start + 1;
				if(length > maxLen)
				{
					maxLen = length;
				}
			}
		}
		
		System.out.println("Lenght of subarray with heighest Sum :"+maxLen);
	}
}