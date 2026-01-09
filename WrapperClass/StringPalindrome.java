/*Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/

import java.util.*;
class StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stinrg : ");
		String s = sc.nextLine();
		int index=0;
		//ArrayList<Character> list = new ArrayList<>();
		
		try{
			while(true)
			{
				//list.add(s.charAt(index));
				s.charAt(index);
				index++;
			}
		}catch(Exception ex)
		{
			
		}
		
		int n = index-1;
		boolean isPalindrome = true;
		for(int i=0; i<n/2; i++)
		{
			if(!(s.charAt(i)==(s.charAt(n-i))))
			{
				isPalindrome = false;
			}
		}
		
			/*int n=list.size()-1;
			int i=0;
			boolean isPalindrome = true;
			while(i<=n/2)
			{
				if(!(list.get(i).equals(list.get(n-i))))
				{
					isPalindrome = false;
					break;
				}
				i++;
			}*/
			
		if(isPalindrome)
		{
			System.out.println("Sting is Palindrome.");
		}
		else
		{
			System.out.println("String is Not Palindrome.");
		}
	}
}