package com.joepritzel.ch2.problem33.calculation;

/**
 * An interface for Calculations.
 * 
 * @author Joe Pritzel
 * 
 */
public interface Calculation {
	/**
	 * Calculates the BMI using the specified values.
	 * 
	 * @param weight
	 * @param height
	 */
	public double calc(double weight, double height);
}
