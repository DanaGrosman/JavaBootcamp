package javabootcamp.oop.lights;

public class Runner {

	public static void main(String[] args) {
		Light light1 = new Light();
		Light light2 = new Light(5, false);
		light1.printLight();
		light2.printLight();

		light1.turnOff();
		light2.setNumOfBults(10);
		light1.printLight();
		light2.printLight();
		
		light1.turnOn();
		light2.turnOn();
		light1.turnOff();
		light2.turnOff();
	}

}
