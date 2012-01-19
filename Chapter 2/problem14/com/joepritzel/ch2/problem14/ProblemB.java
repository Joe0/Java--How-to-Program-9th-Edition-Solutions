package com.joepritzel.ch2.problem14;

import com.joepritzel.util.string.StringBufferUtil;

/**
 * 
 * Uses four System.out.print statements to display the numbers 1 to 4 on the
 * same line.<br>
 * There are two different solutions provided--some better than others.
 * 
 * @author Joe Pritzel
 * 
 */
public class ProblemB {

	/**
	 * This is the main method, and contains the solution.
	 * 
	 * @param args
	 *            - unused
	 */
	public static void main(String[] args) {
		solutionOne();
		solutionTwo();
	}

	/**
	 * This solution uses a StringBuilder, and a loop to generate the String. It
	 * then uses a series of substrings to display the solution.
	 */
	private static void solutionOne() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 4; i++) {
			sb.append(i).append(' ');
		}
		StringBufferUtil.removeLastChar(sb);
		sb.append(System.getProperty("line.separator"));
		String s = sb.toString();
		System.out.print(s.substring(0, 2));
		System.out.print(s.substring(2, 4));
		System.out.print(s.substring(4, 6));
		System.out.print(s.substring(6));
	}

	/**
	 * This solution simply prints strings, and gets the platform sepecifc line
	 * separator.
	 */
	private static void solutionTwo() {
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4" + System.getProperty("line.separator"));
	}

	

}
