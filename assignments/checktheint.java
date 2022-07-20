package executor;
import java.util.Scanner;
public class checktheint {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enetr a Number: ");
		int n = in.nextInt();
		if(n>0)
		{
			System.out.println("Number is Positive. ");
		}
		else if(n<0)
		{
			System.out.println("Number is Negative. ");
		}
		else
		{
			System.out.println("Number is Zero. ");
		}
	}

}
