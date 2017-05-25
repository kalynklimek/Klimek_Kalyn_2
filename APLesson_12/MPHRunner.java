import java.util.Scanner;
public class MPHRunner
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance:");
		int d = kb.nextInt();
		System.out.println("Enter the number of hours:");
		int hrs = kb.nextInt();
		System.out.println("Enter the number of minutes:");
		int mins = kb.nextInt();
		MPH object = new MPH(d, hrs, mins);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes,");
		System.out.println("Will result in " + object.getMPH() + " mph.");
	}
}