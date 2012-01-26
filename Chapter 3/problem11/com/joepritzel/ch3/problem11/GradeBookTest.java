package com.joepritzel.ch3.problem11;

/**
 * This is a test for the ModifiedGradeBook class.
 * 
 * @author Joe Pritzel
 * 
 */
public class GradeBookTest {
	public static void main(String[] args) {
		// Instance 1
		ModifiedGradeBook g1 = new ModifiedGradeBook(
				"CS101 Intro to Java Programming", "Dr. Fake");
		
		// Instance 2
		ModifiedGradeBook g2 = new ModifiedGradeBook(
				"CS102 Data Structures in Java", "Dr. Not Real");

		// Test instance 1
		System.out.println("GradeBook 1:");
		g1.displayMessage();

		// Make distinction between instances by adding an empty line.
		System.out.println();

		// Test instance 2
		System.out.println("GradeBook 2:");
		g2.displayMessage();
	}
}