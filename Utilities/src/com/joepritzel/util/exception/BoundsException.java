package com.joepritzel.util.exception;

/**
 * 
 * This class is to be used when there is an out of bounds exception.
 * 
 * @author Joe Pritzel
 * 
 */
public class BoundsException extends RuntimeException {

	/**
	 * @param error
	 *            - The message to set as the error message.
	 */
	public BoundsException(String error) {
		super(error);
	}

	private static final long serialVersionUID = -2057360444904722742L;

}
