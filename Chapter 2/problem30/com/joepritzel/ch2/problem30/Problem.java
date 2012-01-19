package com.joepritzel.ch2.problem30;

import com.joepritzel.util.input.Console;

/**
 * 
 * Displays the digits of an integer.
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
		int val = 0;
		try {
			val = Console.getInteger("Enter an integer: ");
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}

		solutionOne(val);
		solutionTwo(val);
		solutionThree(val);
	}

	/**
	 * Uses division and subtraction. Doens't work for negatives.
	 */
	private static void solutionOne(int val) {
		// To account for negatives check the sign, and store it in a boolean
		// At the end, insert "- " at index 0
		StringBuilder sb = new StringBuilder();
		while (val > 0) {
			int digit = val - (val / 10 * 10);
			val /= 10;
			sb.append(digit).append(' ');
		}
		System.out.println(sb.reverse().toString().trim());
	}

	/**
	 * Uses division and the modulus operator. Doens't work for negatives.
	 */
	private static void solutionTwo(int val) {
		// To account for negatives check the sign, and store it in a boolean
		// At the end, insert "- " at index 0
		StringBuilder sb = new StringBuilder();
		while (val > 0) {
			sb.append(val % 10).append(' ');
			val /= 10;
		}
		System.out.println(sb.reverse().toString().trim());
	}

	/**
	 * Uses the replace method.
	 */
	private static void solutionThree(int val) {
		System.out.println(Integer.toString(val).replace("", " ").trim());
	}

}
