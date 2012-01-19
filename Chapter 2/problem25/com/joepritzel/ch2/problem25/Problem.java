package com.joepritzel.ch2.problem25;

import com.joepritzel.util.input.Console;

/**
 * 
 * Determines if an integer is even or odd.
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
		int value;
		try {
				value = Console.getInteger("Enter an integer: ");	
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}
		
		System.out.printf("%d is %s.%n", value, value % 2 == 0 ? "even" : "odd");
	}
}
