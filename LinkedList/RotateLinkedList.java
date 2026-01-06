/*13. Rotate List
Description:
Rotate list right by k steps.
Example:
Input: 1→2→3→4→5, k=2
Output: 4→5→1→2→3
*/

import java.util.*;
class RotateLinkedList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter size of LinkedList :");
		int n= sc.nextInt();
		
		System.out.println("Enter elements in LinkedList :");
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("LinkedList is :"+list);
		
		System.out.println("ENter value of k :");
		int k=sc.nextInt();
		
		Rotation r = new Rotation();
		r.rotateLinked(list, k);
	}
}
class Rotation
{
	public void rotateLinked(LinkedList<Integer> list, int k)
	{
		while(k!=0)
		{
			int num = list.getLast();
			list.removeLast();
			list.addFirst(num);
			k--;
		}
		
		System.out.println("Rotated LinkedList :"+list);
	}
}