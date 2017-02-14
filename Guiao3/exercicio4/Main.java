package exercicio4;

public class Main {

	public static void main(String[] args) {

		int value = 987654321;

		System.out.println("A imagem de " + value + " ao espelho é " + reverseNumber(value));

	}

	/**
	 * Reverses a number's digits order
	 * @param num The number to be reversed
	 * @return The reversed number
	 */
	public static int reverseNumber(int num) {
		int result = 0;
		int index = 0;

		do {

			if (index != 0)
				result *= 10;

			result += (num % 10);

			num /= 10;
			index++;

		} while (num / 1 > 0);

		return result;

	}

}
