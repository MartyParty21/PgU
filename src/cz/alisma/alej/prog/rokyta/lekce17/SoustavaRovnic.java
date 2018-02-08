package cz.alisma.alej.prog.rokyta.lekce17;

import java.util.Scanner;

public class SoustavaRovnic 
{
	//Neni hotove
	public static void main(String args[])
	{
		int pocetNeznamych = Integer.parseInt(args[0]);
		float[][] matice = new float[pocetNeznamych][pocetNeznamych + 1];
		float[] vysledky = new float[pocetNeznamych];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < pocetNeznamych; i++)
		{
			for(int j = 0; j < pocetNeznamych + 1; j++)
			{
				if(sc.hasNextInt())
				{
					matice[i][j] = (float)sc.nextInt();
				}
				else
				{
					System.out.println("Musite zadat cislo!");
					return;
				}
			}
		}
		
		tiskni(matice);
		
		for(int k = 0; k < pocetNeznamych - 1; k++)
		{
			matice = udelejKrok(matice, k);
			if(nemaReseni(matice, k))
			{
				System.out.println("nema reseni");
				break;
			}
		}
		
		for(int m = pocetNeznamych - 1; m > 0; m--)
		{
			vysledky[m] = matice[m][m] / matice[m][m+1];
		}
	}
	
	private static boolean nemaReseni(float[][] matice, int k) {
		int i = 0;
		while(matice[k][i] == 0)
		{
			if(i == matice.length)
			{
				return true;
			}
		}
		return false;
	}

	private static float[][] udelejKrok(float[][] pole, int krok)
	{
		int pocetRovnic = pole.length;
		float koeficient;
		
		for(int i = krok; i < pocetRovnic - 1; i++)
		{
			koeficient = pole[i+1][krok] / pole[krok][krok];
			System.out.printf("Koeficient = %f / %f = %f\n", pole[i+1][krok], pole[krok][krok], koeficient);
			for(int j = krok; j <= pocetRovnic; j++)
			{
				System.out.printf("%f -= %f * %f => %f\n", pole[i+1][j], pole[krok][j], koeficient, pole[i+1][j] -= pole[krok][j] * koeficient);
				//pole[i+1][j] -= pole[i][j] * koeficient;
			}
			tiskni(pole);
		}
		return pole;
	}
	
	private static void tiskni(float[][] matice)
	{
		for(int i = 0; i < matice.length; i++)
		{
			for(int j = 0; j < matice.length + 1; j++)
			{
				System.out.printf("%6.2f ", matice[i][j]);
			}
			System.out.println();
		}
		System.out.println("______________________________________________");
	}
}
