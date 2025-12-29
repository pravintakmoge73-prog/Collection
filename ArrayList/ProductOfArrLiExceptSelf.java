/*4. Product of Array Except Self
Description:
Return a list output where each element is the product of all other elements. No division allowed.
Example:
Input: [1,2,3,4]
Output: [24,12,8,6]
*/

import java.util.*;
public class ProductOfArrLiExceptSelf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("Enter number of elements do you want to enter :");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println(al);
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ProductOfEle p1 = new ProductOfEle();
		al1 = p1.performOperarion(al);
		
		System.out.println("ArrayList After Performing Product :");
		System.out.println(al1);
	}
}
class ProductOfEle
{
	ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> performOperarion(ArrayList<Integer> al)
	{
		for(int i=0; i<al.size(); i++)
		{
			int p = 1;
			for(int j=0; j<al.size(); j++)
			{
				if(i!=j)
				{
					p = p*al.get(j);
				}
			}
			list.add(p);
		}
		
		return list;
	}
}