import java.util.Scanner;

public class Cetnost
{
	public static void main(String args[])
	{
		int[] cisla = new int[500];
		Scanner sc = new Scanner(System.in);
		int pocet = 0;
		Cisla

		while(sc.hasNextInt())
		{
			cisla[pocet] = sc.nextInt();
			pocet++;
		}

		Cisla num = new Cisla()

		for(int i = 0; i <= pocet; i++)
		{
			Cisla num = new Cisla(cisla[i]);
			for(int j = 0; j <= pocet; j++)
			{
				if (num.hodnota == cisla[j])
				{
					num.pocet++;	
				}
			}
		}
	}
}