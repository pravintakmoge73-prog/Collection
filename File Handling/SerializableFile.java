//kunal kushwas
//serilization

import java.io.*;
class Employee implements Serializable
{  private   int id;
   private   String name;
   private int sal;
   public void setId(int id)
   { this.id=id;
   }
   public int getId()
   { return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal()
   { return sal;
   }
}
public class SerializableFile
{   public static void main(String x[])throws Exception
	{  FileOutputStream fout= new FileOutputStream("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\Emp.txt");
	   ObjectOutputStream out=new ObjectOutputStream(fout);
	   Employee emp1 = new Employee();
	   emp1.setId(1);
	   emp1.setName("ABC");
	   emp1.setSal(10000);
	   out.writeObject(emp1);
	   out.close();
	   fout.close();
	   System.out.println("save...");
	}
}
