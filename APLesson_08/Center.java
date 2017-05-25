import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter three words:");
		System.out.println(makeCenter(kb.next()));
		System.out.println(makeCenter(kb.next()));
		System.out.println(makeCenter(kb.next()));
		
	}
	
	public static String makeCenter(String word)
	{
		while(word.length() >= 20)
		{
			return word;
		}
		return makeCenter(" " + word + " ");
	}
}