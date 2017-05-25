import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter num1:");
		double num1 = kb.nextDouble();
		System.out.println("Please enter num2:");
		double num2 = kb.nextDouble();
		System.out.println("Please enter num3:");
		double num3 = kb.nextDouble();
		
		print("The average of " + num1 + ", " + num2 + ", and " + num3 + " is ", calcAvg(num1, num2, num3));
	}
	
	public static double calcAvg(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print(String text, double average)
	{
		System.out.println(text + average);
	}
}