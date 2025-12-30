/*Q4. Create an ArrayList and find the minimum element.
Explanation:
 Similar to max logic, this improves:
Conditional checking
Traversal logic
*/

import java.util.*;
public class MinElementInArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter num of elements to be add :");
		int n = sc.nextInt();
		System.out.println("----------");
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}

		System.out.println(al);

		int minElement = Integer.MAX_VALUE ;

		Iterator<Integer> it = al.iterator();

		while(it.hasNext())
		{
			int num = it.next();
			if(num<minElement)
			{
				minElement = num;
			}
		}

		System.out.println("Minimum Element in ArrayList : "+minElement);
	}
}