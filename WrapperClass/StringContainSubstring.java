/*Q20. Write a program to check whether a string contains a substring.
 Input: Java Programming, 
Java
 Output : Substring found
*/

import java.util.*;
public class StringContainSubstring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter String :");
		String original = sc.nextLine();
		Cheack ck = new Cheack();
		System.out.println("Enter String to check is subString of Main String :");
		String s = sc.nextLine();
		ck.isContainSub(original,s);
		/* 
		if (original.contains(s)) {
			System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }*/
		
	}
}

class Cheack
{
	public void isContainSub(String original, String s)
	{
		int  n= original.length();
		int m = s.length();          //Java Programming
		boolean found = false;       // program
		for(int i=0; i<n-m; i++)     //i<9
		{
			int j;
			for(j =0; j<m; j++)
			{
				if(original.charAt(i+j)!=s.charAt(j))
				{
					break;
				}
			}
			if(j==m)
			{
				found=true;
				break;
			}	
		}
		
		if(found)
			System.out.println("SubString is found.");
		else
			System.out.println("SubString is Not Found.");
	}
}