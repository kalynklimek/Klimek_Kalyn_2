import java.util.Scanner;
public class FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number:");
		int num1 = kb.nextInt();
		System.out.println("Please enter your sequence size:");
		int seqsize = kb.nextInt();
		int [] seq = new int[seqsize];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i==0 || i == 1)
			{
				seq[i] = num1;
			}
			else 
			{
				seq[i] = seq[i-2] + seq[i-1];
			}
			System.out.println(seq[i] + " ");
		}	
	}
}