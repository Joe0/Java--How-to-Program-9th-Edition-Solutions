package com.joepritzel.ch2.problem17;

import com.joepritzel.util.input.Console;
import com.joepritzel.util.math.SetOperations;

/**
 * 
 * Get a set of three numbers, and do a basic statistical analysis (sum,
 * average, product, smallest, and largest).
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
		int first, second, third;
		try {
			first = Console.getInteger("What is the first integer?");
			second = Console.getInteger("What is the second integer?");
			third = Console.getInteger("What is the third integer?");
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}

		displaySum(first, second, third);
		displayAverage(first, second, third);
		displayProduct(first, second, third);
		displaySmallest(first, second, third);
		displayLargest(first, second, third);
	}

	/**
	 * Displays the sum of the arguments.
	 * 
	 * @param args
	 *            - the integers to sum
	 */
	public static void displaySum(int... args) {
		Console.displayGenericInt("sum", SetOperations.sum(args));
	}

	/**
	 * Displays the average of the arguments.
	 * 
	 * @param args
	 *            - the integers to average
	 */
	public static void displayAverage(int... args) {
		Console.displayGenericInt("average", SetOperations.average(args));
	}

	/**
	 * Displays the product of the arguments.
	 * 
	 * @param args
	 *            - the integers to multiply
	 */
	public static void displayProduct(int... args) {
		Console.displayGenericInt("product", SetOperations.product(args));
	}

	/**
	 * Displays the largest of the arguments.
	 * 
	 * @param args
	 *            - the integers to find the largest of
	 */
	public static void displayLargest(int... args) {
		Console.displayGenericInt("largest", SetOperations.max(args));
	}

	/**
	 * Displays the smallest of the arguments.
	 * 
	 * @param args
	 *            - the integers to find the smallest of
	 */
	public static void displaySmallest(int... args) {
		Console.displayGenericInt("smallest", SetOperations.min(args));
	}
}
