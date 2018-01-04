import java.util.Scanner;

public class Kruh
{
	public static void main(String args[])
	{
		System.out.print("Zadejte polomer pozadovaneho kruhu: ");
		
		Scanner sc = new Scanner(System.in);
		int polomer = sc.nextInt();

		for(int y = -polomer; y <= polomer; y++)
		{
			for(int x = -polomer; x <= polomer; x++)
			{
				if(polomer*polomer >= x*x + y*y) //pokud je v kruhu
				{
					System.out.printf("%c", '#');
				}
				else
				{
					System.out.printf("%c", ' ');
				}
			}
			System.out.println();
		}
	}
}