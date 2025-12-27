/*Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/

import java.util.*;
public class DupliRemoveVect
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(2);
		v.add(4);
		v.add(2);
		v.add(5);
		v.add(7);
		v.add(4);
		v.add(6);
		
		System.out.println(v);
		
		Vector v1 = new Vector();
		for(int i=0; i<v.size(); i++)
		{
			int num = (int)v.get(i);
			if(!v1.contains(num))
			{
				v1.add(num);
			}
		}
		System.out.println("Vector After Reemoving Duplicate : "+v1);
	}
}