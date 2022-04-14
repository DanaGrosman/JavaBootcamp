package javabootcamp.uml.flightClass;

public class MileageCredit {
	protected int accumulatedMiles;
	protected Flight flights[] = new Flight[100];
	protected int counterFlights;
	
	public MileageCredit() {
		accumulatedMiles = 0;
		counterFlights = 0;
	}

	public void addFlight(Flight flight) {
		flights[counterFlights] = flight;
		counterFlights++;
		updateAccumulatedMiles(flight.getMiles());
	}
	
	public void updateAccumulatedMiles(int miles) {
		accumulatedMiles += miles;
	}
}
