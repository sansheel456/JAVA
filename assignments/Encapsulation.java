package executor;

class Employee
{
	private int eid;
	private String ename;
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	
	//used getter and setter to access private data member
	
}
public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEid(6);
		e.setEname("Sansheel");
		System.out.println("The id of employee is: "+e.getEid());
		System.out.println("The name of employee is: "+e.getEname());
	}

}
