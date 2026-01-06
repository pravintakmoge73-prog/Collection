/*15. Add Two Numbers II
Description:
Add numbers represented by linked num1s (most significant digit first).
Example:
Input: 7→2→4→3 + 5→6→4
Output: 7→8→0→7
*/

//this code only work for Doubly Linkednum1 Structure not single Linkednum1

import java.util.*;
class AddTwoSignificantDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> num1 = new LinkedList<>();
		System.out.println("Enter size of First Number :");
		int n=sc.nextInt();
		System.out.println("Enter number digits in LinkedList :");
		for(int i=0; i<n; i++)
		{
			num1.add(sc.nextInt());
		}
		
		LinkedList<Integer> num2 = new LinkedList<>();
		System.out.println("Enter size of second Number :");
		int m=sc.nextInt();
		System.out.println("Enter number digits in LinkedList :");
		for(int i=0; i<m; i++)
		{
			num2.add(sc.nextInt());
		}
		
		System.out.println("First NUmber is : "+num1);
		System.out.println("Second NUmber is : "+num2);
		
		AddNumbers ad = new AddNumbers();
		System.out.println("After Addition of Two NUmber Most Significant digit first :");
		System.out.println("Result is : "+ad.addList(num1, num2));
		
		
	}
}

class AddNumbers
{
	public LinkedList<Integer> addList(LinkedList<Integer> num1, LinkedList<Integer> num2)
	{
		LinkedList<Integer> result = new LinkedList<>();
		int carry = 0;
		while(!num1.isEmpty() || !num2.isEmpty() || carry!=0)
		{
			int val1 = num1.isEmpty() ? 0 : num1.removeLast();
			int val2 = num2.isEmpty() ? 0 : num2.removeLast();
			
			int sum = val1 + val2 + carry;
			carry= sum / 10;
			result.add(sum%10);
		}
		
		return result;
	}
}