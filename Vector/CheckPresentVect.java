import java.util.*;
public class CheckPresentVect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		System.out.println("Enter 8 element in vector :");
		for(int i=0; i<8; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.println("Vector :"+v);
		System.out.println("Enter searching Value :");
		int searchValue = sc.nextInt();
		boolean flag = false;
		
		for(int i=0; i<8; i++)
		{
			if((Integer)v.get(i)==searchValue)
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Element Found In Vector.");
		else
			System.out.println("Element Not found in Vector.");
	}
}
/*for(Object obj : v) {
            int num = (Integer) obj;   // because raw type stores Object
            if(num == searchValue) {
                found = true;
                break;
            }
        }
*/