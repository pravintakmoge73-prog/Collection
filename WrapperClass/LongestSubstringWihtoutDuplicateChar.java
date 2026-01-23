/*Q31. Given a string s, find the length of the longest without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. 

Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

import java.util.*;
public class LongestSubstringWihtoutDuplicateChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String :");
		String input = sc.nextLine();
		
		//String s = "";
		HashSet<Character> set = new HashSet<>();
		int maxLen = 0;
		int left =0;
		
		for(int right=0; right<input.length(); right++)
		{
			
			//while(s.indexOf(input.charAt(right))!=-1)
			while(set.contains(input.charAt(right)))
			{
				//s = s.substring(1);
				set.remove(input.charAt(left));
				left++;
				
			}
			//s += input.charAt(right);
			set.add(input.charAt(right));
			maxLen = (maxLen > (right-left+1)) ?maxLen:(right-left+1);
		}
		System.out.println("Lenght of Longest subString without duplicate character :"+maxLen);
	}
}
