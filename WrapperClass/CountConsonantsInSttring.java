/*Q5. Write a program to count consonants in a string.
 Input: Computer
 Output: 5
*/

import java.util.*;
class CountConsonantsInSttring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		
		int index = 0;
		int consCount = 0;
		try{
			while(true)
			{
				char ch = s.charAt(index);
				if(((ch>=65 && ch<=90) ||(ch>=97&&ch<=122)) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
				{
					consCount++;
				}
				index++;
			}
		}catch(Exception ex)
		{
			System.out.println("Count of Consonant in String :"+consCount);
		}
	}
}