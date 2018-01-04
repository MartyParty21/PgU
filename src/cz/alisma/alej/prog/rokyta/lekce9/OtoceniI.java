package cz.alisma.alej.prog.rokyta.lekce9;

import java.util.Scanner;

public class OtoceniI
{
	public static void main(String args[])
	{
		int cisla[] = new int[99];
		int maxIndex = 0;
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			cisla[maxIndex] = sc.nextInt();
			maxIndex++;
		}

		for(int i = maxIndex - 1; i >= 0; i--)
		{
			System.out.println(cisla[i]);
		}
	}
}