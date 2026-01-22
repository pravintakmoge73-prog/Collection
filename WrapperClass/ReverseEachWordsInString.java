/*Q27. Reverse each word but keep word order same.
 Input : Java is fun
 Output : avaJ si nuf
*/

import java.util.*;
class ReverseEachWordsInString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		
		String[] arr = input.split("\\s");
		
		String result = "";
		for(String s : arr)
		{
			result += new StringBuilder(s).reverse().toString() +" ";
		}
		
		System.out.println(result);
	}
}