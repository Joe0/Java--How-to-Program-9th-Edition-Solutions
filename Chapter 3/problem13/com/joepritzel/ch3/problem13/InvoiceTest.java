package com.joepritzel.ch3.problem13;

// Statically import the assertE method because it's a pain to write out Assertions.assertE.
import static com.joepritzel.util.test.Assertions.assertE;

/**
 * Tests the Invoice class.
 * 
 * @author Joe Pritzel
 * 
 */
public class InvoiceTest {

	public static void main(String[] args) {
		final String partNumber = "ABX1";
		final String partDescription = "Nothing";
		int quantity = 1;
		double pricePerItem = 1.0;

		// Instance
		Invoice i = new Invoice(partNumber, partDescription, quantity,
				pricePerItem);

		// Test constructor (which uses setters) / getters.
		assertE(i.getPartNumber().equals(partNumber), "Successfully set partNumber.");
		assertE(i.getPartDescription().equals(partDescription), "Successfully set partDesription.");
		assertE(i.getQuantity() == quantity, "Successfully set quantity.");
		assertE(i.getPricePerItem() == pricePerItem, "Successfully set pricePerItem.");

		// Test functionality.
		assertE(i.getInvoiceAmount() == quantity * pricePerItem, "Successfully calculated the proper invoice amount.");

		// Test bounds checking/setters.

		// Test quantity
		i.setQuantity(-1);
		assertE(i.getQuantity() == 0, "Successfully accounts for bounds of quantity in setter.");
		assertE(i.getInvoiceAmount() == 0.0, "Successfully accounts for quantity in invoice amount calculations.");

		// Revert quantity to previous value.
		i.setQuantity(quantity);

		// Test pricePerItem
		i.setPricePerItem(-1.0);
		assertE(i.getPricePerItem() == 0.0, "Successfully accounts for bounds of pricePerItem in setter.");
		assertE(i.getInvoiceAmount() == 0.0, "Successfully accounts for pricePerItem in invoice amount calculations.");

		// Revert quantity to previous value.
		i.setPricePerItem(pricePerItem);

	}

}
