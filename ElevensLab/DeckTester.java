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
		String[] ranks = {"King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};
		int[] values = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Deck cards = new Deck(suits, ranks, values);
		System.out.println(cards.deal());
		System.out.println(cards);
	}
}
