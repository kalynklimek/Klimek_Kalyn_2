import java.util.Scanner;
public class APLab_04_IDcard
{
	public static void main(String[]args)
	{
		APLab_04_IDcard form = new APLab_04_IDcard();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String word1 = kb.nextLine();
		System.out.println("Enter your last name:");
		String line1 = kb.nextLine();
		
		System.out.println("Enter your title:");
		String word2 = kb.next();
		System.out.println("Enter the school site:");
		kb.nextLine();
		String line2 = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String word3 = kb.next();
		System.out.println("What is your subject?");
		kb.nextLine();
		String line3 = kb.nextLine();
		
		System.out.println("*********************************");
		form.format(word1, line1);
		form.format(word2, line2);
		form.format(word3, line3);
		System.out.println("\n*********************************");
	}
	
	public void format(String word, String line)
	{
		System.out.printf("\n* %9s  %18s *", word, line);
	}
}