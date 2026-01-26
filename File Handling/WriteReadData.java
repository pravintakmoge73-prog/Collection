//Write data in file

import java.util.*;
import java.io.*;
class WriteReadData
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw = new FileWriter("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\abc.txt", true);
		
		System.out.println("Enter Data In file :");
		String data = new Scanner(System.in).nextLine();
		
		fw.write(data);
		fw.close();
		System.out.println("Data Added successfully .....");
	}
}