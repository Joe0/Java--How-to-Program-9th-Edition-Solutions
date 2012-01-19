package com.joepritzel.ch2.problem16.compare;

/**
 * Compares integers.
 * 
 * @author Joe Pritzel
 * 
 */
public class IntComparator {

	/**
	 * Returns a Result indicating which is larger.  If the values are equal it throws an ArithmeticException.
	 * 
	 * @param i1
	 *            - the first int
	 * @param i2
	 *            - the second int
	 * @return the Result
	 */
	public static Result<Integer> compare(int i1, int i2) throws ArithmeticException {
		
		if(i1 == i2) {
			throw new ArithmeticException("These values are equal.");
		}
		
		if (i1 > i2) {
			return new Result<Integer>(i1);
		} else {
			return new Result<Integer>(i2);
		}
	}

}
