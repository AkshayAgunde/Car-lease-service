package com.neoquant.car.entity;

import lombok.ToString;

@ToString
public class Car {
	private long id;
	private String make;
	private String model;
	private String version;
	private String co2emmision;
	private double grossPrice;
	private double netPrice;
	private String leaseRate;
	
	public Car(long id, String make, String model, String version, String co2emmision, double grossPrice,
			double netPrice, String leaseRate) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.version = version;
		this.co2emmision = co2emmision;
		this.grossPrice = grossPrice;
		this.netPrice = netPrice;
		this.leaseRate = leaseRate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCo2emmision() {
		return co2emmision;
	}
	public void setCo2emmision(String co2emmision) {
		this.co2emmision = co2emmision;
	}
	public double getGrossPrice() {
		return grossPrice;
	}
	public void setGrossPrice(double grossPrice) {
		this.grossPrice = grossPrice;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public String getLeaseRate() {
		return leaseRate;
	}
	public void setLeaseRate(String leaseRate) {
		this.leaseRate = leaseRate;
	}
	
}
