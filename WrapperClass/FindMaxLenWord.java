/*Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/

import java.util.*;
class FindMaxLenWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String as Input :");
		String s = sc.nextLine();
		
		String[] array = s.split(" ");
		int max=0;
		String s1="";
		for(int i=0;i<array.length;i++)
		{
			if(array[i].length()>max)
			{
				max=array[i].length();
				s1=array[i];
			}
		}
		System.out.println("Word with Maximum Length : "+s1);
	}
}