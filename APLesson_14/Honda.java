public class Honda implements Location
{
	private double [] location;
	
	public Honda(double[] loc)
	{
		location = loc;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		location [0] += x;
		location [1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}