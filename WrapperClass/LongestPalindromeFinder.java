/*Q32. Given a string s, return the longest
in s.
 
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:
	1 <= s.length <= 1000
	s consist of only digits and English letters.

*/

import java.util.Scanner;

public class LongestPalindromeFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        String result = findLongestPalindrome(input);
        
        System.out.println("Longest Palindromic Substring: " + result);
        System.out.println("Length: " + result.length());
    }

    public static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindrome (center is one character like "aba")
            String oddPal = expandAroundCenter(s, i, i);
            if (oddPal.length() > longest.length()) {
                longest = oddPal;
            }

            // Case 2: Even length palindrome (center is between two characters like "abba")
            String evenPal = expandAroundCenter(s, i, i + 1);
            if (evenPal.length() > longest.length()) {
                longest = evenPal;
            }
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        // Expand outward as long as the characters match and we are within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the valid palindrome found (substring uses start index inclusive, end index exclusive)
        // We use left + 1 because the while loop stops AFTER moving pointers to a non-matching position
        return s.substring(left + 1, right);
    }
}
