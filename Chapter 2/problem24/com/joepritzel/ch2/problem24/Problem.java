package com.joepritzel.ch2.problem24;

import com.joepritzel.util.input.Console;
import com.joepritzel.util.math.SetOperations;

/**
 * 
 * Displays the highest and lowest number in a set of 5 integers.
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
		int[] fiveInts = new int[5]; // Stores the 5 integers obtained from the user.
		try {
			for(int i = 0; i<fiveInts.length; i++) {
				fiveInts[i] = Console.getInteger("Enter an integer: ");	
			}
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}
		
		Console.displayGenericInt("maximum", SetOperations.max(fiveInts));
		Console.displayGenericInt("minimum", SetOperations.min(fiveInts));
	}
}
