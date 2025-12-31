/*Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
Explanation:
 This improves:
Index manipulation
Swapping logic
Understanding list size
*/

import java.util.*;
public class ReverseArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		System.out.println("Original ArrayList : "+al);
		
		for(int i=0; i<(al.size()/2); i++)
		{
			int temp = al.get(i);
			al.set(i, al.get(al.size()-i-1));
			al.set((al.size()-i-1), temp);
		}
		
		System.out.println("ArrayList After Reverse :"+al);
	}
}