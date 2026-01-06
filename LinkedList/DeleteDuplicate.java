/*14. Delete Duplicates (Sorted II)
Description:
Remove all nodes with duplicate values.
Example:
Input: 1→2→3→3→4→4→5
Output: 1→2→5
 */
 
 import java.util.*;
 class DeleteDuplicate
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter size of ArrayList :");
		int n=sc.nextInt();
		System.out.println("Enter elements in LInkedList in sorted order: ");
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("LinkedList is : "+list);
		
		DupliRemove dr = new DupliRemove();
		dr.removeDupli(list);
	}
 }
 class DupliRemove
 {
	public void removeDupli(LinkedList<Integer> list)
	{
		if(list.size() < 2)
			return;
		
		ListIterator<Integer> it = list.listIterator();
		Integer current = it.next();
		
		while(it.hasNext())
		{
			Integer next = it.next();
			if(current.equals(next))
			{
				it.remove();
			}
			else
			{
				current = next;
			}
		}
		/*int i=0;
	
		while(i!=list.size()-1)
		{
			if(list.get(i)==list.get(i+1))//1 2 3 3 4 5 5
			{
				list.remove(i+1);
			}
			else
			{
				i++;
			}
		}*/
		System.out.println("LinkedList After Removing Duplicate is :"+list);
	}
 }