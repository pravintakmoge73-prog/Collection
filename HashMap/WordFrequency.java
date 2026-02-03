/* Q10. Write a Java program that reads a sentence from the user and counts the frequency of each 
word using a HashMap.  
The program should:  
• Accept a sentence as input.  
• Split the sentence into words.  
• Use a HashMap to count how many times each word appears.  
• Display each word and its frequency.  
Input : Java is easy and Java is powerful  
Output : Word Frequencies: Java: 2 is: 2 easy: 1 and: 1 powerful: 1 
*/

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Accept a sentence as input
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // 2. Split the sentence into words (using space as a delimiter)
        String[] words = sentence.split(" ");

        // 3. Use a HashMap to count frequencies
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String w : words) {
            // If word exists, increment count. If not, start at 1.
            if (wordCountMap.containsKey(w)) {
                wordCountMap.put(w, wordCountMap.get(w) + 1);
            } else {
                wordCountMap.put(w, 1);
            }
        }

        // 4. Display each word and its frequency
        System.out.println("\nWord Frequencies:");
        for (String key : wordCountMap.keySet()) {
            System.out.print(key + ": " + wordCountMap.get(key) + "  ");
        }
        
        sc.close();
    }
}
