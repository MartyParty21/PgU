package cz.alisma.alej.prog.rokyta.pololetniprace1;

import java.util.Arrays;

public class Cisla
{
	private int[][] seznamCisel = new int[1][2];
	private int[][] serazenePole = new int[1][2];
	private int[][] serazeneCetnosti = new int[1][2];
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
        //V pripade ze se cisla v poli mohou opakovat
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
				seznamCisel[pocetCisel][1]++;
				pocetCisel++;
			}
			else
			{
				for(int i = 0; i < pocetCisel; i++)
				{
					if(cislo == seznamCisel[i][0])//Pokud jiz cislo bylo zadano
					{
						seznamCisel[i][1]++;
						break;
					}
					if(i + 1 == pocetCisel)//Pokud cislo nebylo zadano
					{
						seznamCisel[i + 1][0] = cislo;
						pocetCisel++;
					}
				}
			}			
			serazeneCetnosti = seradDleCetnosti(seznamCisel, pocetCisel); //serazeni vsech prvku podle cetnosti
		}
		serazenePole = seradPrvky(seznamCisel, pocetCisel); //serazeni vsech prvku podle velikosti
	}

	//*Ziskani seznamu cisel s cetnosti v poradi zadavani, pole je delsi nez je prvku
	public int[][] ziskejPrvky()
	{
		return seznamCisel;
	}

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

	public int ziskejPrvekDleVelikosti(int index)
	{
		return serazenePole[index][0];
	}

	public int ziskejCetnostDleVelikosti(int index)
	{
		return serazenePole[index][1];
	}

	public int ziskejPrvekDleCetnosti(int index)
	{
		return serazeneCetnosti[index][0];
	}

	public int ziskejCetnostDleCetnosti(int index)
	{
		return serazeneCetnosti[index][1];
	}

	//*Vraci pole o velikosti poctu zadanych prvku
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

	//*Seradi elementy 2d pole podle [x][0] - velikosti cisel
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

	//*Seradi elementy 2d pole podle [x][1] - cetnosti
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