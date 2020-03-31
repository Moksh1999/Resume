import java.util.*;
interface Printable
{
	void print();
}

class Emp implements Printable
{
	int id,sal;
	String name;

	public Emp(int id,String name,int sal)
	{
			this.id=id;
			this.name=name;
			this.sal=sal;
	}
	
	
	
	public String toString()
	{
		return (id+"\n"+name+"\n"+sal);
	}
}


public class Practice {
	public static void main(String []args)
	{
		Emp e=new Emp(0, null, 0);
		
		
	}

	
}
