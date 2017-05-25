public class Toyota implements Location
{
	private double [] location;
	
	public Toyota(String c)
	{
		String [] coordinates = c.split(", ");
		location[0] = Double.parseDouble(coordinates[0]);
		location[1] = Double.parseDouble(coordinates[1]);
	}	
	
	public int getID()
	{
		return (int)(Math.random()*1000000) +1;
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