import java.util.Arrays;

public class Cisla
{
	private int[][] seznamCisel = new int[1][2];
	private int[][] serazenePole = new int[1][2];
	private int[][] serazeneCetnosti = new int[1][2];
	// private int[] cetnost = new int[1];
	private int pocetCisel;
	private boolean duplikovatelna;

	public Cisla()
	{
		this(false);
	}
	public Cisla(boolean dupl)
	{
		duplikovatelna = dupl;
		pocetCisel = 0;
	}

	public void zapocitej(int cislo)
	{
		//*Zvetsovani poli pokud je treba
		if (pocetCisel == seznamCisel.length) 
    	{
         	seznamCisel = zvetsi(seznamCisel, seznamCisel.length * 2);
        }   
     //    if (pocetCisel == cetnost.length && !duplikovatelna) 
    	// {
     //     	cetnost = zvetsi(cetnost, cetnost.length * 2);
     //    }

        if(duplikovatelna)
        {
        	seznamCisel[pocetCisel][0] = cislo;
        	pocetCisel++;
        }
        else
        {
			if(pocetCisel == 0)
			{
				seznamCisel[pocetCisel][0] = cislo;
				// cetnost[pocetCisel]++;
				pocetCisel++;
			}
			else
			{
				for(int i = 0; i < pocetCisel; i++)
				{
					if(cislo == seznamCisel[i][0])
					{
						seznamCisel[i][1]++;
						break;
					}
					if(i + 1 == pocetCisel)
					{
						seznamCisel[i + 1][0] = cislo;
						pocetCisel++;
					}
				}
			}			
			serazeneCetnosti = seradDleCetnosti(seznamCisel, pocetCisel);
		}
		serazenePole = seradPrvky(seznamCisel, pocetCisel);
	}

	public int[][] ziskejPrvky()
	{
		return seznamCisel;
	}

	// public int ziskejCetnost(int index)
	// {
	// 	return cetnost[index];
	// }

	public int ziskejPocetPrvku()
	{
		return pocetCisel;
	}

	public int[][] ziskejSerazenePrvky()
	{
		return serazenePole;
	}

	public int[][] ziskejSerazeneDleCetnosti()
	{
		return serazeneCetnosti;
	}

	public int ziskejPrvek(int index)
	{
		return seznamCisel[index][0];
	}

	public int ziskejCetnost(int index)
	{
		return seznamCisel[index][1];
	}

// 	private int[][] seradPrvky(int[][] pole, int pocetCisel)
// 	{
// 		int[][] serazenePole = new int[pocetCisel][2];
// 		for (int i = 0; i < pocetCisel; i++) 
//         {
//             serazenePole[i][0] = pole[i][0];
//             serazenePole[i][1] = pole[i][1];

//         }

//         Arrays.sort(serazenePole, new java.util.Comparator<int[]>() {
//     	public int compare(int[] a, int[] b) {
//         return Integer.compare(a[0], b[0]);
//     }
// });
// 		return serazenePole;
// 	}

	private int[][] orizniPole(int[][] pole, int pocetCisel)
	{
		int[][] oriznutePole = new int[pocetCisel][2];
		for (int i = 0; i < pocetCisel; i++) 
        {
            oriznutePole[i][0] = pole[i][0];
            oriznutePole[i][1] = pole[i][1];

        }
        return oriznutePole;
	}

	private int[][] seradPrvky(int[][] pole, int pocetCisel)
	{
		int[][]serazenePole = orizniPole(pole, pocetCisel);
        Arrays.sort(serazenePole, new java.util.Comparator<int[]>() {
    	public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});
		return serazenePole;
	}

	private int[][] seradDleCetnosti(int[][] pole, int pocetCisel)
	{
		int[][]serazeneCetnosti = orizniPole(pole, pocetCisel);
        Arrays.sort(serazeneCetnosti, new java.util.Comparator<int[]>() {
    	public int compare(int[] a, int[] b) {
        return Integer.compare(a[1], b[1]);
    }
});
		return serazeneCetnosti;
	}

	//*Zvetsi pole
	private int[][] zvetsi(int[][] starePole, int novaVelikost)
    {
        int[][] novePole = new int[novaVelikost][2];
        for (int i = 0; i < starePole.length; i++) {
            novePole[i][0] = starePole[i][0];
            novePole[i][1] = starePole[i][1];
        }
        return novePole;
    }
}