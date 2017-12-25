import java.util.Scanner;
import java.util.Arrays;

public class Median
{
	public static void main(String args[])
	{
		int[] cisla = new int[0];
		int pocetCisel = 0;
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) 
		{
			if (pocetCisel == cisla.length) 
            {
                cisla = prodluzPole(cisla, cisla.length + 1);
            }
            cisla[pocetCisel] = sc.nextInt();
            pocetCisel++;
        }

        Arrays.sort(cisla);

        double median;
        switch(pocetCisel % 2)
        {
        	case 0:
        		median = (double)(cisla[pocetCisel/2] + cisla[pocetCisel/2 - 1]) / 2;
        		break;
        	default:
        		median = cisla[pocetCisel/2];
        }
        System.out.printf("Median zadanych cisel je %.1f\n", median);
	}

	public static int[] prodluzPole(int[] starePole, int novaVelikost) 
	{
        int[] novePole = new int[novaVelikost];
        for (int i = 0; i < starePole.length; i++) 
        {
            novePole[i] = starePole[i];
        }
        return novePole;
    }
}