/*
Q22. Print only unique characters while maintaining original order.
 Input : banana
 Output : ban*/
 
 import java.util.*;
 public class UniqeCharPrint
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		int len = s.length();
		for(int i=0; i<len; i++)
		{
			Character ch = s.charAt(i);
			set.add(ch);
		}
		
		System.out.println("Uniqe Character Printing :");
		for(Object obj : set)
		{
			System.out.print(obj +" ");
		}
	}
 }