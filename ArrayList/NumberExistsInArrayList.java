/*Q6. Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
*/

import java.util.*;
public class NumberExistsInArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("Enter num of elements :");
		int n= sc.nextInt();
		System.out.println("Enter Elements in ArrayList :");
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println(al);
		
		System.out.println("Enter Number to Check isItPresent In ArrayList :");
		int num = sc.nextInt();
		
		boolean flag = false;
		for(int element: al)
		{
			if(num==element)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element exists in ArrayList. ");
		}
		else
		{
			System.out.println("Element does not exists in ArrayList. ");
		}
	}
}