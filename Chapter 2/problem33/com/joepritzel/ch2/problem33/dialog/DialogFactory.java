package com.joepritzel.ch2.problem33.dialog;

import java.util.Locale;

/**
 * Used to create Dialogs.
 * 
 * @author Joe Pritzel
 * 
 */
public class DialogFactory {

	/**
	 * Creates a Dialog based on the default Locale.
	 * 
	 * @return A Dialog for the current Locale.
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Dialog createDialog() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		String className = getClassName(Locale.getDefault().getCountry());
		return Class.forName(className).asSubclass(Dialog.class).newInstance();
	}

	/**
	 * Based on the country string it returns a String for the class to use.
	 * 
	 * @param locale
	 */
	private static String getClassName(String locale) {
		switch (locale) {
		case "UK":
			return "com.joepritzel.ch2.problem33.dialog.OtherEnglish";
		case "US":
			return "com.joepritzel.ch2.problem33.dialog.US";
		default:
			return "com.joepritzel.ch2.problem33.dialog.OtherEnglish";
		}
	}
}
