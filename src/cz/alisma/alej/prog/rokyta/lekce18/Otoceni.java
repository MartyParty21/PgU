package cz.alisma.alej.prog.rokyta.lekce18;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Otoceni {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> listCisel = new LinkedList<>();
		while(sc.hasNextInt())
		{
			listCisel.add(sc.nextInt());
		}
		for(int i = listCisel.size() - 1; i >= 0; i--)
		{
			System.out.printf("%d ", listCisel.get(i));
		}
	}
}
