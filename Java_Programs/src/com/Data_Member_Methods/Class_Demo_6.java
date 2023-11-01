package com.Data_Member_Methods;
//Electricity Bill
import java.util.*;
public class Class_Demo_6 {
	String name,email,month;
	float unit,total_rs;
	long contact,consumernum;
	
	public void setData(String n,String ema,String mon,long mnum,long cf,float un)
	{
		name=n;
		email=ema;
		month=mon;
		contact=mnum;
		consumernum=cf;
		unit=un;
		
	}
	public void calculateTotal()
	{
		if(unit<=50)
			total_rs=unit*5;
		else if(unit>50&&unit<=100)
			{
			  
			total_rs=(50*5)+((unit-50)*8);
			}
		else if(unit>100&&unit<=150)
		{
			total_rs=(50*5)+(50*8)+((unit-100)*12);
		}
		else if(unit>150&&unit<=200)
		{
			total_rs=(50*5)+(50*8)+(50*12)+((unit-150)*12);
		}
	}
	
	public void display()
	{
		System.out.println("Enter_Name:"+name);
		System.out.println("Enter_E_Mail:"+email);
		System.out.println("Enter_Contact_Number:"+contact);
		System.out.println("Enter_Month:"+month);
		System.out.println("Enter_Consumer_Number:"+consumernum);
		System.out.println("Enter_Consumed_Unit:"+unit);
		System.out.println("Total_Payable_Amount:"+total_rs);
 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Class_Demo_6 obj=new Class_Demo_6();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String na=sc.nextLine();
		System.out.println("Enter E-Mail");
		String e=sc.nextLine();
		System.out.println("Enter Month");
		String mo=sc.nextLine();
		System.out.println("Enter Contact Number");
		long n=sc.nextLong();
		System.out.println("Enter Consumer Number");
		long c=sc.nextLong();
		System.out.println("Enter Consumed Unit");
		float u=sc.nextFloat();
		obj.setData(na, e, mo, n, c, u);
		obj.calculateTotal();
		obj.display();
		
		
		
		

	}

}
