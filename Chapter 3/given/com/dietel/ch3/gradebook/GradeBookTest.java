package com.dietel.ch3.gradebook;

// Figure 3.11: GradeBookTest.java
// ...  See page 87

// Slightly modified by Joe Pritzel
public class GradeBookTest {
	public static void main(String[] args) {
		GradeBook g1 = new GradeBook("CS101 Intro to Java Programming");
		GradeBook g2 = new GradeBook("CS102 Data Structures in Java");
		
		System.out.printf("GradeBook 1: courseName = %s%n", g1.getCourseName());
		System.out.printf("GradeBook 2: courseName = %s%n", g2.getCourseName());
	}
}
