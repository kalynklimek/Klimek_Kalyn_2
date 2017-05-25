import java.util.Scanner; 
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What color is your hair?");
		String h = kb.next();
		System.out.println("What color are your eyes?");
		String e = kb.next();
		System.out.println("What is your skin color?");
		String s = kb.next();
		Human object = new Human(h, e, s);
		
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		
		object.setHES("blonde", "blue", "white");
		System.out.println("Friend's info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
	}
}