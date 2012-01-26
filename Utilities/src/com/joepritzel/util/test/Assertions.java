package com.joepritzel.util.test;

/**
 * Contains useful assertion methods.
 * 
 * @author Joe Pritzel
 * 
 */
public class Assertions {

	// TODO: Add assertions that display supplied messages.

	/**
	 * If true, do nothing. If false, print line and class.
	 * 
	 * @param exp
	 *            - The result of the expression.
	 */
	public static void assertE(boolean exp) {
		if (!exp) {
			dumpStack();
		}
	}

	/**
	 * If true, print success message. If false, print line and class.
	 * 
	 * @param exp
	 *            - The result of the expression.
	 * @param success
	 *            - The message to be displayed upon successful assertion.
	 */
	public static void assertE(boolean exp, String success) {
		if (!exp) {
			dumpStack();
			return;
		}

		System.out.println(success);
	}

	/**
	 * If true, print success message. If false, failure message.
	 * 
	 * @param exp
	 *            - The result of the expression.
	 * @param success
	 *            - The message to be displayed upon successful assertion.
	 * @param failure
	 *            - The message to be displayed up a failed assertion.
	 */
	public static void assertE(boolean exp, String success, String failure) {
		if (!exp) {
			System.out.println(failure);
		} else {
			System.out.println(success);
		}
	}

	/**
	 * Prints "Assertion failed on line %d of %s%n" where %d is the line number,
	 * and %s is the class.
	 * 
	 * This will be the line of the caller's caller.
	 */
	private static void dumpStack() {
		// Index 2 because this method is the first one, and the second is the
		// calling method.
		// The calling method will always be one inside this class, so we need
		// the calling method of that, which is index 2.
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		System.out.printf("Assertion failed on line %d of %s%n",
				e.getLineNumber(), e.getClassName());
	}
}
