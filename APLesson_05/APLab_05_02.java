import java.util.Scanner;
public class APLab_05_02
{
	public static void main(String[]args)
	{
		APLab_05_02 receipt = new APLab_05_02();
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item1:");
		String item1 = kb.next();
		System.out.println("Please enter price1:");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item2:");
		String item2 = kb.next();
		System.out.println("Please enter price2:");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item3:");
		String item3 = kb.next();
		System.out.println("Please enter price3:");
		double price3 = kb.nextDouble();
		
		System.out.println("Please enter item4:");
		String item4 = kb.next();
		System.out.println("Please enter price4:");
		double price4 = kb.nextDouble();
		
		double subtotal = (price1 + price2 + price3 + price4);
		
		double discount = CalcDiscount(subtotal);
		
		double total = (subtotal - discount);
		
		System.out.println("<<<<<<<receipt>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		receipt.format(item4, price4);
		receipt.format("Subtotal", subtotal);
		receipt.format("Discount", discount);
		receipt.format("Total", total);
		
		System.out.println("\n _________________________________________");
		System.out.println("\n * Thank you for your support*");
	}
	
	public static double CalcDiscount(double subtotal)
	{
		double discount = 0.0;
		if (subtotal >= 2000)
			discount = .15*subtotal;
		
		if (2000 > subtotal)
			discount = 0;
		
		return discount;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n* %17s ........ %10.2f", item, price);
	}
}