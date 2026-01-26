//File Handling

import java.util.*;
import java.io.*;
class AccessAllDriver
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		File[] root= File.listRoots();
		for(int i=0; i<root.length; i++)
		{
			long totalspace = root[i].getTotalSpace();
			long freespace = root[i].getFreeSpace();
			System.out.println(root[i]+"\ttotal Space :"+(totalspace/1073741824)+" GB"+"\t"+(freespace/1073741824)+" GB");
		}
	}
}