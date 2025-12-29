/*5. Sum
Description:
Find all unique triplets (a,b,c) such that a+b+c = 0 using sorting and ArrayList.
Example:
Input: [-1,0,1,2,-1,-4]
Output: [[-1,-1,2], [-1,0,1]]
*/

import java.util.*;
public class UniqeTripletSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter how many Element do want to Enter :");
		int n =sc.nextInt();
		System.out.println();
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("ArrayList is :");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("ArrayList after Sorting :");
		System.out.println(al);
		
		//ArrayList<ArrayList<integer>> result = new ArrayList<>();
		
		
		for(int i=0; i<(al.size()-2); i++)
		{
			if(i>0 && al.get(i).equals(al.get(i-1)))
				continue;
			
			int left = i+1;
			int right = n-1;
			
			while(left<right)
			{
				int sum =al.get(i)+al.get(left)+al.get(right);
				
				if(sum==0)
				{
					System.out.println("[" + al.get(i) + "," + al.get(left) + "," + al.get(right) + "]");
					left++;
					right--;
				}
				else if(sum<0)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
		}
	}
}