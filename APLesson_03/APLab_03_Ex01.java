import java.util.Scanner; //import Statement

public class APLab_03_Ex01
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Hi, my name is RudeAI. ");
		System.out.println("I'd like to ask you a few questions. ");
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println(name + "?!!! Why would anyone name a baby that?");
		System.out.println("How old are you, " + name + "? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Oooooo!!! " + num + " is getting up there. " );
		System.out.println("What do you do for fun, " + name + "? ");
		
		String fun = keyboard.next();
		
		System.out.println("I thought only nerds like to " + fun);
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		System.out.println("How many siblings do you have?");
		
		int num1 = keyboard.nextInt();
		
		System.out.println(num1 + "? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		
		String grow = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a " + grow + ".");
		System.out.println("So " + name + ", you're " + num + "...");
		System.out.println("You like to " + fun + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + grow + ".");
		System.out.println("I'm only kiddin' " + name + ".");
	}
}