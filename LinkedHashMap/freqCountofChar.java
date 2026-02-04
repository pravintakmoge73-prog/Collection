/*Q40. Write a java program to Enter the String and  count occurrences 
of a all character in given string.
 input : abcdabcdefab
  a--->3
  b--->3
  c--->2
  d--->2
  e--->1
  f--->1
*/

import java.util.*;
import java.util.HashMap;
class freqCountofChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.next();
		String s = input.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c :ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println("Input : "+s);
		System.out.println();
		System.out.println("Frequency of each Character in word :");
		System.out.println("Character\t"+"Count");
		for(char c : map.keySet())
		{
			System.out.println(c+"\t ---> \t"+map.get(c));
		}
		
	}
}