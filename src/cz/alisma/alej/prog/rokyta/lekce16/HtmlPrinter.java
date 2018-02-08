package cz.alisma.alej.prog.rokyta.lekce16;

import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

public class HtmlPrinter implements QuadraticEquationPrinter {

	//Chybne
	private int a;
	private int b;
	private int c;
	private int x1;
	private int x2;
	
	@Override
	public void printEquation(int a, int b, int c, int x1, int x2) {
		System.out.printf("%dx^2 + %dx + %d ; x1 = %d, x2 = %d\n", a, b, c, x1, x2);
	}
	
	public void generate(int pocet, QuadraticEquationPrinter printer)
	{
		int konstanta;
		for(int i = 0; i < pocet; i++)
		{
			setX1((int) Math.random());
			setX2((int) Math.random());
			
			konstanta = (int) Math.random();
			setA(konstanta);
			setB((getX1() + getX2()) * konstanta);
			setC((getX1() * getX2()) * konstanta);		
		}
		
		this.printEquation(getA(), getB(), getC(), getX1(), getX2());
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
