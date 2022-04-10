package javabootcamp.oop.lights;

public class Light {
	private int numOfBults;
	private boolean isOn;

	public Light() {
		this(3, true);
	}

	public Light(int numOfBults, boolean isOn) {
		this.numOfBults = numOfBults;
		this.isOn = isOn;
	}

	public int getNumOfBults() {
		return numOfBults;
	}

	public void setNumOfBults(int numOfBults) {
		if (numOfBults >= 0 && numOfBults <= 50)
			this.numOfBults = numOfBults;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public void setIsOn(boolean onOrOff) {
		this.isOn = onOrOff;
	}

	public void turnOn() {
		setIsOn(true);
	}

	public void turnOff() {
		setIsOn(false);
	}

	public void printLight() {
		String status = isOn ? "ON" : "OFF";
		System.out.printf("lightBults: %d, isOn: %s \n", numOfBults, status);
	}

}
