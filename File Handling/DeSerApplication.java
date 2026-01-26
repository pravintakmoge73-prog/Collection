//Deserialization

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
public class DeSerApplication
{   public static void main(String x[])throws Exception
	{  FileInputStream fin= new FileInputStream("D:\\java\\Core java\\11.Collection\\File Handling\\Demo\\Emp.txt");
	   ObjectInputStream in=new ObjectInputStream(fin);
	   Object obj = in.readObject();
	   Employee e=(Employee)obj;
	   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
	   System.out.println("save...");
	}
}

