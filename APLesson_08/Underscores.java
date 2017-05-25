import java.util.Scanner;
public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String line)
	{
		if(line.indexOf(" ") < 0)
		{
			return line;
		}
		else
		{
			return replace(line.substring(0, line.indexOf(" ")) + "_" +  line.substring(line.indexOf(" ")+1));
		}
	}
}