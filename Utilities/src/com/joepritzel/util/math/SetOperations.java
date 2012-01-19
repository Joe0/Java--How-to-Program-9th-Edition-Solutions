package com.joepritzel.util.math;

/**
 * 
 * This class contains basic/common set operations.
 * 
 * @author Joe Pritzel
 * 
 */
public class SetOperations {

	/**
	 * Calculates the sum of integers supplied. Has no bounds checking.
	 * 
	 * @param args
	 *            - the integers to sum
	 * @return The sum of the integers
	 */
	public static int sum(int... args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Calculates the average of integers supplied. Has no bounds checking, and
	 * uses integer math.
	 * 
	 * @param args
	 *            - the integers to average
	 * @return The average of the integers
	 */
	public static int average(int... args) {
		return sum(args) / args.length;
	}

	/**
	 * Calculates the product of integers supplied. Has no bounds checking.
	 * 
	 * @param args
	 *            - the integers to multiply
	 * @return The product of the integers
	 */
	public static int product(int... args) {
		int product = 0;
		for (int i : args) {
			product *= i;
		}
		return product;
	}

	/**
	 * Finds the largest value. Does no bounds checking.
	 * 
	 * @param args
	 *            - the integers to find the largest value of
	 * @return The largest integer
	 */
	public static int max(int... args) {
		int largest = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] > largest) {
				largest = args[i];
			}
		}
		return largest;
	}
	
	/**
	 * Finds the smallest value. Does no bounds checking.
	 * 
	 * @param args
	 *            - the integers to find the smallest value of
	 * @return The smallest integer
	 */
	public static int min(int... args) {
		int smallest = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] < smallest) {
				smallest = args[i];
			}
		}
		return smallest;
	}
}
