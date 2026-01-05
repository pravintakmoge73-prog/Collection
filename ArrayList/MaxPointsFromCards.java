/*8. Maximum Points From Cards
Description:
Pick k elements from either end of list to maximize score.
Example:
Input: cards=[1,2,3,4,5,6,1], k=3
Output: 12
*/

import java.util.*;
public class MaxPointsFromCards
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("ENter Size of ArrayList :");
		int n=sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("ArrayList is :");
		System.out.println(al);
		
		System.out.println("Enter Value of k :");
		int k = sc.nextInt();
		
		ListIterator<Integer> li = al.listIterator(al.size());
		
		int score=0;
		while(li.hasPrevious())
		{
			if(k==0)
			{
				break;
			}
			score = score + li.previous();
			k--;;
		}
		
		System.out.println("Score is "+score);
		
	}
}