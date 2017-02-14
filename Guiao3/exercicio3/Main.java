package exercicio3;

public class Main {

	static final int SECONDS_IN_AN_HOUR = 3600;
	static final int SECONDS_IN_A_MINUTE = 60;

	public static void main(String[] args) {
		// Alinea 1
		int seconds = 30, minutes = 40, hours = 12;

		printTime(hours, minutes, seconds);
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

	/**
	 * Prints the time according to the specified format
	 * 
	 * @param h
	 *            How many hours
	 * @param m
	 *            How many minutes
	 * @param s
	 *            How many seconds
	 */
	static void printTime(int h, int m, int s) {

		int passedSeconds = timeToSeconds(s, m, h);

		System.out.println("São " + h + "h " + m + "m " + s + "s. Passaram " + passedSeconds + " desde a meia noite.");
	}

}
