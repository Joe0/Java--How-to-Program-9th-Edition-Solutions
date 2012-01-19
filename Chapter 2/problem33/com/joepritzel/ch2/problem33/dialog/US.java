package com.joepritzel.ch2.problem33.dialog;

/**
 * A Dialog implementation for the US. It also uses the Imperial system.
 * 
 * @author Joe Pritzel
 * 
 */
class US implements Dialog {

	@Override
	public String getWeightMessage() {
		return "What is your weight in pounds? ";
	}

	@Override
	public String getHeightMessage() {
		return "What is your height in inches? ";
	}

	@Override
	public String getMeaning(double bmi) {
		if (bmi < 18.5) {
			return "underweight";
		} else if (bmi < 24.9) {
			return "normal";
		} else if (bmi < 29.9) {
			return "overweight";
		} else {
			return "obese";
		}
	}

	@Override
	public String getMeaningWrappingText() {
		return "According to the Department of Health and Human Services/National Institute of Health, you are %s.%n";
	}

	@Override
	public String getBMIResultMessage() {
		return "The BMI for that height and weight is %1$.2f.%n";
	}

	@Override
	public String getCalculationFailMessage() {
		return "Unable to create calculation";
	}

	@Override
	public String getInputErrorMessage() {
		return "There was an error with your input!";
	}

}
