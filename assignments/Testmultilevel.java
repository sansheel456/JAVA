package executor;

class Parent1
{
	void show()
	{
		System.out.println("Parent class executed...");
	}
}
class Child1 extends Parent1
{
	void disp()
	{
		System.out.println("Child class executed...");
	}
}
class Grandchild extends Child1
{
	void out()
	{
		System.out.println("Grandchild class executed...");
	}
}
public class Testmultilevel 
{

	public static void main(String[] args) 
	{
		Grandchild g=new Grandchild();
		g.show();
		g.disp();
		g.out();
	}

}
