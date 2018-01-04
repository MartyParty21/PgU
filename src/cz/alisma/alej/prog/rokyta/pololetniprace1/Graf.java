package cz.alisma.alej.prog.rokyta.pololetniprace1;

import java.util.Scanner;

public class Graf
{
	public static void main(String args[])
	{
		int pole[] = new int[100];
		int maximum = 0;
		int pocet = 0;
		String vystup = "";

		Scanner sc = new Scanner(System.in);

		while(pocet < 100 && sc.hasNextInt())
		{
			pole[pocet] = sc.nextInt();

			if(pole[pocet] > maximum)
			{
				maximum = pole[pocet];
			}
			pocet++;
		}

		int sirka = 15 + (pocet * 25);

		vystup += "<?xml version=\"1.0\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\"\nwidth=\"" + sirka + "\" height=\"120\"\nviewBox=\"0 0 " + sirka + " 120\">\n";

		for(int i = 0; i < pocet; i++)
		{
			int velikost = pole[i];
			if(maximum > 100)
			{
				velikost = (int)(pole[i] * 100 / maximum + 0.5);
			}
			vystup += pridejSloupecek(velikost, i);
		}
		vystup += "</svg>";

		System.out.println(vystup);
	}

	private static String pridejSloupecek(int velikost, int poradi)
	{
		return "<rect x=\"" + (10 + poradi * 25) + "\" y=\"" + (110 - velikost) + "\" width=\"20\" height=\"" + velikost + "\"\nfill=\"blue\" stroke=\"black\" stroke-width=\"2\"/>\n";
	}
}