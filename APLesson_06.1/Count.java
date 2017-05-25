import java.util.Scanner;
public class Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int x = kb.nextInt();
		System.out.println("Please enter another integer:");
		int v = kb.nextInt();
		
		for(int i = 2; i<= x; i+= v)
		{
			System.out.print(i + " ");
		}
	}
}