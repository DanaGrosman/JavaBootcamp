package javabootcamp.oop.inheritanceexercise;

public class Television extends HomeAppliance {
	protected float size;
	protected String model;

	private float getSize() {
		return size;
	}

	private String getModel() {
		return model;
	}

	public void setSize(float size) {
		if (size < 2.5f || size > 120f)
			size = 10f;
		this.size = size;
	}

	public void setModel(String model) {
		if (model.length() < 3) {
			System.out.println("Execption in setMoedl");
			return;
		}

		char ch = model.charAt(0);
		if (Character.isDigit(ch))
			model = "A" + model;

		char ch1 = model.charAt(1);
		char ch2 = model.charAt(2);
		if (!Character.isDigit(ch1) || !Character.isDigit(ch2)) {
			model += "00";
		}
		this.model = model.substring(0, 3);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Televesion Size: " + size + ", model: " + model);
	}
}
