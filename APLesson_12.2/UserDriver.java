import java.util.Scanner;
public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstname = kb.next();
		System.out.println("Please enter your last name:");
		String lastname = kb.next();
		User user1;
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String choice = kb.next();
		
		if(choice.equals("n"))
		{
			user1 = new User(firstname, lastname);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter avatar:");
			String avatar = kb.next();
			user1= new User(firstname, lastname, avatar);
		}
		
		System.out.println(user1);
	}
}