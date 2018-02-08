package cz.alisma.alej.prog.rokyta.lekce18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Cetnost {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> cetnosti = new HashMap<>();
		
		while(sc.hasNextInt())
		{
			int cislo = sc.nextInt();
			if(cetnosti.containsKey(cislo))
			{
				cetnosti.put(cislo, cetnosti.get(cislo) + 1);
			}
			else
			{
				cetnosti.put(cislo, 1);
			}
		}
		
		for(int klic : cetnosti.keySet())
		{
			System.out.printf("cislo %d bylo zadano %d krat\n", klic, cetnosti.get(klic));
		}
	}
}
