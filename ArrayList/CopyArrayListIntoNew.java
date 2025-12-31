/*Q9. Write a java program to Copy all elements from one integer ArrayList to another.
Explanation:
 This practices:
Working with multiple ArrayList objects
Element-by-element copying
*/

import java.util.*;
public class CopyArrayListIntoNew
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList<>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		
		System.out.println("Original ArrayList : "+al);
		
		ArrayList copy = new ArrayList();
		//use forEach loop
		for(Object obj : al)
		{
			//int num = (int)obj;
			copy.add(obj);
		}
		
		System.out.println("Copied ArrayList : "+copy);
		
	}
}