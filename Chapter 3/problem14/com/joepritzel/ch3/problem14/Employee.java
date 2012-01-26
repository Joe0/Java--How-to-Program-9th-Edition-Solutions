package com.joepritzel.ch3.problem14;

import com.joepritzel.util.math.NumberOperations;

public class Employee {

	/**
	 * The employee's first name.
	 */
	private String firstName;

	/**
	 * The employee's last name.
	 */
	private String lastName;

	/**
	 * The employee's monthly salary.
	 */
	private double monthlySalary;

	/**
	 * @param firstName
	 *            - The employee's first name.
	 * @param lastName
	 *            - The employee's last name.
	 * @param monthlySalary
	 *            - The employee's monthly salary.
	 */
	public Employee(String firstName, String lastName, double monthlySalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setMonthlySalary(monthlySalary);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            - the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            - the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * If the salary is not positive, it will not be set.
	 * 
	 * @param monthlySalary
	 *            - the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		// Do not set it if monthlySalary is not positive.
		if (!NumberOperations.isPositive(monthlySalary)) {
			return;
		}
		this.monthlySalary = monthlySalary;
	}

}
