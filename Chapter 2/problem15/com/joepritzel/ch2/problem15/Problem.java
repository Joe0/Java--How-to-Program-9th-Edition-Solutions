package com.joepritzel.ch2.problem15;

import com.joepritzel.util.input.Console;

/**
 * 
 * Requests two integers, then displays the sum, product, difference, and
 * quotient.
 * 
 * @author Joe Pritzel
 * 
 */
public class Problem {

	/**
	 * This is the main method, and contains the solution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int first, second;

		try {
			first = Console.getInteger("What is the first integer?");
			second = Console.getInteger("What is the second integer?");
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}

		displaySum(first, second);
		displayProduct(first, second);
		displayDifference(first, second);
		displayQuotient(first, second);
	}

	/**
	 * Calculates the sum, and displays it.
	 * 
	 * @param first
	 *            - the first term
	 * @param second
	 *            - the second term
	 */
	private static void displaySum(int first, int second) {
		displayGeneric("Sum", first + second);
	}

	/**
	 * Calculates the product, and displays it.
	 * 
	 * @param first
	 *            - the first term
	 * @param second
	 *            - the second term
	 */
	private static void displayProduct(int first, int second) {
		displayGeneric("Product", first * second);
	}

	/**
	 * Calculates the difference, and displays it.
	 * 
	 * @param first
	 *            - the first term
	 * @param second
	 *            - the second term
	 */
	private static void displayDifference(int first, int second) {
		displayGeneric("Difference", first - second);
	}

	/**
	 * Calculates the quotient, and displays it. If it is not possible, it
	 * displays "you cannot divide integers by zero".
	 * 
	 * @param first
	 *            - the first term
	 * @param second
	 *            - the second term
	 */
	private static void displayQuotient(int first, int second) {
		try {
			displayGeneric("Difference", first / second);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide integers by zero...");
		}
	}

	/**
	 * A generic method to display a solution.
	 * 
	 * @param prefix
	 *            - the type of operation
	 * @param value
	 *            - the solution
	 */
	private static void displayGeneric(String prefix, int value) {
		System.out.printf("%s: %d%n", prefix, value);
	}

}
