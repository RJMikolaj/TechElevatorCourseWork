package com.techelevator.calculator;

public class Calculator {

	public int result;
	public int x;
	public int y;
	
	public int add(int addend) {
		return (addend + result);
	}
	
	public int addend;
	
	public int getResult() {
		return result;
	}
	
	public int multiply(int multiplyer) {
		return (result * multiplyer);
	}
	
	public int power(int exponent) {
		return (result * exponent);
	}
	
	public void reset() {
		this.result = 0;
	}
	
	public int subtract(int subtrahend) {
		return (result - subtrahend);
	}
	
	
	
	
	
	
	
}
