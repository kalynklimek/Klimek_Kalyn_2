import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("In order... ");
		for(String word : words)
		{
			System.out.print(word + " ");
		}
		
		System.out.println("\n\nReversed... ");
		Reverse(words);
	}
	
	public static void Reverse(String[] words)
	{
		for(int i = words.length-1; i >= 0; i--)
		{
			System.out.print(words[i] + " ");
		}
	}
	
}