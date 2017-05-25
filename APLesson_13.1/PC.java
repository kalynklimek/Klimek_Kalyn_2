public class PC extends GameSystem
{
	private String keyboard;
	private String mouse;
	
	public PC()
	{
		super();
	}
	
	public PC(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "keyboard and mouse";
	}
	
	public String toString()
	{
		return super.toString() + "g\n" +
				"System Input: " + systemInput();
	}
}