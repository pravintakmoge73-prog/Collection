/*Q25. Two strings are anagrams if they contain same characters with same frequency.
 Input : listen, silent
 Output : Anagram
*/

import java.util.*;
public class StringIsAnagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String :");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String :");
		String s2 = sc.nextLine();
		
		IsAnagram a = new IsAnagram();
		a.checkAnagram(s1, s2);
	}
}
class IsAnagram
{
	public void checkAnagram(String s1, String s2)
	{
		s1 = s1.replaceAll("\\s","").toLowerCase();
		s2 = s2.replaceAll("\\s","").toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are Not Anagram");
			return;
		}
		
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2))
			System.out.println("Strings are Anangram");
		else
			System.out.println("Strings are Not Anangram");
		
		/*// Clean strings: remove spaces and make lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // 1. Length check
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // 2. Create HashMaps to store character frequencies
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // 3. Fill map1 with frequencies of str1
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // 4. Fill map2 with frequencies of str2
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // 5. Compare the two HashMaps
        if (map1.equals(map2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");*/
	}
}