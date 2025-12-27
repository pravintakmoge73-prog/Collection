/*Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/

import java.util.*;
public class ArrayToVectSecLargest
{
	public static void main(String[] args)
	{
		Integer[] arr = {9,2,4,3,5,4,7,};
		System.out.println("Array is : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		Vector v = new Vector(Arrays.asList(arr));
		System.out.println("Vector : "+v);
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0; i<v.size(); i++)
		{
			int num = (int)v.get(i);
			if(num>max)
			{
				secMax = max;
				max = num;
			}
			if(num<max && num>secMax)
			{
				secMax = num;
			}
		}
		
		/*Iterator it = v.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			int num = (int)obj;
			if(num>max)
			{
				secMax = max;
				max = num;
			}
			if(num<max && num>secMax)
			{
				secMax = num;
			}
		}
		*/
		System.out.println("Second max : "+secMax);
	}
}