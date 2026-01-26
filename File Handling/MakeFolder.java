//Create Folder

import java.io.*;
class MakeFolder
{
	public static void main(String[] args)
	{
		File f = new File("D:\\java\\Core java\\11.Collection\\File Handling\\Demo");
		if(f.exists())
		{
			System.out.println("Folder already Present.");
		}
		else
		{
			boolean folder = f.mkdir();
			if(folder)
			{
				System.out.println("Folder Created Succesfully.....!");
			}
			else
			{
				System.out.println("Some issue is there ..........");
			}
		}
	}
}