package com.techelevator;

public class Airplane {
	
	String planeNumber;
	int bookedFirstClassSeats;
	int availableFirstClassSeats;
	int totalFirstClassSeats;
	int bookedCoachSeats;
	int availableCoachSeats;
	int totalCoachSeats;
	
	Airplane airplane = new Airplane(planeNumber, totalFirstClassSeats, totalCoachSeats);

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		bookedCoachSeats = 0;
		this.totalFirstClassSeats = totalFirstClassSeats;
		bookedCoachSeats = 0;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}



	public String toString() {
		return "Plane Number: " + planeNumber + ", Available First Class Seats: " + availableFirstClassSeats() + ", Available Coach Seats: " + availableCoachSeats();
	}
	
	public int availableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	
	public int availableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public boolean reserveSeats(boolean firstClass, int totalNumberOfSeats) {
		if (firstClass) {
			if (availableFirstClassSeats() >= totalNumberOfSeats) {
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			}
		} else {
			if (availableCoachSeats() >= totalNumberOfSeats) {
				bookedCoachSeats += totalNumberOfSeats;
				return true;
			}
		}
		

		return false;
	}
}
