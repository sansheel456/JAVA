package executor;

public class Testthis 
{
	int rollno;
	String name;
	
	
	Testthis(int rollno, String name) 
	{
		this.rollno = rollno;
		this.name = name;		
	}
     void display()
     {
    	 System.out.println("The roll no is : "+rollno+" ,Name is : "+name);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Testthis s=new Testthis(41,"Sansheel");
        s.display();
	}

}
