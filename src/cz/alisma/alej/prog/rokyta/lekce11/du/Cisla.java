package cz.alisma.alej.prog.rokyta.lekce11.du;

import java.util.Scanner;

public class Cisla
{
	public static void main(String args[])
	{
		Cetnosti cet = new Cetnosti();
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			cet.zapocitej(sc.nextInt());
		}

		int[] prvky = cet.ziskejPrvky();
		int pocetPrvku = cet.ziskejPocetPrvku();
		//*Vypisuje cetnost zadanych cisel
		for(int i = 0; i < pocetPrvku; i++)
		{
			System.out.printf("Cislo %d jste zadali %dx.\n", prvky[i], cet.ziskejCetnost(i));
		}

		int nejpocetnejsi = 0;
		for(int i = 0; i < pocetPrvku; i++)
		{
			if(cet.ziskejCetnost(i) > cet.ziskejCetnost(nejpocetnejsi))
			{
				nejpocetnejsi = i;
			}
		}

		System.out.println(prvky[nejpocetnejsi]);
	}
}