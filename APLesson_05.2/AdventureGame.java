import java.util.Scanner;
public class AdventureGame
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.print("What type of music do you listen to?");
		String music = kb.nextLine();
		if(music.equals("pop"))
		{	
			System.out.println("Who is your favorite artist?");
			String artist = kb.nextLine();
			if(artist.equals("Justin Bieber"))
			{
				System.out.println("What's your favorite song by him?");
				String song = kb.nextLine();
				if(song.equals("Baby"))
				{
					System.out.println("Good choice!");
				}	
				else
				{
					System.out.println("That's awesome!");
				}
			}	
			else
			{
				System.out.println("What's your favorite song?");
				String jam = kb.nextLine();
				if(jam.equals("closer"))
				{
					System.out.println("That song is the best!");
				}
				else
				{
					System.out.println("That's a cool song!");
				}
			}
		}
		else
		{
			System.out.println("Do you like going to concerts?");
			String choice = kb.nextLine();
			if(choice.equals("yes"))
			{
				System.out.println("Have you been to Coachella?");
				String answer = kb.nextLine();
				if(answer.equals("yes"))
				{
					System.out.println("That's awesome!");
				}	
				else
				{
					System.out.println("You should go nextLine time!");
				}
			}
			else
			{
				System.out.println("Do you like movies?");
				String movies = kb.nextLine();
				if(movies.equals("yes"))
				{
					System.out.println("Movies are awesome!");
				}
				else
				{
					System.out.println("Wow, you must get bored easily!");
				}
			}
		}	
	}
}