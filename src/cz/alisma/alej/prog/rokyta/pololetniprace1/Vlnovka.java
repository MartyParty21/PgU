package cz.alisma.alej.prog.rokyta.pololetniprace1;

public class Vlnovka
{
	public static void main(String args[])
	{
		int velikost = Integer.parseInt(args[0]);

		for(int i = 0; i < velikost; i++)
		{
			udelejRadku(velikost, i);
			System.out.println();
		}
	}

	public static void udelejRadku(int velikost, int radka)
	{	
		int soucetMezer = 2*velikost - 3;
		int pocetMezer1 = soucetMezer - 2*radka;
		int pocetMezer2 = soucetMezer - pocetMezer1 - 1;

		int pocetZnaku = 0;
		while(pocetZnaku < 80)
		{
			if(pocetZnaku == 0)
			{
				tiskniZnak(' ', radka);
				pocetZnaku += radka;
			}
			if(radka == 0 || radka == velikost -1)
			{
				tiskniZnak('#', 1);
				tiskniZnak(' ', soucetMezer);
				pocetZnaku += soucetMezer + 1;
			}
			else
			{
				tiskniZnak('#', 1);
				tiskniZnak(' ', pocetMezer1);
				tiskniZnak('#', 1);
				tiskniZnak(' ', pocetMezer2);
				pocetZnaku += pocetMezer1 + pocetMezer2 + 2;
			}

		}
	}

	public static void tiskniZnak(char znak, int pocet)
	{
		for(int i = 0; i < pocet; i++)
		{
			System.out.printf("%c", znak);
		}
	}
}