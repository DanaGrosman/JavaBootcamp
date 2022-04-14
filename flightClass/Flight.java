package javabootcamp.uml.flightClass;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
	protected final int MAX_FREQUENT_FLYER = 200;
	protected static int flightNumber = 0;
	protected LocalTime departureTime;
	protected LocalDate departureDate;
	protected LocalTime actualDefatureTime;
	protected int duration;
	protected int delay;
	protected FrequentFlyer frequentFlyerArr[];
	protected int miles;

	public Flight(LocalTime departureTime, LocalDate departureDate, int duration, int miles) {
		flightNumber++;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
		this.actualDefatureTime = this.departureTime;
		this.duration = duration;
		this.miles = miles;
		delay = 0;
		frequentFlyerArr = new FrequentFlyer[MAX_FREQUENT_FLYER];
	}

	public void delayFlight(int delay) {
		this.delay += delay;
	}

	public LocalTime getArrivalTime() {
		return departureTime.plusMinutes(duration + delay);
	}

	public int getMiles() {
		return miles;
	}
}
