public class OOPRunner
{	
	public static void main(String[]args)
	{
		OOParchitecture object = new OOParchitecture("proHndsm", "Professor", "Handsome");
		
		System.out.println("<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}