import java.util.Scanner; //import Statement

public class APLab_03_Ex03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle?");
		double a = keyboard.nextDouble();
		
		System.out.println("The width?");
		double b = keyboard.nextDouble();
		
		System.out.println("The area of your rectangle is " + a*b);
		System.out.println("What is the height of the rectangle?");
		
		double c = keyboard.nextDouble();
		
		System.out.println("The volume of the rectangle is " + a*b*c);
	}
}