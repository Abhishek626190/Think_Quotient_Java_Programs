package com.switch_case;
import java.util.*;

public class Number_of_days_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month to know days:\nPlease Enter Month in camel case example:January");
		String month=sc.nextLine();
		switch(month)
		{
		case"January":System.out.println("31 Days in month:"+month);break;
		case"February":System.out.println("28/29 Days in month:"+month);break;
		case"March":System.out.println("31 Days in month:"+month);break;
		case"April":System.out.println("30 Days in month:"+month);break;
		case"May":System.out.println("31 Days in month:"+month);break;
		case"June":System.out.println("30 Days in month:"+month);break;
		case"July":System.out.println("31 Days in month:"+month);break;
		case"August":System.out.println("31 Days in month:"+month);break;
		case"September":System.out.println("30 Days in month:"+month);break;
		case"October":System.out.println("31 Days in month:"+month);break;
		case"November":System.out.println("30 Days in month:"+month);break;
		case"December":System.out.println("31 Days in month:"+month);break;
		default:System.out.println("Invalid Input");

		}

	}

}
