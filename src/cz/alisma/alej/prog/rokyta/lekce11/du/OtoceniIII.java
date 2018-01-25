package cz.alisma.alej.prog.rokyta.lekce11.du;

import java.util.Scanner;

public class OtoceniIII
{
	public static void main(String args[]) 
	{
		PoleIntu pole = new PoleIntu();

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			pole.pridej(sc.nextInt());
		}

		for(int i = pole.delka(); i >= 0; i--)
		{
			System.out.printf(" %d", pole.prvek(i));
		}
		System.out.println();
	}
}