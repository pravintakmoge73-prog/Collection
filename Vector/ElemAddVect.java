import java.util.*;
public class ElemAddVect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		System.out.println("Enter 7 Integers in Vector :");
		for(int i=0; i<7 ; i++)
		{
			v.add(sc.nextInt());
		}
		
		int sum=0;
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			int num = (Integer)obj;
			sum = sum + num ;
		}
		System.out.println("Sum of All element = "+sum);
	}
}