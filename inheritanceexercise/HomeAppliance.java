package javabootcamp.oop.inheritanceexercise;

import java.util.Calendar;

public class HomeAppliance {
	protected String manufacturer;
	protected int purchaseYear;

	// constructors

	HomeAppliance(String manufacturer, int purchaseYear) {
		setManufacturer(manufacturer);
		setPurchaseYear(purchaseYear);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		if (manufacturer != null) {
			this.manufacturer = manufacturer.toUpperCase();
		}
	}

	public int getPurchaseYear() {
		return purchaseYear;
	}

	public void setPurchaseYear(int purchaseYear) {
		int currYear = (Calendar.getInstance()).get(Calendar.YEAR);
		if (purchaseYear > 1900 && purchaseYear <= currYear)
			this.purchaseYear = purchaseYear;
		else
			this.purchaseYear = currYear;
	}

	public void display() {
		String msg = "Manufacturer: " + manufacturer + " Purchase Year: " + purchaseYear;
		System.out.println(msg);
	}
}
