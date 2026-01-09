/*Q1. Write a Java program to print a given string.
 Input : Hello Java
 Outputt : Hello Java
*/

import java.util.*;
class FirstString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter String : ");
		String s = sc.nextLine();
		String s1 = "Hello Java";
		String s2 = new String("Hello Java");
		
		System.out.println(s+" ----> "+System.identityHashCode(s));
		System.out.println(s1+" ----> "+System.identityHashCode(s1));
		System.out.println(s2+" ----> "+System.identityHashCode(s2));
	}
}