import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a value for x1:");
		int x1 = kb.nextInt();
		System.out.println("Enter a value for y1:");
		int y1 = kb.nextInt();
		System.out.println("Enter a value for x2:");
		int x2 = kb.nextInt();
		System.out.println("Enter a value for y2:");
		int y2 = kb.nextInt();
		Distance object = new Distance(x1, y1, x2, y2);
		
		System.out.println("X1: " + object.getXOne());
		System.out.println("Y1: " + object.getYOne());
		System.out.println("X2: " + object.getXTwo());
		System.out.println("Y2: " + object.getYTwo());
		System.out.println("Distance: " + object.getDist());
	}
}