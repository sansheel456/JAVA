package executor;
class college2
{
	String cname;
	String city;
public college2()
	{
		cname="SFIT";
		city="Mumbai";
		System.out.println("Welcome to college portal");
	}
}
class Students extends college2
{
	String sname;
	
	Students()
	{
		sname="Sansheel";
		System.out.println("My name is:"+sname);
		
		System.out.println("I am from college:"+cname);		
	}
}
class Department extends college2
{
	String dept="Mechanical";
	
	public Department()
	{
		System.out.println("I am from college:"+cname+"the department is:"+dept);
	}
}
public class Hierarchical {
	public static void main(String[] args) 
	{
		Department d=new Department();
		Students s=new Students();
	}

}
