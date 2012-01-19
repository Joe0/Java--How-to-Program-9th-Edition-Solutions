package com.joepritzel.util.string;

/**
 * 
 * This class contains helper methods for Strings.
 * 
 * @author Joe Pritzel
 * 
 */
public class StringUtil {

	/**
	 * Repeats a string n times.
	 * 
	 * @param s
	 *            - the string to repeat.
	 * @param n
	 *            - the number of times to repeat the string.
	 * @return The repeated string.
	 */
	public static String repeat(String s, int n) {
		// %% is a literal % (it's needed due to the nested formatting)
		// %d is replaced by the value of n
		// %0 is to zero-pad
		// The resulting String is %0nd
		// If you format that, then you get 0 n times
		// Then, replace 0 with the string of your choice
		return String.format(String.format("%%0%dd", n), 0).replace("0", s);
	}
}
