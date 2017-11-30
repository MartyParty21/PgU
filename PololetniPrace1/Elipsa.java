public class Elipsa
{
	public static void main(String args[])
	{
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);


		for(int y = -b; y <= b; y++)
		{
			for(int x = -a; x <= a; x++)
			{
				if(jeVElipse(x, y, a, b)) // pokud je elipsa
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	 private static boolean jeVElipse(int x, int y, int a, int b) 
	{
        return x*x*b*b + y*y*a*a <= a*a*b*b;
    }
}
