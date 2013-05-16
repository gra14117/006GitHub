import java.util.Scanner;

public class askname 
{
	public static String[] askname(String firstname, String lastname)
	{
		Scanner user_input = new Scanner( System.in );
		System.out.println("Enter your  firstname: ");
		firstname = user_input.next( );
		
		System.out.println("Enter your  lastname: ");
		lastname = user_input.next( );
		
		String[] result=new String[2];
		result[0]=firstname;
		result[1]=lastname;
		return result;
	}
	

}
