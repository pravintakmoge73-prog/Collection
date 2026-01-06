/*12. Partition List
Description:
Partition around value x, keeping original order.
Example:
Input: 1→4→3→2→5→2, x=3
Output: 1→2→2→4→3→5
*/

import java.util.*;
class PartitionLinkedList
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<>();
		
		System.out.println("Enter size of LinkedList : ");
		int n=sc.nextInt();
		System.out.println("Enter Elements in LinkedList :");
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println("LinkedList is : "+list);
		
		System.out.println("Enter the pivote value of k :");
		int k = sc.nextInt();
		
		Partition p = new Partition();
		p.makePatition(list, k);
	}
}

class Partition
{
	LinkedList<Integer> temp1 = new LinkedList<>();
	LinkedList<Integer> temp2 = new LinkedList<>();
	
	public void makePatition(LinkedList<Integer> list, int k)
	{
		for(int num : list)
		{
			if(num < k)
			{
				temp1.add(num);
			}
			else
			{
				temp2.add(num);
			}
		}
		
		temp1.addAll(temp2);
		
		list.clear();
		list.addAll(temp1);
		System.out.println("Partitioned LinkedList is :"+list);
	}
	
}