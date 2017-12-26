import java.util.Random;

public class Scitani
{
	public static void main(String args[])
	{	
		Random nahoda = new Random();
		for(int i = 0; i < 10; i++)
		{
			int vysledek = nahoda.nextInt(21);
			int a = nahoda.nextInt(vysledek + 1);
			int b = vysledek - a;
			System.out.printf("%d + %d = %d\n", a, b, vysledek);
		}
	}
}