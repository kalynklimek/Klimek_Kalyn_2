import java.util.Scanner;
public class APLab_04_Ex04
{
	public static void main(String[]args)
	{
		APLab_04_Ex04 volume = new APLab_04_Ex04();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the subwoofer box:");
		double l = kb.nextDouble();
		System.out.println("Enter the width:");
		double w = kb.nextDouble();
		System.out.println("Enter the height");
		double h = kb.nextDouble();
		double vol = volume.calcVol(l, w, h);
		System.out.printf("The volume of the subwoofer box in cubic feet is %5.2f\n", vol);
	}
	
	public double calcVol(double l, double w, double h)
	{
		return ((l*w*h)/1728);
	}
}