package cz.alisma.alej.prog.rokyta.lekce16;

import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;
 
public class Rovnice {
    public static void main(String[] args) {
    	//Chybne
        QuadraticEquationPrinter printer = new HtmlPrinter();

        QuadraticEquationGenerator.generate(10, printer);
    }
}