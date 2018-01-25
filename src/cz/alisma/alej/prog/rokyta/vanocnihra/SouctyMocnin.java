package cz.alisma.alej.prog.rokyta.vanocnihra;

public class SouctyMocnin{
	public static void main(String[] args)
	{
		int soucet = 0;
		int max = Integer.parseInt(args[0]);
		for(int i = 0; i*i < max; i++)
		{
			soucet += i*i;
		}

		System.out.println(soucet);
	}
}