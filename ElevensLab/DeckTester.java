/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		String[] ranks = {"King", "Queen", "Jack"};
		int[] values = {11, 12, 13};
		Deck Cards = new Deck(suits, ranks, values);
		System.out.println(Cards.deal());
	}
}
