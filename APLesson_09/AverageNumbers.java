public class AverageNumbers
{
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) +1;
		}
		
		for(int number : numbers)
			System.out.println(number);
		
		System.out.println();
		System.out.println("The average of the above numbers is... "  + average(numbers));
	}
	
	public static int average(int[] n)
	{
		int avg = 0;
		for(int num : n)
		{
			avg += num;
		}
		return avg/10;
	}
}