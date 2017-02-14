/**
 * 
 */
package exercicio1;

public class Main {

	public static void main(String[] args) {

		double a = 1;
		double b = -22;
		double c = 1;
		
		double [] results = formulaResolvente(a, b, c);
		
		System.out.println("As raizes são: " + results[0] + " e " + results[1]);
			
	}
	
	/**
	 * Returns the roots for the second degree equation ax^2 + bx + c = 0
	 * @param a A Coeficient
	 * @param b B Coeficient
	 * @param c C Coeficient
	 * @return A 2 position array with both roots
	 */
	static double [] formulaResolvente (double a, double b, double c){
		
		double [] results = new double [2]; 
		
		double sqrtCalculation = Math.sqrt((b*b) - (4 * a * c));
		double divisor = 2 * a;
		
		results[0] = (-b - sqrtCalculation) / divisor;
		results[1] = (-b + sqrtCalculation) / divisor;
		
		return results;
	}

}
