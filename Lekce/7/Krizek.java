public class Krizek
{
	public static void main(String args[])
	{
		int tloustka = Integer.parseInt(args[0]);

		udelejSloupecek(tloustka);
		udelejRadku(tloustka);
		udelejSloupecek(tloustka);
	}

	public static void udelejSloupecek(int tloustka)
	{
		for(int i = 0; i < tloustka; i++)
		{
			opakujZnak(' ', (int)tloustka * 4/3);
			opakujZnak('X', tloustka);
			System.out.println();
		}
	}

	public static void udelejRadku(int tloustka)
	{
		for(int j = 0; j < (int)tloustka * 2/3; j++)
		{
			opakujZnak('X', tloustka + 2*((int)tloustka * 4/3));
			System.out.println();
		}
	}

	public static void opakujZnak(char znak, int pocet)
	{
		for(int k = 0; k < pocet; k++)
		{
			System.out.printf("%c", znak);
		}
	}
}