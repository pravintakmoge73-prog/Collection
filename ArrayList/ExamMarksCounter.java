/*Q9. Write a program using ArrayList to store exam marks of students. Take a number from the user 
and count how many times it appears in the list. 
Explanation: 
• Store marks in an ArrayList. 
• Traverse the list using a loop. 
• Compare each element with the user input and maintain a count. 
• Demonstrates searching and frequency counting using ArrayList.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ExamMarksCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        // 1. Store marks in an ArrayList
        marks.add(85);
        marks.add(70);
        marks.add(92);
        marks.add(70);
        marks.add(65);
        marks.add(70);
        marks.add(88);

        System.out.println("Marks in list: " + marks);

        // 2. Take a number from the user
        System.out.print("Enter the mark to count: ");
        int target = sc.nextInt();

        // 3. Traverse and count manually
        int count = 0;
        for (int m : marks) {
            if (m == target) {
                count++;
            }
        }

        // 4. Display result
        System.out.println("The mark " + target + " appears " + count + " times.");
        sc.close();
    }
}
