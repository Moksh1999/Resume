class Mydate
{
	int dd,mm,yy;
	
	void setdata(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

		public String toString()
		{
			return ""+dd+""+mm+""+yy;
		}
	public static void main(String args[])
	{
		Mydate d=new Mydate();
		d.setdata(12,12,12);
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.hashCode());
	}
}