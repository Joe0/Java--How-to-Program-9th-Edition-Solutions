package com.joepritzel.util.input;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This class contains methods to easily interact with the console.
 * 
 * @author Joe Pritzel
 * 
 */
public class Console {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Displays the message, and retrieves a base 10 integer from the console.
	 * 
	 * @return an integer from the console.
	 */
	public static int getInteger(String msg) throws InputMismatchException,
			NoSuchElementException, IllegalStateException {
		System.out.print(msg);
		return getInteger();
	}

	/**
	 * Displays the message, and retrieves a base 10 double from the console.
	 * 
	 * @return a double from the console.
	 */
	public static double getDouble(String msg) throws InputMismatchException,
			NoSuchElementException, IllegalStateException {
		System.out.print(msg);
		return getDouble();
	}

	/**
	 * Displays the message, and retrieves a base 10 long from the console.
	 * 
	 * @return a long from the console.
	 */
	public static long getLong(String msg) {
		System.out.print(msg);
		return getLong();
	}

	/**
	 * Retrieves a base 10 integer from the console.
	 * 
	 * @return an integer from the console.
	 */
	public static int getInteger() throws InputMismatchException,
			NoSuchElementException, IllegalStateException {
		return scanner.nextInt();
	}

	/**
	 * Retrieves a base 10 double from the console.
	 * 
	 * @return a double from the console.
	 */
	public static double getDouble() throws InputMismatchException,
			NoSuchElementException, IllegalStateException {
		return scanner.nextDouble();
	}

	/**
	 * Retrieves a base 10 long from the console.
	 * 
	 * @return a long from the console.
	 */
	public static long getLong() throws InputMismatchException,
			NoSuchElementException, IllegalStateException {
		return scanner.nextLong();
	}

	/**
	 * Uses "The %s is %d.%n" to display a string and int.
	 * 
	 * @param descWord
	 *            - the string that is used for %s.
	 * @param i
	 *            - the int that is used for %d.
	 */
	public static void displayGenericInt(String descWord, int i) {
		System.out.printf("The %s is %d.%n", descWord, i);
	}
}
