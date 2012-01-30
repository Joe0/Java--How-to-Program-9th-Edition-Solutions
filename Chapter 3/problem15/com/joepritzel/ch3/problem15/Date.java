package com.joepritzel.ch3.problem15;

import com.joepritzel.util.exception.BoundsException;

/**
 * 
 * This is a date class, that uses primitives to hold the day, month, and year.
 * 
 * @author Joe Pritzel
 * 
 */
public class Date {

	private int day, month, year; // The day, month, and year...

	/**
	 * 
	 * A/The constructor to initialize the day, month, and year variables.
	 * 
	 * @param day
	 *            - The day.
	 * @param month
	 *            - The month.
	 * @param year
	 *            - The year.
	 */
	public Date(int month, int day, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	@Override
	public String toString() {
		// The compiler will change this to a StringBuilder, and append the ints
		// and chars
		return month + "/" + day + '/' + year;

		// Ideally, this should be based on the locale, because different
		// countries use different formats, but this assignment is impractical.
	}

	public void displayDate() {
		// this.toString() will be called by the println method.
		System.out.println(this);
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day
	 *            - the day to set
	 */
	public void setDay(int day) {
		// We can't determine if it's a valid day of the month because it would
		// then require months to be set before days, which is weird.
		if (day > 31 || day < 1) {
			throw new BoundsException("Must be between 1 and 31.");
		}
		this.day = day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            - the month to set
	 */
	public void setMonth(int month) {
		if (month > 12 || month < 1) {
			throw new BoundsException("Must be between 1 and 12.");
		}
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            - the year to set
	 */
	public void setYear(int year) {
		// Can't have a negative year...
		if (year < 0) {
			throw new BoundsException("Can not have a negative year.");
		}
		this.year = year;
	}

}
