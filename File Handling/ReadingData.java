//Read Data From File

import java.util.*;
import java.io.*;
class ReadingData
{
	public static void main(String[] args)throws Exception
	{
		Reader fr = new FileReader("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\abc.txt");
		
		int data;
		
		while((data=fr.read())!= -1)
		{
			System.out.print((char)data);
			Thread.sleep(100);
		}
	}
}