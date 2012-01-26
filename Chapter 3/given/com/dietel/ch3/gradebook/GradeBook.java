package com.dietel.ch3.gradebook;

// Fig. 3.10: GradeBook.java
// GradeBook class with a constructor to initialize the course name.

// Slightly modified by Joe Pritzel
public class GradeBook {

	private String courseName; // course name for this GradeBook

	// constructor initializes courseName with String argument
	public GradeBook(String name) {
		courseName = name;
	}

	// method to retrieve the course name
	public String getCourseName() {
		return courseName;
	}

	// method to set the course name
	public void setCourseName(String courseName) {
		this.courseName = courseName; // store the course name
	}

	// display a welcome message to the GradeBook user.
	public void displayMessage() {
		// \n IS NOT PLATFORM INDEPENDANT!
		// Use %n instead.
		System.out.printf("Welcome to the grade book for %n%s!%n",
				getCourseName());
	}
}
