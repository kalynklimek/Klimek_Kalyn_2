import java.util.Scanner;
public class Lesson_07
{
	static int number;
	static int digit = 0; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = kb.nextInt();
		countDigits();
		System.out.println(number + " has " + digit + " digits. ");
	}
	public static void countDigits()
	{
		int num = number;
		while(num > 0)
		{
			digit += 1;
			num /= 10;
		}
	}
}