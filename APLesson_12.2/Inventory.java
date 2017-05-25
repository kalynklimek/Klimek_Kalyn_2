import java.util.Scanner;
public class Inventory
{
	private String Manufacturer;
	private String name;
	private String category 
	private int UPC;
	private double price;
	
	public Inventory()
	{
		Manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public Inventory(String m, String n, String cat)
	{
		Manufacturer = m;
		name = n;
		category = cat;
		UPC = (int)(Math.random()*1000000000) + 1;
		price = 
	}
}