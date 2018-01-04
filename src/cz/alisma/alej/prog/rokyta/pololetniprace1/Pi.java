package cz.alisma.alej.prog.rokyta.pololetniprace1;

public class Pi
{
	public static void main(String args[])
	{	
		int polomer = 20000;
		int pocetBodu = (2 * polomer)*(2 * polomer);
		int pocetBoduVKruhu = 0;

		//Kod prevzaty z reseni ulohy Kruh z lekce 10
		for(int y = -polomer; y <= polomer; y++)
		{
			for(int x = -polomer; x <= polomer; x++)
			{
				if(jeVKruhu(x, y, polomer))
				{
					pocetBoduVKruhu++;
				}
			}
		}

		double pi = 4*((double)pocetBoduVKruhu/pocetBodu);
		System.out.printf("Hodnota Ludolfova cisla je priblizne %f.\n", pi);
	}

	//Kod prevzaty z reseni ulohy Kruh z lekce 10
	private static boolean jeVKruhu(int x, int y, int polomer) 
	{
        return polomer*polomer >= x*x + y*y;
    }
}