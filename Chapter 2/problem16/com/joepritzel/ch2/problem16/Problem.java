package com.joepritzel.ch2.problem16;

import com.joepritzel.ch2.problem16.compare.IntComparator;
import com.joepritzel.ch2.problem16.compare.Result;
import com.joepritzel.util.input.Console;

/**
 * Determines if a number is larger or equal to another number.
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
		int first, second; // Stores the values that the user is providing.
		try {
			first = Console.getInteger("What is the first integer?");
			second = Console.getInteger("What is the second integer?");
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}

		try {
			Result<Integer> res = IntComparator.compare(first, second);
			System.out.printf("%s is larger.%n", res);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
