package com.joepritzel.ch2.problem31;

/**
 * Prints out the table.
 * 
 * @author Joe Pritzel
 * 
 */
public class Problem {

	/**
	 * This is the main method, and contains the solution.
	 * 
	 * @param args
	 *            - unused
	 */
	public static void main(String[] args) {
		System.out.printf("number\tsquare\tcube%n");
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
		}
	}
}
