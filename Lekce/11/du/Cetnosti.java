public class Cetnosti
{
	private int[] seznamCisel = new int[1];
	private int[] cetnost = new int[1];
	private int pocetCisel;

	public Cetnosti()
	{
		pocetCisel = 0;
	}

	public void zapocitej(int cislo)
	{
		//*Zvetsovani poli pokud je treba
		if (pocetCisel == seznamCisel.length) 
    	{
         	seznamCisel = zvetsi(seznamCisel, seznamCisel.length * 2);
        }   
        if (pocetCisel == cetnost.length) 
    	{
         	cetnost = zvetsi(cetnost, cetnost.length * 2);
        }

		if(pocetCisel == 0)
		{
			seznamCisel[pocetCisel] = cislo;
			cetnost[pocetCisel]++;
			pocetCisel++;
		}
		else
		{
			for(int i = 0; i < pocetCisel; i++)
			{
				if(cislo == seznamCisel[i]) //Pokud bylo zadane cislo jiz zadano predtim
				{
					cetnost[i]++;
					break;
				}
				if(i + 1 == pocetCisel)
				{
					seznamCisel[i + 1] = cislo;
					pocetCisel++;
				}
			}
		}
	}

	public int[] ziskejPrvky()
	{
		return seznamCisel;
	}

	public int ziskejCetnost(int index)
	{
		return cetnost[index];
	}

	public int ziskejPocetPrvku()
	{
		return pocetCisel;
	}

	//*Zvetsi pole
	private int[] zvetsi(int[] starePole, int novaVelikost)
    {
        int[] novePole = new int[novaVelikost];
        for (int i = 0; i < starePole.length; i++) {
            novePole[i] = starePole[i];
        }
        return novePole;
    }
}