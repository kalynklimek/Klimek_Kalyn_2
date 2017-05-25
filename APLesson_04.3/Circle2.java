import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle:");
		double r = kb.nextDouble();
		
		print("The area of a cirlce with a radius of " + r + " is " ,calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return 3.14*(r*r);
	}
	
	public static void print(String text, double Area)
	{
		System.out.println(text + Area);
	}
}