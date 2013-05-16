import java.util.Scanner;
public class main 
{

	public static void main(String[] args)
	{
		System.out.println("Hello World");
		Scanner user_input = new Scanner( System.in );
		String firstname;
		System.out.print("Enter your  firstname: ");
		firstname = user_input.next( );
		System.out.println("Hello, "+firstname+"!");
	}

}
