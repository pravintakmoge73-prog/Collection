import java.util.Vector;
import java.util.Iterator;
public class RemoveEvenVect
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		System.out.println("Vector : "+v);
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			
			int num = (Integer)obj;
			
			if(num%2==0)
			{
				it.remove();
			}
		}
		System.out.println("After Removing Even Number Vector : "+v);
	}
}
/*
import java.util.Vector;
import java.util.Scanner;

public class RemoveEvenVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            v.add(sc.nextInt()); // add input to vector
        }

        System.out.println("Original Vector: " + v);

        // Remove even numbers using for loop
        for (int i = 0; i < v.size(); i++) {
            int num = (Integer) v.get(i); // cast to Integer
            if (num % 2 == 0) {
                v.remove(i); // remove even number
                i--; // decrease index because vector size is reduced
            }
        }

        System.out.println("Vector after removing even numbers: " + v);
    }
}*/