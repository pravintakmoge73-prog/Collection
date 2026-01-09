/*Q6. Write a program to reverse a given string.
 Input : Java
 Output : avaJ
*/

import java.util.*;
class reverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		String reverse = "";
		
		int index=0;
		ArrayList<Character> al = new ArrayList<>();
		
		try{
			while(true)
			{
				char ch = s.charAt(index);
				al.add(ch);
				index++;
			}
		}catch(Exception ex)
		{
			ListIterator<Character> it = al.listIterator(al.size());
			while(it.hasPrevious())
			{
				reverse +=it.previous();
			}
				
			s=reverse;
			System.out.println("After Reverse String : "+s);
		}
	}
}