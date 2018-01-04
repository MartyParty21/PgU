package cz.alisma.alej.prog.rokyta.lekce9;

public class OtoceniCiselBezLimitu {
    public static int[] zvetsi(int[] soucasne, int novaVelikost) {
        int[] nove = new int[novaVelikost];
        for (int i = 0; i < soucasne.length; i++) {
            nove[i] = soucasne[i];
        }
        return nove;
    }
 
    public static void main(String args[]) {
        int pole[] = new int[2];
        int pocet = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            pole[pocet] = sc.nextInt();
            pocet++;
            if (pocet == pole.length) {
                pole = zvetsi(pole, pole.length * 2);
            }
        }
        for (int i = pocet - 1; i >= 0; i--) {
            System.out.printf(" %d", pole[i]);
        }
        System.out.println();
    }
}
