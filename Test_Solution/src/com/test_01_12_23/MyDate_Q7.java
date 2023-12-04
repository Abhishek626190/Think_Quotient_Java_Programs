package com.test_01_12_23;

public class MyDate_Q7 {
	private int dd,mm,yy;

	public MyDate_Q7(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "MyDate_Q7 [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

 	public int compareTo(MyDate_Q7 m2) {
		// TODO Auto-generated method stub
 		Integer d1=this.dd;
 		Integer d2=m2.dd;
 		Integer m=this.mm;
 		Integer m1=m2.mm;
 		Integer y1=this.yy;
 		Integer y2=m2.yy;

 		if(this.yy==m2.getYy())
			if(this.mm==m2.getMm())
				return d1.compareTo(d2);
			else
				return m.compareTo(m1);
		else
			return y1.compareTo(y2);
	}

}
