/*Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/

import java.util.*;
public class ArLiToVectThenSort
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(23);
		al.add(18);
		
		System.out.println("ArrayList : "+al);
		
		Vector v = new Vector();
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			int num = (int)obj;
			v.add(num);
		}
		
		System.out.println("Vector Before Sorting : "+v);
		
		for(int i=0; i<v.size(); i++)
		{
			int  minInd = i;
			for(int j=i+1; j<v.size(); j++)
			{
				int num1 = (int)v.get(j);
				int num2 = (int)v.get(minInd);
				
				if(num1 < num2)
				{
					minInd = j;
				}
			}
			int temp = (int)v.get(i);
			v.set(i, (int)v.get(minInd));
			v.set(minInd, temp);
		}
		
		System.out.println("Vector After Sorting : "+v);
	}
}