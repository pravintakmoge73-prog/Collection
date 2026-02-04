/*Q41. Write a program to enter the String and sum of the all Digits in a given String
   input : abcd123pqe12mn12abc
   output is  Sum is  147
   (note  sum of number is 123+12+12 =147)
*/

import java.util.*;
class SumOfNumbersInString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Input:");
		String s = sc.next();
		
		int sum = 0;
		int num = 0;
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='0'&& ch<='9')
			{
				num = num*10 + (ch - '0');
			}
			else
			{
				sum = sum + num;
				num = 0;
			}
		}
		sum = sum + num; // add last number if string ends with digit
		System.out.println("Addition is "+ sum);
	}
}