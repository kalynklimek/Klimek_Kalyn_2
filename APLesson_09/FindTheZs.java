import java.util.Scanner;
public class FindTheZs
{
	static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		System.out.println("Please enter 5 words:");
		fillArray();
		System.out.println("For the words, ");
		printArray();
		hasZs();
		System.out.println("only " + hasZs() + "contain(s) the letter z.");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}