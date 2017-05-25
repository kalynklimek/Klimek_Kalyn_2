import java.util.Scanner;
public class PasswordProgram
{
	static Scanner kb;
	static String username;
	static String password;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username = "kalynklimek";
		password = "gofalcons";
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter the username: ");
		String name = kb.next();
		System.out.println("Please enter your password: ");
		String pass = kb.next();
		if(name.equals(username) && pass.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(name.equals(username))
			{
				System.out.println("Your password is incorrect!");
			}
			else if(pass.equals(password))
			{
				System.out.println("The username is incorrect!");
			}	
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}