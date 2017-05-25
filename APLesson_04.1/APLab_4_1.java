import java.util.Scanner;
public class APLab_4_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		APLab_4_1 totalCost = new APLab_4_1();
		System.out.println("Please enter the interest rate:");
		double r = kb.nextDouble();
		System.out.println("Please enter the original amount you intend to borrow:");
		double P = kb.nextDouble();
		System.out.println("Please enter the number of times the loan is compounded per year:");
		double n = kb.nextDouble();
		System.out.println("Please enter the life of the loan in years:");
		double t = kb.nextDouble();
		double total = totalCost.CalcComInt(r, P, n, t);
		System.out.printf("Your total monthly payment is $%5.2f", total); 
	}
	
	public double CalcComInt(double r, double P, double n, double t)
	{
		return (P* (Math.pow(1 + r/n, n*t)))/(t*12);
	}
}