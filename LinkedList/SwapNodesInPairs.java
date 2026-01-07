/*18. Swap Nodes in Pairs
Description:
Swap every two adjacent nodes.
Example:
Input: 1→2→3→4
Output: 2→1→4→3*/

import java.util.*;
class SwapNodesInPairs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter size of LinkedList :");
		int n=sc.nextInt();
		System.out.println("Enter elements in LinkedList :");
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		
		Swapping sw = new Swapping();
		sw.swapNodesInPairs(list);
		
		System.out.println("LinkedList After Swapping Nodes in pairs :"+list);
	}
}

class Swapping
{
	public void swapNodesInPairs(LinkedList<Integer> list)
	{
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
		{
			Integer first = it.next();
			
			if(it.hasNext())
			{
				Integer second = it.next();
			
				it.set(first);
				
				it.previous();
				it.previous();
				
				it.set(second);
				
				it.next();
				it.next();
			}
		}
	}
}