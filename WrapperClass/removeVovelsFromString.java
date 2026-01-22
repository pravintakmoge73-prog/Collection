/*Q29. Write a java program to remove a, e, i, o, u from the string.
 Input : education
 Output : dctn
*/

import java.util.*;
class removeVovelsFromString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String Input :");
		
		String input = sc.nextLine();
		
		String result = ""; 
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result = result + ch;
            }
        }
        
        System.out.println("Output: " + result);
	}
}