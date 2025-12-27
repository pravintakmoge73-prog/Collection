
import java.util.*;

public class DuplicatePrint
{
	public static void main(String[] args)
	{
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		ArrayList al2 = new ArrayList();
		al2.add(50);
		al2.add(60);
		al2.add(20);
		al2.add(70);
		
		System.out.println("First ArrayList : "+al1);
		System.out.println("Second ArrayList : "+al2);
		ArrayList al3 = new ArrayList();
		
		ListIterator li1 = al1.listIterator();
		
		
		while(li1.hasNext())
		{
			Object obj1 = li1.next();
			int num1 = (Integer)obj1;
			int count = 0;
			
			ListIterator li2 = al2.listIterator();
			while(li2.hasNext())
			{
				Object obj2 = li2.next();
				int num2 = (Integer)obj2;
				if(num1 == num2)
				{
					count++ ;
					if(count == 1)
					{
						al3.add(num1);
					}
					
				}
			}
		}
		System.out.println(al3);
	}
}