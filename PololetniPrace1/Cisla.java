import java.util.Arrays;

public class Cisla
{
	private int[] seznamCisel = new int[1];
	private int[] serazenePole = new int[1];
	private int[] cetnost = new int[1];
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
        if (pocetCisel == cetnost.length && !duplikovatelna) 
    	{
         	cetnost = zvetsi(cetnost, cetnost.length * 2);
        }

        if(duplikovatelna)
        {
        	seznamCisel[pocetCisel] = cislo;
        	pocetCisel++;
        }
        else
        {
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
					if(cislo == seznamCisel[i])
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
		serazenePole = seradPrvky(seznamCisel, pocetCisel);
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

	public int[] ziskejSerazenePrvky()
	{
		return serazenePole;
	}

	public int ziskejPrvek(int index)
	{
		return seznamCisel[index];
	}

	private int[] seradPrvky(int[] pole, int pocetCisel)
	{
		int[] serazenePole = new int[pocetCisel];
		for (int i = 0; i < pocetCisel; i++) 
        {
            serazenePole[i] = pole[i];
        }
        Arrays.sort(serazenePole);
		return serazenePole;
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