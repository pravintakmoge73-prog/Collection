/*Q21. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1
*/

import java.util.*;
class CountFreqOfCharInString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		int n=s.length();
		for(int i=0; i<n; i++)
		{
			char ch = s.charAt(i);
			if(ch == ' ')
			{
				continue;
			}
			else
			{
				int count=1;
				if(map.containsKey(ch))
					count++;
				
				map.put(ch, count);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		for(Map.Entry<Character, Integer> m :set)
		{
			System.out.println(m.getKey()+"   count--->  "+m.getValue());
		}
	}
}