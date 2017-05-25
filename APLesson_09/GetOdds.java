public class GetOdds
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		
		System.out.println("For the following numbers... ");
		printArray();
		getOdds();
		System.out.println("\nThe numbers " + getOdds() + " are odd numbers.");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers [i] = (int)(Math.random()*100) +1;
		}
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	
	public static String getOdds()
	{
		String odds = "";
		for(int number : numbers)
		{
			if(number % 2 > 0)
			{
				odds += number + " ";
			}
		}
		return odds;
	}
}