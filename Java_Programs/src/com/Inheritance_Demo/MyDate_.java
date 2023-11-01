package com.Inheritance_Demo;

public class MyDate_ {

	private int date, month, year;

	MyDate_() {

	}

	MyDate_(int d, int m, int y) {
		this.date = d;
		this.month = m;
		this.year = y;
	}

	public void setDate(int d) {
		this.date = d;
	}

	public int getDate() {
		return date;
	}

	public void setMonth(int m) {
		this.month = m;
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int y) {
		this.year = y;
	}

	public int getYear() {
		return year;
	}
//	public boolean compareDate(MyDate_ d) {
//
//		if (this.date == d.date && this.month == d.month && this.year == d.year) {
//			return true;
//		}
//		return false;
//	}

	public String toString() {
		return "Date Of Joining : " + date + "/" + month + "/" + year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate_ obj = new MyDate_(11, 10, 2023);
		System.out.println(obj);
		// System.out.println(obj.getDate());
		// obj.compareDate(new MyDate(15,12,2023));
		// System.out.println(obj.compareDate(new MyDate(11,10,2023)));

	}

}
