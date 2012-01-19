package com.joepritzel.ch2.problem34;

import java.io.IOException;
import java.net.URL;

import com.joepritzel.util.input.Console;
import com.joepritzel.util.web.Visit;

/**
 * 
 * Calculates the world population for the next five years given the growth
 * rate.
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
		double currentGrowthRate;
		try {
			currentGrowthRate = Console
					.getDouble("What is the current population's growth rate? ");
		} catch (Exception e) {
			System.out.println("Error with input!");
			return;
		}

		long pop;
		try {
			String raw = Visit.getRaw(new URL(
					"http://www.google.com/search?q=current+world+population"),
					"Mozilla/5.0 Section 34");
			// Gets the first value provided by Google's public data
			pop = Long.parseLong(raw.split("<div class=\"st\">")[1].substring(
					29, 29 + 13).replace(",", ""));
		} catch (IOException e) {
			pop = Console.getLong("What is the current world population? ");
		}

		for (int i = 1; i <= 5; i++) {
			pop *= currentGrowthRate;
			System.out.printf("The population after %d years will be %d.%n", i,
					pop);
		}
	}
}
