package com.joepritzel.ch2.problem33.calculation.impl;

import com.joepritzel.ch2.problem33.calculation.Calculation;

/**
 * A Calculation implementation that uses the units from the Imperial System.
 * 
 * @author Joe Pritzel
 * 
 */
class Imperial implements Calculation {
	
	Imperial() {
		// Only used to stop other packages from accessing it.
	}

	@Override
	public double calc(double weight, double height) {
		return (weight * 703) / (height * height);
	}

}
