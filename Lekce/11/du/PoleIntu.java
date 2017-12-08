public class PoleIntu 
{
	private int[] pole = new int[1];
	private int pocetPrvku;
    
    public PoleIntu() 
    {
    	pocetPrvku = 0;
    }
 
    // Přidá číslo na konec "pole"
    public void pridej(int a) 
    {
    	pole[pocetPrvku] = a;
    	pocetPrvku++;
    	if (pocetPrvku == pole.length) 
    	{
         	pole = zvetsi(pole, pole.length * 2);
        }       
    }
 
    // Vrátí počet prvků v poli
    public int delka()
    {
    	return pocetPrvku - 1;
    }
 
    // Řekne prvek na i-tém místě v poli
    public int prvek(int i)
    {
    	return pole[i];
    }

    private int[] zvetsi(int[] starePole, int novaVelikost) 
    {
        int[] novePole = new int[novaVelikost];
        for (int i = 0; i < starePole.length; i++) {
            novePole[i] = starePole[i];
        }
        return novePole;
    }
}