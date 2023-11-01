package com.oops;

public class Return_Object {
	private int dd, mm, yy;

	Return_Object(int d, int m, int y) {
		this.dd = d;
		this.mm = m;
		this.yy = y;
	}

	public void setD(int d) {
		this.dd = d;
	}

	public void setM(int d) {
		this.mm = d;
	}

	public void setY(int d) {
		this.yy = d;
	}

	public int getD() {
		return dd;
	}

	public int getM() {
		return mm;
	}

	public int getY() {
		return yy;
	}

	public Return_Object getObject() {
//		this.dd=20;
//		this.mm=10;
//		this.yy=2023;
//		return  this;
		return new Return_Object(12, 10, 2023);
	}

	public void display() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_Object obj = new Return_Object(18, 10, 2023);
		obj.setD(18);
		obj.setM(10);
		obj.setY(2023);
		obj.getD();
		obj.getM();
		obj.getY();
		obj.display();
		Return_Object obj1 = obj.getObject();
		// System.out.println(obj1);
		obj1.display();
		obj.display();

	}

}
