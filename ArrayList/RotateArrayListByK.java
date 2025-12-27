/*Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/

import java.util.*;
public class RotateArrayListByK
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		System.out.println(al);
		System.out.println("Enter Rotaion value of K :");
		int k=sc.nextInt();
		
		ArrayList temp = new ArrayList();
		
		for(int i=k; i<al.size(); i++)
		{
			temp.add(al.get(i));
		}
		
		for(int i=0; i<k; i++)
		{
			temp.add(al.get(i));
		}
		
		System.out.println(temp);
	}
}