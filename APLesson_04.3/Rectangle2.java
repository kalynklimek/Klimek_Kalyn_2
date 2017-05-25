import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("Please enter the length of the rectangle:");
		int l = kb.nextInt();
		System.out.println("Please enter the width of the rectangle:");
		int w = kb.nextInt();
		
		//method calls 
		print(calcPerim(l, w));
	}
	
	public static int calcPerim(int l, int w)
	{
		return (2*l) + (2*w);
		//math 
		//use l and w directly
	}
	
	public static void print(int perimeter)
	{
		//print using the new perimeter 
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}