package com.joepritzel.ch2.problem33;

import java.util.Locale;

import com.joepritzel.ch2.problem33.calculation.Calculation;
import com.joepritzel.ch2.problem33.calculation.impl.CalculationFactory;
import com.joepritzel.ch2.problem33.dialog.Dialog;
import com.joepritzel.ch2.problem33.dialog.DialogFactory;
import com.joepritzel.util.input.Console;

/**
 * Calculates BMI.
 * 
 * @author Joe Pritzel
 * 
 */
public class Problem {

	/**
	 * This is the main method, and contains the solution.
	 * 
	 * @param args
	 *            - unused
	 */
	public static void main(String[] args) {
		// Uncomment the following line to test the UK version
		// Locale.setDefault(new Locale("UK"));
		// Uncomment to force the US locale
		// Locale.setDefault(new Locale("US"));
		Dialog dialog;
		try {
			dialog = DialogFactory.createDialog();
		} catch (Exception e) {
			// Can't use the dialog to get a language specific message.  Would need to resort to externalizing the Strings.
			System.out.println("Unable to create dialog.");
			return;
		}

		double height, weight;
		try {
			height = Console.getDouble(dialog.getHeightMessage());
			weight = Console.getDouble(dialog.getWeightMessage());
		} catch (Exception e) {
			System.out.println(dialog.getInputErrorMessage());
			return;
		}

		Calculation calc;
		try {
			calc = CalculationFactory
					.create("com.joepritzel.ch2.problem33.calculation.impl."
							+ (Locale.getDefault().getCountry().equals("US") ? "Imperial"
									: "Metric"));
		} catch (Exception e) {
			System.out.println(dialog.getCalculationFailMessage());
			return;
		}

		double bmi = calc.calc(weight, height);
		System.out.printf(dialog.getBMIResultMessage(),
				bmi);
		System.out.printf(dialog.getMeaningWrappingText(), dialog.getMeaning(bmi));
	}

}
