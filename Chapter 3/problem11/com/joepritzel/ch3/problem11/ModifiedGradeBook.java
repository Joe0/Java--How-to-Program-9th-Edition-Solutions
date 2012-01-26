package com.joepritzel.ch3.problem11;

import com.dietel.ch3.gradebook.GradeBook;

public class ModifiedGradeBook extends GradeBook {

	/**
	 * The name of the instructor.
	 */
	private String instructorName;

	public ModifiedGradeBook(String name, String instructor) {
		super(name);
		this.instructorName = instructor;
	}

	/**
	 * @return The instructor's name.
	 */
	public String getInstructorName() {
		return instructorName;
	}

	/**
	 * @param instructorName
	 *            - The name of the instructor.
	 */
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	/**
	 * Print the message specified in the problem.
	 */
	@Override
	public void displayMessage() {
		super.displayMessage();
		System.out.printf("This course if presented by: %s%n", instructorName);
	}

}
