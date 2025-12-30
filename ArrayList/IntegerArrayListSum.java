/*Q2. Create an ArrayList of integers and calculate the sum of all elements.
Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method
*/

import java.util.*;
public class IntegerArrayListSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("ENter number of element wants to Enter in ArrayList :");
		int n=sc.nextInt();
		System.out.println("-------------------------");
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}

		System.out.println("ArrayList : "+list);

		Iterator<Integer> it = list.iterator();

		int sum =0 ;
		while(it.hasNext())
		{
			sum +=it.next();
		}

		System.out.println("Sum of all Elements in ArrayList : "+sum);
	}
}