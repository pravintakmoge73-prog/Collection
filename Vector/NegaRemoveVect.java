import java.util.*;
public class NegaRemoveVect
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(23);
		v.add(-12);
		v.add(45);
		v.add(12);
		v.add(-34);
		v.add(80);
		v.add(-18);
		v.add(38);
		v.add(43);
		v.add(62);
		
		System.out.println("Vector : "+v);
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			int num = (Integer)obj;
			if(num < 0)
				it.remove();
		}
		System.out.println("====Vector after Removing Negative values====");
		System.out.println("Vector : "+v);
	}
}