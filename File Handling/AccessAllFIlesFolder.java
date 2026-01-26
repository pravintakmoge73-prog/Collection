//Fetching all files and folder

import java.io.*;
class AccessAllFIlesFolder
{
	public static void main(String[] args)
	{
		File f1= new File("D:\\java\\Core java\\11.Collection\\File Handling");
		
		File[] list = f1.listFiles();
		
		System.out.println("Printing Folder :");
		for(File f : list)
		{
			if(f.isDirectory())
				System.out.println(f);
		}

		System.out.println("Printing Files :");
		for(File f : list)
		{
			if(f.isFile())
				System.out.println(f);
		}
	}
}