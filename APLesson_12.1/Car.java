public class Car
{
	private String p, i, e, t;
	
	public Car()
	{
		p = "";
		i = "";
		e = "";
		t = "";
	}
	
	public Car(String paint, String interior, String engine, String tires)
	{
		p = paint;
		i = interior;
		e = engine;
		t = tires;
	}
	
	//modifier
	public void getPaint(String paint)
	{
		p = paint;
	}
	
	//accessors
	public String getPaint()
	{
		return p;
	}
	
	public String getInterior()
	{
		return i;
	}
	
	public String getEngine()
	{
		return e;
	}
	
	public String getTires()
	{
		return t;
	}
}