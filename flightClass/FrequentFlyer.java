package javabootcamp.uml.flightClass;

public class FrequentFlyer {
	protected static int frequentFlyerNumber = 0;
	protected String firstName;
	protected String lastName;
	protected MileageCredit mileageCredit;

	public FrequentFlyer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		frequentFlyerNumber++;
		mileageCredit = new MileageCredit();
	}
}
