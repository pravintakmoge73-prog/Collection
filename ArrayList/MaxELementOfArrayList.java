/*Q3. Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
*/

import java.util.*;
public class MaxELementOfArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("Enter Number od Elements do you wants add :");
		int n=sc.nextInt();
		System.out.println("---------------");
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("ArrayList : "+al);
		
		int maxElement = Integer.MIN_VALUE ;
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			int num = it.next();
			if(num > maxElement)
			{
				maxElement = num;
			}
		}
		
		System.out.println("Maximum Elment from ArrayList : "+maxElement);
	}
}