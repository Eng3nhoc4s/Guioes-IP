package exercicio2;

/**
 * Uma classe para imprimir o quadrado o cubo e a quarta potencia de alguns
 * numeros.
 *
 * @author Isabel Nunes
 * @version 1.0
 */
public class Potencias {

	public static void main(String[] args) {

		printPowers(2);

		printPowers(5);
		
		printPowers(7);
	}


	/**
	 * Prints the power calculation for the n base
	 * @param n Base
	 */
	static void printPowers(int n) {

		System.out.println(n + " ao quadrado = " + n * n);
		System.out.println(n + " ao cubo = " + Math.pow(n, 3));
		System.out.println(n + " ah quarta = " + Math.pow(n, 4));
		System.out.println();
	}
}