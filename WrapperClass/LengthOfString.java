/*Q2. Write a program to find the length of a string.
 Input : Programming
 Output : 11
*/

import java.util.*;
class LengthOfString
{
	public static void main(String[] args)
	{
		String s = "Programming";
		int index = 0;
		
		try
		{
			while(true)
			{
				s.charAt(index);
				index++;
			}
			
		}catch(Exception ex)
		{
			System.out.println("Length of String :"+index);
		}		
	}
}