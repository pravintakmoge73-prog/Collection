/*Q4. Write a program to count the number of vowels in a string.
 Input : Education
 Output : 5
*/

import java.util.*;
class CountOfVowelsInString
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		int index=0;
		int vowelsCount = 0;
		
		try{
			while(true)
			{
				char ch = s.charAt(index);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				{
					vowelsCount++;   
				}
				index++;
			}
		}catch(Exception ex){
			System.out.println("Count of vewels in String is :"+vowelsCount);
		}
	}
}