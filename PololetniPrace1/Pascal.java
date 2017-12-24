public class Pascal
{
    public static void main(String[] args) 
    {
        int pocetRadku = Integer.parseInt(args[0]);
        int[][] pyramida = new int[pocetRadku][pocetRadku * 2 - 1];
        int stred = pocetRadku - 1; //Index poli patricich do stredniho sloupce
        int nejvetsiDelka = 1; //Drzi pocet cifer nejdelsiho cisla, potrebne pro pozdejsi formatovani vystupu

        pyramida[0][stred] = 1;

        for (int i = 1; i < pocetRadku; i++) 
        {
            for(int j = 0; j < pocetRadku * 2 - 1; j++)
            {
            	//osetreni krajnich pripadu
        		if(j == 0)
        		{
        			pyramida[i][j] = pyramida[i-1][j+1];
        		}
        		else if(j == pyramida[i].length - 1)
        		{
        			pyramida[i][j] = pyramida[i-1][j-1];
        		}

        		else
        		{
        			pyramida[i][j] = pyramida[i-1][j-1] + pyramida[i-1][j+1];
        		}
        		//zmena nejvetsi delky
        		if(String.valueOf(pyramida[i][j]).length() > nejvetsiDelka)
        		{
        			nejvetsiDelka = String.valueOf(pyramida[i][j]).length();
        		}
            }         
        }

        //Tisk trojuhelniku
        String format = "%" + nejvetsiDelka;
        for (int s = 0; s < pocetRadku; s++) 
		{
			for(int d = 0; d < pocetRadku * 2 - 1; d++)
			{
			 	if(pyramida[s][d] == 0)
			 	{
			 		System.out.printf(format + "s", " ");
			 		continue;
			 	}
				System.out.printf(format + "d", pyramida[s][d]);
			}    
			System.out.println();     
		}
    }
}