/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/

import java.util.*;

public class MergeTwoInNewArrayList
{
	public static void main(String[] args)
	{
		ArrayList al1 = new ArrayList();
		al1.add(22);
		al1.add(34);
		al1.add(45);
		al1.add(23);
		al1.add(34);
		System.out.print("First ArrayList : ");
		for(Object obj :al1)
		{
			System.out.print(obj+"\t");
		}
		System.out.println();
		
		ArrayList al2 = new ArrayList();
		al2.add(87);
		al2.add(23);
		al2.add(43);
		al2.add(68);
		System.out.print("Second ArrayList : ");
		for(Object obj :al2)
		{
			System.out.print(obj+"\t");
		}
		System.out.println();
		
		ArrayList al3 = new ArrayList();
		
		Iterator it1 = al1.iterator();
		while(it1.hasNext())
		{
			Object obj = it1.next();
			int num = (Integer)obj;
			if(!al3.contains(num))
			{
				al3.add(num);
			}
		}
		
		Iterator it2 = al2.iterator();
		while(it2.hasNext())
		{
			Object obj = it2.next();
			int num = (Integer)obj;
			if(!al3.contains(num))
			{
				al3.add(num);
			}
		}
		System.out.print("Merged ArrayList : ");
		for(Object obj :al3)
		{
			System.out.print(obj+"\t");
		}
		
	}
}