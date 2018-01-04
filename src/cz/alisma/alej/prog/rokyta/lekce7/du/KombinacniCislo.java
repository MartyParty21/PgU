package cz.alisma.alej.prog.rokyta.lekce7.du;

public class KombinacniCislo
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);

		if(n < k || n < 0 || k < 0)
		{
			System.out.println("Musite zadat dve cisla vetsi nez 0, kde cislo1 > cislo2");
		}
		else
		{
			int kombinacniCislo = faktorial(n) / (faktorial(k) * faktorial(n-k));
			System.out.printf("%d\n", kombinacniCislo);
		}
	}

	public static int faktorial(int zaklad)
	{
		int vypocet = 1;
         
        for(int i = zaklad; i > 0; i--)
        
        {
            vypocet *= i;
        }
        
        return vypocet;
	}
}