import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int x = kb.nextInt();
		System.out.println("Please enter the size of the table:");
		int t = kb.nextInt();
		
		for(int i = 1; i <= t; i++)
		{
			System.out.println(i + "|" + i*x);
		}
	}
}