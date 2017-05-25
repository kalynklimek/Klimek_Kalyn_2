public class TicketDriver
{
	public static void main(String[]args)
	{
		Advance discount = new Advance(15);
		StudentAdvance asbSticker = new StudentAdvance(9);
		Walkup late = new Walkup();
		System.out.println(discount);
		System.out.println(asbSticker);
		System.out.println(late);
	}
}