package javabootcamp.oop.basic;

public class Clock {
	int timeInMinutes;

	public Clock() {
		timeInMinutes = 396;
	}
	
	public Clock(int time) {
		timeInMinutes = time;
	}

	public Clock(int hours, int minutes) {
		timeInMinutes = minutes;
		timeInMinutes += 60*hours;
	}

	public void printTime() {
		int hours = timeInMinutes / 60;
		int minutes = timeInMinutes % 60;
		System.out.printf("%02d:%02d", hours, minutes);
	}
}
