package com.oops;
//Sum of two objects
public class Date_Sum {
 private int dd,mm,yy;
 public void sum(int d,int m,int y)
 {
	 this.dd=d;
	 this.mm=m;
	 this.yy=y;
 }
 public void add( Date_Sum obj1)
 {
	int re= this.dd+obj1.dd;
	System.out.println(re);
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date_Sum obj1=new Date_Sum();
		Date_Sum obj2=new Date_Sum();
		obj1.sum(17, 10, 2023);
		obj2.sum(18, 10, 2023);
		obj2.add(obj1);
		

	}

}
