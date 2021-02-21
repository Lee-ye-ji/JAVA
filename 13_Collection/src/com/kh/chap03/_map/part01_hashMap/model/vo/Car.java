package com.kh.chap03._map.part01_hashMap.model.vo;

public class Car {
	private String manufacturer; //������
	private double fuelEfficiency; // ����
	
	public Car(){}

	public Car(String manufacturer, double fuelEfficiency) {
		super();
		this.manufacturer = manufacturer;
		this.fuelEfficiency = fuelEfficiency;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fuelEfficiency);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
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
		Car other = (Car) obj;
		if (Double.doubleToLongBits(fuelEfficiency) != Double.doubleToLongBits(other.fuelEfficiency))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [manufacturer=" + manufacturer + ", fuelEfficiency=" + fuelEfficiency + "]";
	}

	
}
