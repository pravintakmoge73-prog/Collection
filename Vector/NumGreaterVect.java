import java.util.*;
public class NumGreaterVect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		int count = 0;
		System.out.println("Enter 10 Integer values in Vector :");
		for(int i=0; i<10; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.println("Values : "+v);
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			int num = (Integer)obj;
			
			if(num > 50)
				count++;
		}
		
		System.out.println("Count of NUmber Greater Than 50 :"+count);
	}
}