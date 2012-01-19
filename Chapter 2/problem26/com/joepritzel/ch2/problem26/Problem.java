package com.joepritzel.ch2.problem26;

import com.joepritzel.util.input.Console;

/**
 * 
 * Determines if an integer is a multiple of another.
 * 
 * @author Joe Pritzel
 */
public class Problem {

	/**
	 * This is the main method, and contains the solution.
	 * 
	 * @param args
	 *            - unused
	 */
	public static void main(String[] args) {
		int value, value1;
		try {
			value = Console.getInteger("Enter an integer: ");
			value1 = Console.getInteger("Enter an integer: ");
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}

		System.out.printf("It is %b that %d is a multiple of %d.%n", value
				% value1 == 0, value, value1);
	}

}
