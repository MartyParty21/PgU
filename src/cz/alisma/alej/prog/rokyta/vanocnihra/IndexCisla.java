import java.util.Scanner

public class IndexCisla{
	public static void main(String[] args)
	{
		int pocetCisel = 0;
		int[] cisla = new int[500];
		Scanner sc = new Scanner(System.in())
		
		while(sc.hasNextInt())
		{
			if(pocet == cisla.length)
			{
				cisla = zvetsi(cisla, cisla.length * 2);
			}
			cisla[pocet] = sc.nextInt();
			pocet++;
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