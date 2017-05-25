import java.util.Scanner; //import Statement

public class APLab_03_Ex02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input 
		System.out.println("Hello. Here we will calculate your BMI. ");
		System.out.println("What is your height? ");
		
		//search for integer that the user enters
		int h = keyboard.nextInt();
		
		//prompt for user input 
		System.out.println("What is your weight? ");
		
		//search for the next integer that the user enters
		int w = keyboard.nextInt();
		
		//print the results...
		System.out.println("Your BMI is " + ((w*703)/(h*h)) );
	}
}