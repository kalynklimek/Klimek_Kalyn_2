public class XsandOs
{
	public static void main(String[]args)
	{
		String [][] xAndO = new String [4][4];
		
		int randNum = (int)(Math.random()*2)+1;
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				if(randNum == 1)
				{
					xAndO[i][j] = "x";
				}
				if(randNum == 2)
				{
					xAndO[i][j] = "o";
				}
			}
		}
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}