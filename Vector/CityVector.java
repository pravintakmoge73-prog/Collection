/*Q8. Write a program that maintains a Vector of city names. Perform the following: 
1. Insert 5 cities. 
2. Remove the city at index 3. 
3. Insert a new city at index 1. 
4. Display final list. 
*/

import java.util.Vector;

public class CityVector {
    public static void main(String[] args) {
        // 1. Create a Vector and Insert 5 cities
        Vector<String> cities = new Vector<String>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");
        System.out.println("Initial List: " + cities);

        // 2. Remove the city at index 3 (Chennai)
        cities.remove(3);
        System.out.println("After removing city at index 3: " + cities);

        // 3. Insert a new city at index 1
        cities.add(1, "Pune");
        System.out.println("After inserting city at index 1: " + cities);

        // 4. Display final list
        System.out.println("\nFinal City List:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println((i) + ": " + cities.get(i));
        }
    }
}
