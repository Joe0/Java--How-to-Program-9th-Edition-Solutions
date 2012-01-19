package com.joepritzel.ch2.problem27;

import com.joepritzel.util.string.StringUtil;

/**
 * 
 * Displays a 8x16 checkerboard.
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
		for (int i = 0; i < 4; i++) {
			System.out.printf("%s%n%s%n", StringUtil.repeat("* ", 8), StringUtil.repeat(" *", 8));
		}
	}
}
