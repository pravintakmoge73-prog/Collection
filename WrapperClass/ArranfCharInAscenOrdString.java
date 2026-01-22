/*Q30. Write a java program to arrange characters in ascending order.
 Input : dcba
 Output : abcd
*/

import java.util.*;
class ArranfCharInAscenOrdString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String :");
		String input = sc.nextLine();
		
		String result = "";
		
		char[] array = input.toCharArray();
		Arrays.sort(array);
		
		result = new String(array);
		
		System.out.println(result);
	}
}