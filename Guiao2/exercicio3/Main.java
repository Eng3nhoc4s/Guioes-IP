public class Main {

	static final int SECONDS_IN_A_DAY = 86400;
	static final int SECONDS_IN_AN_HOUR = 3600;
	static final int SECONDS_IN_A_MINUTE = 60;

	public static void main(String[] args) {

		// Alinea 1
		int seconds = 30, minutes = 40, hours = 12;

		int passedSeconds = timeToSeconds(seconds, minutes, hours);

		System.out.println("São " + hours + "h " + minutes + "m " + seconds + "s. Passaram " + passedSeconds
				+ " desde a meia noite.");

		// Alinea 2
		int totalSecondsToEndDay = SECONDS_IN_A_DAY - passedSeconds;
		System.out.println("Faltam " + totalSecondsToEndDay + " para acabar o dia.");

		// Alinea 3
		float dayPercentage = ((float) passedSeconds / SECONDS_IN_A_DAY) * 100f;
		System.out.println("Já passou " + dayPercentage + "% do dia.");

		// Alinea 4
		int secondsToConvert = 69169; // Change this value to whatever you want
										// to test

		// Will hold the remainder seconds at the end of the calculation
		int remainderSeconds = secondsToConvert;
		// Calculate the hours ammount
		int convertedHours = remainderSeconds / SECONDS_IN_AN_HOUR;
		remainderSeconds -= convertedHours * SECONDS_IN_AN_HOUR;

		// Calculate the minutes ammount
		int convertedMinutes = remainderSeconds / SECONDS_IN_A_MINUTE;
		remainderSeconds -= convertedMinutes * SECONDS_IN_A_MINUTE;

		System.out.println("Passaram " + secondsToConvert + " segundos desde a meia noite. São " + convertedHours + "h "
				+ convertedMinutes + "m " + remainderSeconds + "s.");
	}

	/**
	 * Converts the sum of hours, minutes and seconds into seconds
	 * 
	 * @param sec
	 *            The ammount of seconds
	 * @param min
	 *            The ammount of minutes
	 * @param hrs
	 *            The amount of hours
	 * @requires sec >= 0 && min >= 0 && hrs >= 0
	 * @return The total of seconds
	 */
	public static int timeToSeconds(int sec, int min, int hrs) {

		return (hrs * SECONDS_IN_AN_HOUR) + (min * SECONDS_IN_A_MINUTE) + sec;
	}

}
