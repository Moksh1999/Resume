import java.util.*;

interface Shape
{
	void area();
}

public class Rectangle implements Shape
{
	int l,b,ar;
	
	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	public void area(int i, int j) {
		ar=l*b;
		System.out.println(ar);
		
	}
}
public class Areash {
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.area(10,10);
	}

}
