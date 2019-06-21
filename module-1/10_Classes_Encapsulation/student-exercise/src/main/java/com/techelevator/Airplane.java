package com.techelevator;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

public class Airplane {

	String planeNumber;
	int bookedFirstClassSeats;
	int totalFirstClassSeats;
	int bookedCoachSeats;
	int totalCoachSeats;

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass == true) {
			if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
				return false;
			}
			bookedFirstClassSeats += totalNumberOfSeats;

		} else {
			if (totalNumberOfSeats > getAvailableCoachSeats()) {
				return false;
			}
			bookedCoachSeats += totalNumberOfSeats;
		}
		return true;

	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getAvailableFirstClassSeats() {
		int availableFirstClassSeats = (totalFirstClassSeats - bookedFirstClassSeats);
		return availableFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getAvailableCoachSeats() {
		int availableCoachSeats = (totalCoachSeats - bookedCoachSeats);
		return availableCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

}
