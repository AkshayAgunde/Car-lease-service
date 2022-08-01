package com.neoquant.car.entity;

import lombok.ToString;

@ToString
public class LeaseRateParameters {
	private long mileage;
	private int duration;
	private float interestRate;
	private double nettPrice;
	private long carId;
	
	public LeaseRateParameters(long mileage, int duration, float interestRate, double nettPrice, long carId) {
		super();
		this.mileage = mileage;
		this.duration = duration;
		this.interestRate = interestRate;
		this.nettPrice = nettPrice;
		this.carId = carId;
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public long getMileage() {
		return mileage;
	}
	public void setMileage(long mileage) {
		this.mileage = mileage;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public double getNettPrice() {
		return nettPrice;
	}
	public void setNettPrice(double nettPrice) {
		this.nettPrice = nettPrice;
	}
	
}
