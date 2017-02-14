package exercicio5;

public class Main {

	public static void main(String[] args) {

		int capital = 5000;
		double taxa = 0.05;
		
		System.out.println("capitalização de " + capital + "€ sobre a taxa de " + (taxa * 100) + "%:");
		System.out.println("Com taxa anual: " + capitalizaUmAno(capital, taxa));
		System.out.println("Com taxa mensal: " + capitalizaMensalmenteUmAno(capital, taxa));
	}
	
	/**
	 * Dados o valor do capital aplicado e a taxa anual a aplicar, calcula e
	 * devolve o montante resultante da aplicação desse capital a 
	 * essa taxa anual, durante 1 ano.
	 * @param p Valor do capital
	 * @param i Valor da taxa
	 * @return Montante resultante
	 */
	static double capitalizaUmAno (int p, double i){
		
		return p + (p * i);
	}
	
	/**
	 * Dados o valor do capital aplicado e a taxa mensal a aplicar, 
	 * calcula e devolve o montante resultante da aplicação desse 
	 * capital a essa taxa mensal, durante 1 ano.
	 * @param p Valor capital
	 * @param i Taxa Anual
	 * @return Valor Mensalmente capitalizado durante um ano
	 */
	static double capitalizaMensalmenteUmAno (int p, double i){
		
		for(int j = 0; j < 12; j++){
			
			p += (p * i);
		}
		
		return p;
	}

}
