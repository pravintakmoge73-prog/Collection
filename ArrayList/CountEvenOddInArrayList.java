/**Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
Explanation:
 This helps practice:
Modulus operator %
Condition-based counting
Iteration over collections
*/

import java.util.*;
public class CountEvenOddInArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("How many Elements do you wants to add :");
		int n = sc.nextInt();
		System.out.println("__________");
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println(al);
		
		int evenCount =0;
		int oddCount = 0;
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			if(it.next() % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.printf("Count of Even Number : %d%nCount of Odd Number : %d",evenCount,oddCount);
		
	}
}