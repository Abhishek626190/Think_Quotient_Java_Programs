package com.oops;

public class MyDate {
	private int dd, mm, yy;

	public void setDd(int d)
	{
		dd=d;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public MyDate getObject()
	{
		return new MyDate() ;
	}
	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj=new MyDate();
		obj.setDd(12);
		obj.setMm(10);
		obj.setYy(2023);
		obj.getDd();
		obj.getMm();
		obj.getYy();
		System.out.println(obj.getDd());
		System.out.println(obj.dd);
		System.out.println();
		obj.display();

	}

}
