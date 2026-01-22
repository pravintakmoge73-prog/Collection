/*Q28. Write a java program to Check character whose frequency is 1 and appears first.
 Input : swiss
 Output : w
*/

import java.util.*;
class PrintCharFrequencyIsOneString
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter String Input");
		String input = sc.nextLine();
		
		String s = input.toLowerCase();
		
		char[] array = s.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : array)
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		System.out.println("Characters whose Frequency is 1 :");
		//bollean found = false;
		Set<Map.Entry<Character, Integer>> data = map.entrySet();
		for(Map.Entry<Character, Integer> e :data)
		{
			if(e.getValue()==1)
			{
				System.out.print(e.getKey()+" ");
				//found = true;
				//break; if string i/p is single word like in question 
				//tha contain only one char with fre=1
			}
		}
	}
}