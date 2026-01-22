/*Q28. Write a java program to Check character whose frequency is 1 and appears first.
 Input : swiss
 Output : w
*/

import java.util.Scanner;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Input:");
        String input = sc.nextLine();
        
        // Convert to lowercase if case-insensitive check is needed
        String s = input.toLowerCase();
        
        boolean found = false;
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If first occurrence index == last occurrence index, frequency is 1
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("Output: " + ch);
                found = true;
                break; // Exit after finding the first one
            }
        }
        
        if (!found) {
            System.out.println("No unique character found.");
        }
    }
}
