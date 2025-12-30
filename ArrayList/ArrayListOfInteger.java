/*Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
Explanation:
	This helps you understand:
How to declare an ArrayList
How to add elements using add()
How to traverse an ArrayList using for loop
*/


import java.util.*;
public class ArrayListOfInteger
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Integer ArrayList : "+list);
	}
}