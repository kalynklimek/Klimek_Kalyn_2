import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int v = kb.nextInt();
		int factorial = 1;
		
		for(int i = 0; i<= v; i++)
		{
			System.out.println(factorial * i);
		}
	}
}