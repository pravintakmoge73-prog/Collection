// Reading data from File line by line

import java.io.*;
class FileReaderExample
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\abc.txt");
		Reader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
	}
}