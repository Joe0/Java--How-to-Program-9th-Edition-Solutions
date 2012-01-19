package com.joepritzel.ch2.problem32;

import com.joepritzel.util.input.Console;
import com.joepritzel.util.math.NumberOperations;

/**
 * Determines how many negatives, positives, and zeros there are.
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
		int pos = 0;
		int neg = 0;
		int zero = 0;
		try {
			for (int i = 0; i < 5; i++) {
				int val = Console.getInteger("Enter an integer: ");
				if (NumberOperations.isPositive(val)) {
					pos++;
				} else if (NumberOperations.isNegative(val)) {
					neg++;
				} else if (NumberOperations.isZero(val)) {
					zero++;
				}
			}
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}
		System.out.printf("There are %d positives.%nThere are %d negatives.%nThere are %d zeros.%n", pos, neg, zero);
	}

}
