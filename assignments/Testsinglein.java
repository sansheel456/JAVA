package executor;

class Parent
{
	void show()
	{
		System.out.println("Parent class executed...");
	}
}
class Child extends Parent
{
	void disp()
	{
		System.out.println("Child class executed...");
	}
}
public class Testsinglein 
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.disp();
		c.show();
	}

}
