
import java.util.*;

abstract class Shape
{
	abstract int area();
	void display()
	{
		System.out.println("Shape Class");
	}
}

class Rectangle extends Shape
{
	int length,width;
	
	void setrectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
		
	}
	
	
	int area()
	{
		return length*width;
	}
}

class Abstract1
{
	public static void main(String args[])
	{
		Rectangle s=new Rectangle();
		s.setrectangle(10,10);
		System.out.println(s.area());
	}
}
