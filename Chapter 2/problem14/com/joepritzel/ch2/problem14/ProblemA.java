package com.joepritzel.ch2.problem14;

import com.joepritzel.util.string.StringBufferUtil;

/**
 * 
 * Uses one System.out.println statement to display the numbers 1 to 4 on the
 * same line.<br>
 * There are four different solutions provided--some better than others.
 * 
 * @author Joe Pritzel
 * 
 */
public class ProblemA {

	/**
	 * This is the main method, and contains the solution.
	 * 
	 * @param args
	 *            - unused
	 */
	public static void main(String[] args) {
		solutionOne();
		solutionTwo();
		solutionThree();
		solutionFour();
	}

	/**
	 * This solution uses a StringBuilder, and a loop to generate the String.
	 */
	private static void solutionOne() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 4; i++) {
			sb.append(i).append(' ');
		}
		StringBufferUtil.removeLastChar(sb);
		System.out.println(sb.toString());
	}

	/**
	 * This solution simply prints a String literal.
	 */
	private static void solutionTwo() {
		System.out.println("1 2 3 4");
	}

	/**
	 * Uses a character array and StringBuilder to compose the String.
	 */
	private static void solutionThree() {
		char[] numbers = { '1', '2', '3', '4' };
		StringBuilder sb = new StringBuilder();
		for (char c : numbers) {
			sb.append(c).append(' ');
		}
		StringBufferUtil.removeLastChar(sb);
		System.out.println(sb.toString());
	}

	/**
	 * Creates a String by adding integers, chars, and a single String together.
	 */
	private static void solutionFour() {
		System.out.println(1 + " " + 2 + ' ' + 3 + ' ' + 4);
	}

}
