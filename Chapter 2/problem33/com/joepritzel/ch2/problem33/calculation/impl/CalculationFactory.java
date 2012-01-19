package com.joepritzel.ch2.problem33.calculation.impl;

import com.joepritzel.ch2.problem33.calculation.Calculation;

/**
 * Used to create Calculations.
 * 
 * @author Joe Pritzel
 * 
 */
public class CalculationFactory {

	/**
	 * Creates a Calculation instance based on the class name.
	 * 
	 * @param className
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static Calculation create(String className)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		return Class.forName(className).asSubclass(Calculation.class)
				.newInstance();
	}
}
