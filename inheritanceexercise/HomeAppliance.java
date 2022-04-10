package javabootcamp.oop.inheritanceexercise;

import java.util.Calendar;

public class HomeAppliance {

	protected String manufacturer;
	protected int purchaseYear;

	public String getManufacturer() {
		return manufacturer;
	}

	private void setManufacturer(String manufacturer) {
		if (manufacturer != null)
			this.manufacturer = manufacturer.toUpperCase();
	}

	public int getPurchaseYear() {
		return purchaseYear;
	}

	public void setPurchaseYear(int purchaseYear) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if (purchaseYear >= 1990 && purchaseYear <= currentYear)
			this.purchaseYear = purchaseYear;
		else
			this.purchaseYear = currentYear;
	}

	public void display() {
		System.out.println("Manufacturer: " + this.manufacturer + ", Purchase Year: " + this.purchaseYear);
	}
}
