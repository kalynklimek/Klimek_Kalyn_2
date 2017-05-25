public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation ps4 = new PlayStation("ps4");
		XBox xbox360 = new XBox("xbox360");
		PC nintendo = new PC("nintendo");
		System.out.println(ps4);
		System.out.println(xbox360);
		System.out.println(nintendo);
	}
}