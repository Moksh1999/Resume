class Employee
{

	int empId;
	String empName;
	String empLocation;
	String cname;
	int regno;

	void setEmployee(int empId,String empName,String empLocation,String cname,int regno)
	{
	
		this.empId=empId;
		this.empName=empName;
		this.empLocation=empLocation;
		this.cname=cname;
		this.regno=regno;
	}

	Employee(int empId,String empName,String empLocation,String cname,int rego)
	{
		this.empId=empId;
		this.empName=empName;
		this.empLocation=empLocation;
		this.cname=cname;
		this.regno=regno;
	}

	void getEmp()
	{
		System.out.println(empId+" "+empName+" "+empLocation);
	}

}

	class EmployeeMain
	{
		public static void main(String args[])
		{
			Employee e;
			e=new Employee(101,"Santosh","Delhi","heLO",0);
			e=null;
			e.getEmp();
		}
	}
