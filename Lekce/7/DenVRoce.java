public class DenVRoce {
    public static int[] dnyVMesici = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) 
    {
        int rok = Integer.parseInt(args[0]);
        int mesic = Integer.parseInt(args[1]);
        int den = Integer.parseInt(args[2]);

        if(jeMozneDatum(rok, mesic, den))
        {
            int vysledek = ziskejVysledek(rok, mesic, den);
            System.out.println(vysledek);
        }
        else
        {
            System.out.println("Musite zadat datum ve spravnem tvaru!");
        }
    }

    public static int ziskejVysledek(int rok, int mesic, int den)
    {
        int vysledek = den + ziskejDnyZmesice(mesic );
        if(jePrestupny(rok))
        {
            if(!(mesic <= 2 && den <= 29))
            {
                vysledek ++;
            }
        }
        return vysledek;
    }

    public static int ziskejDnyZmesice(int mesic)
    {
        int pocetDnuZMesicu = 0;
        for(int i = 0; i < mesic - 1; i++)
        {
            pocetDnuZMesicu += dnyVMesici[i];
        }
        return pocetDnuZMesicu;
    }

    public static boolean jePrestupny(int rok)
    {
        return (rok % 4 == 0);
    }

    public static boolean jeMozneDatum(int rok, int mesic, int den)
    {
        if(mesic <= 12)
        {
            if(jePrestupny(rok))
            {
                den -= 1;
            }

            if(den <= dnyVMesici[mesic - 1])
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}