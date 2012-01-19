package com.joepritzel.util.object;

/**
 * 
 * This is a tuple...
 * 
 * @author Joe Pritzel
 * 
 * @param <T>
 *            - the type of data that will be stored in this Tuple.
 */
public class Tuple<T> {

	/**
	 * Values should never be changed.
	 */
	private final T[] values;

	/**
	 * Ensure that all args are of type T.
	 * 
	 * @param v
	 *            - the data to be stored in the Tuple
	 */
	@SafeVarargs
	public Tuple(T... v) {
		values = v;
	}

	/**
	 * 
	 * @param i
	 *            - the index
	 * @return the value at the specified index
	 */
	public T get(int i) {
		return values[i];
	}

}
