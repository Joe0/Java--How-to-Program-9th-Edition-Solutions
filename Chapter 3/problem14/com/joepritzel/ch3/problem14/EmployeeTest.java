package com.joepritzel.ch3.problem14;

import java.text.DecimalFormat;

/**
 * Test for the Employee class.
 * 
 * @author Joe Pritzel
 * 
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// Create two Employees
		Employee e1 = new Employee("Bob", "Smith", 120000.3);
		Employee e2 = new Employee("John", "Smith", 10000.00);

		printEmployees(e1, e2); // See method's comments.

		// Give 10% raise by multiplying their current salary by 1.1
		// This works out to be the same as applying their raise to their yearly
		// salary, obviously.
		e1.setMonthlySalary(e1.getMonthlySalary() * 1.1);
		e2.setMonthlySalary(e2.getMonthlySalary() * 1.1);

		printEmployees(e1, e2); // See method's comments.
	}

	/**
	 * Prints the data required by the problem for each of the given employees.
	 * 
	 * @param ea
	 *            - A list of employees.
	 */
	private static void printEmployees(Employee... ea) {
		for (Employee e : ea) {
			// Converts monthly salary to yearly, then passes it to the
			// printData method.
			printData(e, convertToYearly(e.getMonthlySalary()));
		}
	}

	/**
	 * Convert a monthly salary to yearly salary.
	 * 
	 * @param monthlySalary
	 *            - The monthly salary.
	 * @return The yearly salary.
	 */
	private static double convertToYearly(double monthlySalary) {
		return monthlySalary * 12;
	}

	/**
	 * Prints the first name, last name, and yearly salary (out to two decimal
	 * places with thousands separators).<br>
	 * It also accounts for the user's locale.
	 * 
	 * @param e
	 *            - The Employee.
	 * @param yearlySalary
	 *            - The yearly salary.
	 */
	private static void printData(Employee e, double yearlySalary) {
		DecimalFormat fd = new DecimalFormat("$###,###.00");
		System.out.printf("%s %s's yearly salary is %s%n", e.getFirstName(),
				e.getLastName(), fd.format(yearlySalary));
	}

}
