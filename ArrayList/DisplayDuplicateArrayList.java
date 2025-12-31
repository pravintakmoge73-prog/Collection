/*Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.
Explanation:
 This helps you understand:
Nested loops
Comparison logic
Handling repeated values
*/

import java.util.*;
public class DisplayDuplicateArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(6);
		al.add(3);
		al.add(8);
		
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++)
		{
			boolean flag = false;
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				System.out.print(al.get(i));
			}
		}
	}
}

/*
if input ArrayList has element repeated more than 2 
then above logic not work
like 2 3 2 6 5 2 8 here 2 comes thrice while printing 
duplicate value using above logic it print in output 22

	for(int i=0; i<al.size())
	{
		boolean visit = false;
		for(int j=0; j<i; j++)
		{
			if(al.get(i).equals(al.get(j)))
			{
				visit=true;
			}
		}
		
		if(visit)
		{
			continue;
		}
		
		boolean isDuplicate = false;
		for(int k=i+1; k<al.size(); k++)
		{
			if(al.get(i).equals(al.get(k)))
			{
				isDuplicate=true;
				break;
			}
		}
		System.out.println(al.get(i));
	}
*/