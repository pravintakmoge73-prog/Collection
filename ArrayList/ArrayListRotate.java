/*10. Rotate Array by K Steps
Description:
Rotate the list right by k positions.
Example:
Input: nums=[1,2,3,4,5], k=2
Output: [4,5,1,2,3]
*/

import java.util.*;
class ArrayListRotate
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		System.out.println("ArrayList is : "+list);
		
		System.out.println("ENter value of k : ");
		int k=sc.nextInt();
		
		Result res = new Result();
		
		ArrayList<Integer> result = res.rotate(list, k);
		
		System.out.println("ArrayList After Rotation : "+result);
		
	}
}

class Result
{
	
	public ArrayList<Integer> rotate(ArrayList<Integer> li, int k)
	{
		if(li == null || li.size()<=1)
			return li;
		
		int n =li.size();
		k=k%n;
		
		for(int i=0; i<k; i++)
		{
			ListIterator<Integer> it = li.listIterator(n);
			
			if(it.hasPrevious())
			{
				int lastElement = it.previous();
				it.remove();
				
				li.add(0, lastElement);
			}
		}
		return li;
	}
}