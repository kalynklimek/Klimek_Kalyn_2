public class ToyRunner
{
	public static void main(String[]args)
	{
		Car car = new Car("Toyota");
		AFigure afigure = new AFigure("Super man"); 
		
		System.out.println("Toy Info");
		System.out.println("Car: " + car.getCount() + " " + car.getName());
		System.out.println("Action Figure: " + afigure.getCount() + " " + afigure.getName());
	}
}