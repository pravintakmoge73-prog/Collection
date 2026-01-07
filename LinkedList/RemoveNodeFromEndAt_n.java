/*Description:
Remove node that is n positions from the end.
Example:
Input: 1→2→3→4→5, n=2
Output: 1→2→3→5
*/

import java.util.*;
class RemoveNodeFromEndAt_n
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter size() of LinkedList :");
		int s = sc.nextInt();
		System.out.println("ENter elements in LinkedList :");
		for(int i=0; i<s; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		
		System.out.println("enter psition n from the End to remove Element :");
		int n=sc.nextInt();
		
		RemoveElementAt remove = new RemoveElementAt();
		remove.removeNthFromEnd(list, n);
		
		System.out.println("LinkedList After Removing Element : "+list);
	}
}

class RemoveElementAt
{
	public void removeNthFromEnd(LinkedList<Integer> list, int n)
	{
		int size = list.size();
		
		int targetIndex = size-n;
		
		if(targetIndex < 0 || targetIndex >=size )
		{
			System.out.println("Invalid Position ");
			return;
		}
		
		ListIterator<Integer> it = list.listIterator(targetIndex);
		if(it.hasNext())
		{
			it.next();
			it.remove();
		}
	}
}