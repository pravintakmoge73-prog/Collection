/*Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/

import java.util.*;
public class ArrayToArLiFrequency
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2 ,5, 3,1 ,2, 3 ,5, 2,1, 4};
		
		System.out.println("Array is :");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		ArrayList al1 = new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			al1.add(arr[i]);
		}
		
		System.out.println("ArrayList is : "+al1);
		
		ArrayList al2 = new ArrayList();
		Iterator it = al1.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			int num = (int)obj;
			if(!al2.contains(num))
			{
				al2.add(num);
			}
		}
		System.out.println("ArrayList 2 : "+al2);
		
		for(int i=0; i<al2.size(); i++)
		{
			int count = 0;
			int num1 = (int)al2.get(i);
			for(int j=0; j<al1.size(); j++)
			{
				int num2 = (int)al1.get(j);
				if(num1==num2)
				{
					count++ ;
				}
			}
			System.out.println("Element "+num1+"   count-----> "+count);
		}
	}
}
/*Using Arrays.asList() (Shortcut)
Works only for object arrays (Integer[], not int[])

Integer arr[] = {10, 20, 30, 40};
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
System.out.println(list);*/