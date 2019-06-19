package com.techelevator;

public class Television {

	private boolean isOn;
	private int currentChannel = 3;
	private int currentVolume = 2;

	public boolean isOn() {
		return isOn;
	}
	
	public boolean isOff() {
		return isOn = false;
	}
	
	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	
	
	
	public void turnOff() {
		isOn = false;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
	public void changeChannel(int newChannel) {
		boolean isOff;
		if (isOff = true && newChannel > 3 && newChannel < 18) {
			currentChannel = newChannel;
		}
	}


	public void channelUp() {
		if (isOn = true) {
			if (currentChannel == 18) {
				currentChannel = 3;
			} else {
				currentChannel++;
			}
		}
	}

	public void channelDown() {
		isOn = true;
		if (isOn = true) {
			if (currentChannel == 3) {
				currentChannel = 18;
			} else { currentChannel--;
				
			}
		}
	}

	public void raiseVolume() {
		isOn = true;
		if (currentVolume < 10) {
			currentVolume++;
		} else {
			return;
		}
	}

	public void lowerVolume() {
		if (isOn = true && currentVolume > 0) {
			currentVolume--;
		}
	}

}
