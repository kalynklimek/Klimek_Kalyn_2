import java.util.Random;
public class APLab_05_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + rollDice(player, computer));
	}
	
	public static String rollDice(int player, int computer)
	{
		String winner = "";
		if (player > computer)
			winner = "player";
		
		if (computer > player)
			winner = "computer";
		
		return winner;
	}
}