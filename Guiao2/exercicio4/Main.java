public class Main {

	public static void main(String[] args) {

		int myValue = 69; // Change here to test

		char value[] = Integer.toString(myValue).toCharArray();

		int sum = 0;

		for (int i = 0; i < value.length; i++) {
			sum += Character.getNumericValue(value[i]);
		}

		System.out.println("A soma do digitos é " + sum);
	}

}
