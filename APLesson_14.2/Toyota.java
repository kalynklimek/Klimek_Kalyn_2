public class Toyota extends Car
{
	public Toyota(String c)
	{
		location = new double[2];
		String[] coordinates = c.split(", ");
		location[0] = Double.parseDouble(coordinates[0]);
		location[1] = Double.parseDouble(coordinates[1]);
	}
}