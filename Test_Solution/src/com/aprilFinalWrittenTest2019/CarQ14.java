package com.aprilFinalWrittenTest2019;

import java.util.Objects;

public class CarQ14 {
	private int carNo;
	private String carColor;
	public CarQ14() {
		// TODO Auto-generated constructor stub
	}
	
	public CarQ14(int carNo, String carColor) {
		super();
		this.carNo = carNo;
		this.carColor = carColor;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String toString() {
		return "CarQ14 [carNo=" + carNo + ", carColor=" + carColor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carColor, carNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarQ14 other = (CarQ14) obj;
		return Objects.equals(carColor, other.carColor) && carNo == other.carNo;
	}




}
