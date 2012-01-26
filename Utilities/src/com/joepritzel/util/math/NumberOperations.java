package com.joepritzel.util.math;

/**
 * Contains basic operations that are not in the standard API.
 * 
 * @author Joe Pritzel
 * 
 */
public class NumberOperations {

	/**
	 * 
	 * @param i
	 *            - the integer to check
	 * @return If the value is negative, it returns true.
	 */
	public static boolean isNegative(int i) {
		return i < 0;
	}

	/**
	 * 
	 * @param i
	 *            - the integer to check
	 * @return If the value is positive, it returns true.
	 */
	public static boolean isPositive(int i) {
		return i > 0;
	}

	/**
	 * 
	 * @param i
	 *            - the integer to check
	 * @return If the value is equal to zero, it returns true.
	 */
	public static boolean isZero(int i) {
		return i == 0;
	}

	/**
	 * 
	 * @param d
	 *            - the double to check
	 * @return If the value is positive, it returns true.
	 */
	public static boolean isPositive(double d) {
		return d > 0;
	}

	/**
	 * 
	 * @param d
	 *            - the double to check
	 * @return If the value is negative, it returns true.
	 */
	public static boolean isNegative(double d) {
		return d < 0;
	}
}
