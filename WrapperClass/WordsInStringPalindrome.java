/*Q26. Write a java program to check each word separately to see if it reads same forward and backward.
 Input : madam level noon java
 Output : madam level noon
*/

import java.util.*;
public class WordsInStringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		
		String[] array = s.split(" ");
		
		boolean isPalind = true;
		for(String sub : array)
		{
			String rev = new StringBuilder(sub).reverse().toString();
			isPalind = sub.equals(rev);
			if(!isPalind)
			{
				break;
			}
		}
		
		if(isPalind)
			System.out.println("Result is True.");
		else
			System.out.println("Result is False.");
	}
}
/* System.out.print("Output: ");
        
        // 2. Loop through each word separately
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.print(word + " ");
            }
        }
        
        sc.close();
    }

    // Helper method to check if a single word is a palindrome
    public static boolean isPalindrome(String str) {
        // Option 1: Using StringBuilder for simplicity
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
	}
*/