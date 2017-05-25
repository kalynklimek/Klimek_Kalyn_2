//import scanner
import java.util.Scanner;
public class AP_Lab_04_receipt
{
	public static void main(String[]args)
	{
		//new AP_Lab_04_receipt
		AP_Lab_04_receipt receipt = new AP_Lab_04_receipt();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item2: ");
		kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item3: ");
		kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();
		
		double subtotal = (price1 + price2 + price3);
		
		double tax = (subtotal/10);
		
		double total = (subtotal + tax);
		
		System.out.println("<<<<<<<receipt>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		receipt.format("Subtotal", subtotal);
		receipt.format("Tax", tax);
		receipt.format("Total", total);
		
		System.out.println("\n _________________________________________");
		System.out.println("\n * Thank you for your support*");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n* %17s ........ %10.2f", item, price);
	}
}