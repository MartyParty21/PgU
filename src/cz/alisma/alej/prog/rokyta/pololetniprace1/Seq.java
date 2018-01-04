package cz.alisma.alej.prog.rokyta.pololetniprace1;

public class Seq
{
	public static void main(String args[])
	{
		int pocetArgumentu = args.length;
		String oddelovac = " ";
		int prvniCislo = 1;
		int krok = 1;
		int prvniCiselnyArgument = 0;

		if(args[0].equals("-s"))
		{
			oddelovac = args[1];
			prvniCiselnyArgument = 2;
		}

		int posledniCislo = Integer.parseInt(args[0 + prvniCiselnyArgument]);
		switch(pocetArgumentu - prvniCiselnyArgument)
		{
			default:
			case 1:
				break;
			case 2:
				prvniCislo = Integer.parseInt(args[0 + prvniCiselnyArgument]);
				posledniCislo = Integer.parseInt(args[1 + prvniCiselnyArgument]);
				break;
			case 3:
				prvniCislo = Integer.parseInt(args[0 + prvniCiselnyArgument]);
				krok = Integer.parseInt(args[1 + prvniCiselnyArgument]);
				posledniCislo = Integer.parseInt(args[2 + prvniCiselnyArgument]);
				break;
		}

		if(krok > 0)
		{
			for(int i = prvniCislo; i <= posledniCislo; i += krok)
			{
				System.out.printf("%d", i);
				if(i != posledniCislo)
				{
					System.out.printf("%s", oddelovac);
				}
			}
		}
		else if(krok < 0)
		{
			for(int i = prvniCislo; i >= posledniCislo; i += krok)
			{
				System.out.printf("%d", i);
				if(i != posledniCislo)
				{
					System.out.printf("%s", oddelovac);
				}
			}
		}
		System.out.println();
	}
}