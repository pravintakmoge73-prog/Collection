//New line data writing

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class FileWriteExample 
{
    public static void main(String[] args) throws IOException
	{
        // 1. Access the file using the File class
        File myFile = new File("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\abc.txt");
		
		Writer fr = new FileWriter(myFile, true);
        // Use try-with-resources to ensure the writer is automatically closed
        BufferedWriter writer = new BufferedWriter(fr);
            
		// 2. Write data
		writer.write("This is a new entry.");
		
		// 3. Move to a new line for future entries
		writer.newLine(); 
		
		System.out.println("Data written successfully.");
        writer.close();
		fr.close();
       
    }
}
