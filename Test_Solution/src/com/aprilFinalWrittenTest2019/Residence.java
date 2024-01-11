package com.aprilFinalWrittenTest2019;

public class Residence {
	private int vAddressId ;
	private String pincode,surveyNo, building, area, city, state;

	public Residence(int vAddressId, String pincode, String surveyNo, String building, String area, String city,
			String state) {
		super();
		this.vAddressId = vAddressId;
		this.pincode = pincode;
		this.surveyNo = surveyNo;
		this.building = building;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	public int getvAddressId() {
		return vAddressId;
	}

	public void setvAddressId(int vAddressId) {
		this.vAddressId = vAddressId;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getSurveyNo() {
		return surveyNo;
	}

	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Residence [vAddressId=" + vAddressId + ", pincode=" + pincode + ", surveyNo=" + surveyNo + ", building="
				+ building + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}

}
