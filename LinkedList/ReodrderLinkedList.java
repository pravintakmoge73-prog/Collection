/*11. Reorder List
Description:
Reorder as: L1 → Ln → L2 → Ln-1 ...
Example:
Input: 1→2→3→4
Output: 1→4→2→3
*/

import java.util.*;
class ReodrderLinkedList
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(30);
		list.addFirst(10);
		list.add(40);
		list.add(50);
		list.addLast(60);
		
		System.out.println("Linked List is :"+list);
		
		Reorder ro = new Reorder();
		LinkedList<Integer> result = ro.arrangeList(list);
		System.out.println("Reordered LinkedList is "+result);
		
	}
}

class Reorder
{
	public LinkedList<Integer> arrangeList(LinkedList<Integer> li)
	{
		for(int i=0; i<=(li.size()/2); i+=2)
		{
			ListIterator<Integer> it = li.listIterator(li.size());
			if(it.hasPrevious())
			{
				Integer num = it.previous();
				it.remove();
				li.add(i+1, num);
			}
		}
		return li;
	}
}