package com.ContainmentAssignements;

public class MyDate {
	private int date,month,year;
	MyDate()
	{
		
	}
	MyDate(int d,int m,int y)
	{
		this.date=d;
		this.month=m;
		this.year=y;
	}
	public void setDate(int d)
	{
		this.date=d;
 	}
	public int getDate()
	{
		return date;
	}
	public void setMonth(int m)
	{
		this.month=m;
 	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int y)
	{
		this.year=y;
 	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return  "Date Of Joining : "+date+"/"+month+"/"+year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj=new MyDate();
		System.out.println(obj);

	}

}
