package com.joepritzel.ch2.problem16.compare;

/**
 * Stores the result of the IntComparator.
 * 
 * @author Joe Pritzel
 * 
 */
public class Result<T> {
	private T value;

	Result(T s) {
		this.value = s;
	}
	
	/**
	 * @return The value of the Result.
	 */
	public T get() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
