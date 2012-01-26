package com.dietel.ch3.account;

// See page 89 for exact implementation with comments.
public class Account {
	private double balance;

	public Account(double initialBalance) {

		// Note, USE CURLY BRACES -- See Java conventions.
		if (initialBalance > 0.0) {
			balance = initialBalance;
		}
	}

	public void credit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}
}
