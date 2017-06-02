/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("Spades", "ace", 8);
		Card c2 = new Card("Hearts", "2", 2);
		Card c3 = new Card("Hearts", "queen", 2);
		Card c4 = new Card("Diamonds", "king", 5);
		
		System.out.println("Does card 2 match card 3? " + c2.matches(c3));
		System.out.println("Are card 3 and card 4 the same suit? " + c3.matches(c4));
		System.out.println("Do card 1 and card 2 have the same rank? " + c1.matches(c2));
		System.out.println("Are card 2 and card 3 the same suit? " + c2.matches(c3));
	}
}
