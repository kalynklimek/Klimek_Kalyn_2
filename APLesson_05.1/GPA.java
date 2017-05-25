import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your science grade:");
		String science = kb.next();
		System.out.println("Please enter your math grade:");
		String math = kb.next();
		System.out.println("Please enter your english grade:");
		String english = kb.next();
		System.out.println("Please enter your history grade:");
		String history = kb.next();
		System.out.println("Please enter your cheer grade:");
		String cheer = kb.next();
		System.out.println("Please enter your marketing grade:");
		String marketing = kb.next();
		System.out.println("Please enter your CompSci grade:");
		String CompSci = kb.next();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(history) + calcPoints(cheer) + calcPoints(marketing) + calcPoints(CompSci);
		double GPA = gPoints/7;
		
		System.out.println("Your GPA is " + GPA);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}