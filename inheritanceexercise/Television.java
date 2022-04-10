package javabootcamp.oop.inheritanceexercise;

import java.util.Calendar;

public class Television extends HomeAppliance {
	protected float size;
	protected String model;

	// Constructors
	public Television(String manufacturer, int purchaseYear, float size) {
		super(manufacturer, purchaseYear);
		setManufacturer(manufacturer);
		setPurchaseYear(purchaseYear);
		setSize(size);
		setModel("A12");
	}

	public Television(float size) {
		this("Generic", (Calendar.getInstance()).get(Calendar.YEAR), size);
	}

	public Television() {
		this(40);
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		if (size < 2.5f || size > 120f)
			size = 10f;
		this.size = size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {

		if (model.length() < 3) {
			System.out.println("Exception in setModel");
			return;
		}

		char ch = model.charAt(0);
		if (!Character.isLetter(ch))
			model = "A" + model;

		char ch1 = model.charAt(1);
		char ch2 = model.charAt(2);
		if (!Character.isDigit(ch1) || !Character.isDigit(ch2)) {
			model = ch + "00";
		}

		model = model.substring(0, 3);
		this.model = model;
	}

	@Override
	public void display() {
		super.display();
		String msg = "Television Size: " + size + ", model: " + model;
		System.out.println(msg);
	}

	public float sizeInCM() {
		return size * 2.54f;
	}

	public int isBigger(Television other) {
		float diff = this.size - other.size;
		if (diff > 0)
			return 1;
		else if (diff < 0)
			return -1;
		else
			return 0;
	}
}
