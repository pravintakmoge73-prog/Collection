/*Q24. Write a java program to convert first character of each word to uppercase.
 Input : java is easy
 Output : Java Is Easy
*/

import java.util.*;
public class ConvertFirstChartoUppercase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String :");
		String s = sc.nextLine();
		String result = "";
		
		String[] array = s.split(" ");
		
		for(int i=0; i<array.length; i++)
		{
			String firstLetter = array[i].substring(0, 1).toUpperCase();
			String remain = array[i].substring(1);
			
			result+=firstLetter+remain+" ";
		}
		
		System.out.println("Result : "+result);
		/*String input = "java is easy";
        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // Capitalize if it is the first character or follows a space
            if (i == 0 || ch[i - 1] == ' ') {
                // Check if it's a lowercase letter before converting
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32); // Convert to uppercase
                }
            }
        }

        String result = new String(ch);
        System.out.println("Output: " + result);*/
	}
}