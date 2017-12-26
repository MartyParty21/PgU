import java.lang.Double;

public class Odmocnina
{
	public static void main(String args[])
	{
		double a = Double.parseDouble(args[0]);
		double x = a / 2;
		double x2 = 0;

		while(true)
		{
			x2 = (x*2 + (a / (x*x))) / 3;
			if(Double.compare(x, x2) < 0.1D)
			{
				break;
			}
			x = x2;
		}
		System.out.printf("Treti odmocnina cisla %.0f je priblizne %.5f.\n", a, x2); //Program je presny az do 14. desetineho mista
	}
}