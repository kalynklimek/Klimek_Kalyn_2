public class OOParchitecture
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public OOParchitecture()
	{
		//default values for instance vars
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with params
	public OOParchitecture(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifiers
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
}