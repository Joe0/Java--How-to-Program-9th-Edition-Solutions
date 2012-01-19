package com.joepritzel.ch2.problem28;

import com.joepritzel.util.input.Console;
import com.joepritzel.util.math.Circle;

/**
 * Displays the diameter, circumference, and area of a circle when given the
 * radius.
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

		int r;
		try {
			r = Console.getInteger("Enter the radius: ");
		} catch (Exception e) {
			System.out.println("There was an error with your input!");
			return;
		}

		System.out.printf("The diameter is %d.%n", (int) Circle.diameter(r));
		System.out
				.printf("The circumference is approximately %f.%n", Circle.circumference(r));
		System.out.printf("The area is approximately %f.%n", Circle.area(r));
	}
}
