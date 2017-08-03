package com.app.shopping.pojo;

import org.springframework.stereotype.Component;

@Component
public class AxisShopping {

	private long cardNumber;
	private int atmPin;
	private double amount;
	
	public AxisShopping() {
		super();
	}

	public AxisShopping(long cardNumber, int atmPin, double amount) {
		super();
		this.cardNumber = cardNumber;
		this.atmPin = atmPin;
		this.amount = amount;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + atmPin;
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AxisShopping other = (AxisShopping) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (atmPin != other.atmPin)
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		return true;
	}
	
	
}
