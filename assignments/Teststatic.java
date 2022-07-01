//Program for static variable
package executor;
//create class
public class Teststatic 
{
//Declare main method
	int rollno;
	String studentname;
	static String collegename="SFIT";
	static void change()
	{
	    collegename="MIT";
	}
	Teststatic(int r, String sname)
	{
		rollno = r;
		studentname = sname;
	}
	void dispOutput() 
	{
		System.out.println("The rollno is:"+rollno+"name is:"+studentname+"the collegename is:"+collegename);
	}
	public static void main(String[] args) 
	{
		Teststatic.change();
		
		Teststatic t=new Teststatic(1,"Sansheel");
		Teststatic t1=new Teststatic(2,"Sanket");
		Teststatic t3=new Teststatic(3,"Swapnil");
		//t.change();
		t.dispOutput();
		//t1.change();
		t1.dispOutput();
		//t3.change();
		t3.dispOutput();
	}

}
