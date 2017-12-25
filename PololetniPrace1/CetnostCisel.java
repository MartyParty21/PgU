import java.util.Scanner;

public class CetnostCisel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cisla cis = new Cisla();

		while(sc.hasNextInt())
		{
			cis.zapocitej(sc.nextInt());
		}

		if(cis.ziskejPocetPrvku == 0)
		{
			System.println("Nezadali jste zadne cislo!");
		}
		else
		{
			System.out.println("Zadana cisla serazena dle velikosti:");
			for(int j = 0; j < cis.ziskejPocetPrvku(); j++)
			{
				System.out.printf("Cislo %d jste zadali %dx.\n", cis.ziskejPrvekDleVelikosti(j), cis.ziskejCetnostDleVelikosti(j));
			}

			System.out.println("Zadana cisla serazena dle cetnosti:");
			for(int k = cis.ziskejPocetPrvku() - 1; k >= 0; k--)
			{
				System.out.printf("Cislo %d jste zadali %dx.\n", cis.ziskejPrvekDleCetnosti(k), cis.ziskejCetnostDleCetnosti(k));
			}
		}
	}
}