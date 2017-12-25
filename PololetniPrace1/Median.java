import java.util.Scanner;

public class Median
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cisla cis = new Cisla(true);

		while(sc.hasNextInt()) 
		{
			cis.zapocitej(sc.nextInt());
        }

        int[][] cisla = cis.ziskejSerazenePrvky();

        double median;
        int pocetCisel = cis.ziskejPocetPrvku();
        switch(pocetCisel % 2)
        {
        	case 0:
        		median = (double)(cis.ziskejPrvek(pocetCisel/2) + cis.ziskejPrvek(pocetCisel/2 - 1)) / 2;
        		break;
        	default:
        		median = cis.ziskejPrvek(pocetCisel/2);
        }
        System.out.printf("Median zadanych cisel je %.1f\n", median);
	}
}