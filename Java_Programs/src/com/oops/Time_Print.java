package com.oops;

public class Time_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date_Print obj=new Date_Print();
			obj.setData(16,10,2023);
			obj.display();
			obj.dd=10;
			obj.yy=2023;
			obj.mm=10;
			obj.setData(obj.dd,obj.mm,obj.yy );
			obj.display();
			
	}

}
