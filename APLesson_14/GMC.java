public class GMC implements Location
{
	private double [] coordinates;
	public GMC(double x, double y)
	{
		coordinates = new double [2];
		coordinates [0] = x;
		coordinates [1] = y;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	
	public void move(double x, double y)
	{
		coordinates [0] += x;
		coordinates [1] += y;
	}
	
	public double[] getLoc()
	{
		return coordinates;
	}
}