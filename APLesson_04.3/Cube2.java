import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the side length of the cube:");
		double s = kb.nextDouble();
		
		print("The surface area of a cube whose sides are " + s + " in length is ", calcSurf(s));
	}
	
	public static double calcSurf(double s)
	{
		return 6*(s*s);
	}
	
	public static void print(String text, double surface)
	{
		System.out.println(text + surface);
	}
}