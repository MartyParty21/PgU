package cz.alisma.alej.prog.rokyta.lekce9;

import java.util.Scanner;

public class Kruh
{
	public static void main(String args[])
	{
		System.out.print("Zadejte polomer pozadovaneho kruhu: ");
		
		Scanner sc = new Scanner(System.in);
		int polomer = sc.nextInt();
		System.out.printf("%d \n", polomer);
	}
}