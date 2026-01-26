//Read data words by words

import java.io.*;
class ReadDatabyCharArray
{
	public static void main(String[] args)throws IOException, InterruptedException
	{
		File f = new File("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\abc.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(char)f.length()];
		int len = fr.read(ch);
		for(int i=0; i<len; i++)
		{
			System.out.printf("%c",ch[i]);
		}
	}
}