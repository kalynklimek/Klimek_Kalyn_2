import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (r*r)*3.14;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f", area);
	}
}