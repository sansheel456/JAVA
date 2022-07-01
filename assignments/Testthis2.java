//Program to test this with constructor by calling default from parameteetrised
package executor;

public class Testthis2 
{
	int a;
	
	Testthis2()
	{
		System.out.println("Default Body........");
	}

	Testthis2(int a)
	{
		this();
		this.a = a;
		System.out.println("Para Body........:"+a);
	}
	
	public static void main(String[] args) 
	{
		Testthis2 t=new Testthis2(15);

	}

}
