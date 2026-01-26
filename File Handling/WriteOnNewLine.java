//Writing data on new line

import java.util.*;
import java.io.*;
class WriteOnNewLine
{
	public static void main(String[] args)throws IOException
	{
		Writer fw = new FileWriter("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\abc.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data in String :");
		String data = sc.nextLine();
		bw.write(data);
		bw.newLine();
		System.out.println("Enter Data in String :");
		data = sc.nextLine();
		bw.write(data);
		bw.newLine();
		System.out.println("Data saved succesfully ...");
		bw.close();
		fw.close();
	}
}