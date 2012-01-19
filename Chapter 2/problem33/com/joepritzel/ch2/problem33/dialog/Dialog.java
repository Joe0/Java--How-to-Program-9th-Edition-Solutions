package com.joepritzel.ch2.problem33.dialog;

/**
 * A Dialog interface.
 * 
 * @author Joe Pritzel
 * 
 */
public interface Dialog {
	/**
	 * @return A string that asks for the weight using the correct units for
	 *         that locale.
	 */
	public String getWeightMessage();

	/**
	 * 
	 * @return A string that asks for the height using the correct units for
	 *         that locale.
	 */
	public String getHeightMessage();

	/**
	 * @return The meaning according to the chart provided.
	 */
	public String getMeaning(double bmi);

	/**
	 * @return The equivalent of this in the corresponding language
	 *         "According to the Department of Health and Human Services/National Institute of Health, you are %s.%n"
	 */
	public String getMeaningWrappingText();

	/**
	 * @return The equivalent of this in the corresponding language
	 *         "The BMI for that height and weight is %1$.2f.%n"
	 */
	public String getBMIResultMessage();

	/**
	 * @return The equivalent of this in the corresponding language
	 *         "Unable to create calculation"
	 */
	public String getCalculationFailMessage();

	/**
	 * @return The equivalent of this in the corresponding language
	 *         "There was an error with your input!"
	 */
	public String getInputErrorMessage();
}
