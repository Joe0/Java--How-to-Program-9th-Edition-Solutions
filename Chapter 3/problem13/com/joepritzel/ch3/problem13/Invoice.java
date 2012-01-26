package com.joepritzel.ch3.problem13;

import com.joepritzel.util.math.NumberOperations;

/**
 * Bad implementation of an invoice. It should be named something else, or
 * provide a better (more robust, and useful) implementation.
 * 
 * @author Joe Pritzel
 * 
 */
public class Invoice {

	/**
	 * The part number.
	 */
	private String partNumber;

	/**
	 * A description of a part.
	 */
	private String partDescription;

	/**
	 * The number of items.
	 */
	private int quantity;

	/**
	 * The price per item.
	 */
	private double pricePerItem;

	/**
	 * 
	 * @param partNumber
	 *            - The part number.
	 * @param partDescription
	 *            - The description.
	 * @param quantity
	 *            - The quantity.
	 * @param pricePerItem
	 *            - The price per item.
	 */
	public Invoice(String partNumber, String partDescription, int quantity,
			double pricePerItem) {

		// Sets the variables using setters.

		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}

	/**
	 * @return The total amount that the invoice is worth.
	 */
	public double getInvoiceAmount() {
		return getPricePerItem() * getQuantity();
	}

	/**
	 * @return The part number.
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber
	 *            - The part number.
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return The part description.
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * @param partDescription
	 *            - The part description.
	 */
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	/**
	 * @return The quantity.
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity to the supplied value, or 0 if it is negative.
	 * 
	 * @param quantity
	 *            - The quantity.
	 */
	public void setQuantity(int quantity) {
		// If negative set to 0.
		if (NumberOperations.isNegative(quantity)) {
			quantity = 0;
		}
		this.quantity = quantity;
	}

	/**
	 * @return The price per item.
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * Sets the price per item to the supplied values, or 0.0 if it is negative.
	 * 
	 * @param pricePerItem
	 *            - The price per item.
	 */
	public void setPricePerItem(double pricePerItem) {
		// If negative set to 0.
		if (NumberOperations.isNegative(pricePerItem)) {
			pricePerItem = 0.0;
		}
		this.pricePerItem = pricePerItem;
	}

}
