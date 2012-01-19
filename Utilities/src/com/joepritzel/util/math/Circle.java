package com.joepritzel.util.math;

/**
 * 
 * This class contains methods dealing with circles.
 * 
 * @author Joe Pritzel
 * 
 */
public class Circle {

	/**
	 * Calculates the diameter from the radius.
	 * 
	 * @param radius
	 * @return The diameter of a circle.
	 */
	public static double diameter(int radius) {
		// 2 * r
		return 2 * radius;
	}

	/**
	 * Calculates the circumference of a circle.
	 * 
	 * @param radius
	 * @return The circumference of a circle with the specified radius.
	 */
	public static double circumference(int radius) {
		// 2 * pi * r
		return diameter(radius) * Math.PI;
	}

	/**
	 * Calculates the area of a circle.
	 * 
	 * @param radius
	 * @return The area of a circle with the specified radius.
	 */
	public static double area(int radius) {
		// pi * r^2
		return radius * radius * Math.PI;
	}
}
