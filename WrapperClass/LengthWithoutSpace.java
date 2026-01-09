/*Q3. Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12
*/

import java.util.*;
class LengthWithoutSpace
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		
		int index=0;
		int space = 0;
		try{
			while(true)
			{
				if(s.charAt(index)==' ')
				{
					space++;
				}
				index++;
			}
		}catch(Exception ex)
		{
			System.out.println("The length od String Without Space : "+(index-space));
		}
		
	}
}