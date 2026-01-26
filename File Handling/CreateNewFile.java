//Creatw new file

import java.util.*;
import java.io.*;
class CreateNewFile
{
	public static void main(String[] args)throws IOException
	{
		File f = new File("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\File1.doc");
		boolean file = f.createNewFile();
		if(file)
		{
			System.out.println("File created Succesfully.....");
		}
		else
		{
			System.out.println("File not created");
		}
	}
}