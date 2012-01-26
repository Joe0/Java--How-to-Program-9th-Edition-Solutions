package com.joepritzel.ch3.problem12;

import com.dietel.ch3.account.Account;

/**
 * This is a modified version of Account.
 * 
 * @author Joe Pritzel
 * 
 */
public class ModifiedAccount extends Account {

	/**
	 * Must implement the constructor of account.
	 * 
	 * @param initialBalance
	 *            - The initial balance.
	 */
	public ModifiedAccount(double initialBalance) {
		super(initialBalance);
	}

	/**
	 * Makes a withdrawal for the given amount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 * @throws Exception
	 *             - This really should throw an exception if the amount exceeds
	 *             the balance, but it won't because this assignment is to
	 *             create a completely impractical implementation.
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > getBalance()) {
			// This should really throw an exception to alert the caller of the
			// error, so it can be handled properly (maybe allow and charge fee,
			// deny, etc.).
			// This would also allow the transaction to work properly.
			// throw new Exception("Withdraw amount exceeds balance.");

			System.out.println("Debit amount exceeded account balance.");

			// Exit method to stop the actual subtraction of the balance from
			// occuring.
			return;
		}

		// Crediting a negative amount is the same as withdrawing.
		// This needs to be done because balance is private, I don't feel
		// like using reflection, and this is much simpler.
		this.credit(-amount);
	}

}
