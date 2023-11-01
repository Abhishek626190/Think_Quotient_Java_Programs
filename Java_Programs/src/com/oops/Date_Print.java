package com.oops;

public class Date_Print {
	int dd,yy;
	long mm;
	public void setData(int d,long m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display()
	{
		System.out.println("The date is:"+dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date_Print obj;
//		obj=new Date_Print();
		Date_Print obj=new Date_Print();
		//obj.setData(0, 0, 0);
		obj.display();
		obj.setData(16,10,2023);
		obj.display();
		obj.dd=12;
		obj.yy=12;
		obj.mm=10;
		//obj.setData(obj.dd=12,obj.mm=08L,obj.yy=2023);
		long month=07l;
		obj.display();
		
		

	}

}
