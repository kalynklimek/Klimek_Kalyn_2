import java.util.Scanner;
public class BMI 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height:");
		double h = kb.nextInt();
		System.out.println("Please enter your weight:");
		double w = kb.nextInt();
		
		double BMI = ((w*703)/(h*h));
		String condition = calcCondish(BMI);
		System.out.println("Your BMI is " + BMI);
		System.out.println("You are " + condition);
	}
	
	public static String calcCondish(double BMI)
	{
		if(BMI <= 18.5)
			return "underweight";
		else if(BMI < 25)
			return "Normal";
		else if(BMI < 30)
			return "Overweight";
		else if(BMI < 35)
			return "Obese";
		else if(BMI < 40)
			return "Very Obese";
		else 
			return "Morbidly Obese";
	}
}