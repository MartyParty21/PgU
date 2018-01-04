package cz.alisma.alej.prog.rokyta.lekce9;

import java.util.Scanner;

public class Graf
{
	public static void main(String args[])
	{
		System.out.println("Zadejte max. sto kladnych cisel.");
		int pole[] = new int[100];
		int maximum = 0;
		int pocet = 0;

		Scanner sc = new Scanner(System.in);

		for(; pocet < 100; pocet++)
		{
			if(sc.hasNextInt())
			{
				pole[pocet] = sc.nextInt();

				if(pole[pocet] > maximum)
				{
					maximum = pole[pocet];
				}
			}
			else
			{
				break;
			}
		}

		for(int i = 0; i < pocet; i++)
		{
			int pocetKrizku = pole[i];
			if(maximum > 60)
			{
				pocetKrizku = (int)(pole[i] * 60 / maximum + 0.5);
			}
			for(int j = 0; j < pocetKrizku; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}