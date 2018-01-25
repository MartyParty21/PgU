package cz.alisma.alej.prog.rokyta.vanocnihra;

import java.util.Scanner;

public class IndexCisla{
	public static void main(String[] args)
	{
		int pocetCisel = 0;
		int[] cisla = new int[500];
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt())
		{
			if(pocetCisel == cisla.length)
			{
				cisla = zvetsi(cisla, cisla.length * 2);
			}
			cisla[pocetCisel] = sc.nextInt();
			pocetCisel++;
		}


	}

	public static int[] zvetsi(int[] soucasne, int novaVelikost) {
        int[] nove = new int[novaVelikost];
        for (int i = 0; i < soucasne.length; i++) {
            nove[i] = soucasne[i];
        }
        return nove;
    }
}