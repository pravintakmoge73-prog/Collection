/*Q7. Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept
*/

import java.util.*;
public class RemoveEvenNumArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter num of elments :");
		int n=sc.nextInt();
		System.out.println("Enter Elments :");
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println(al);
		
		System.out.println("------------------");
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)%2==0)
			{
				al.remove(i);
			}
		}
		
		System.out.println("ArraList After removing Even Element :");
		System.out.println(al);
	}
}