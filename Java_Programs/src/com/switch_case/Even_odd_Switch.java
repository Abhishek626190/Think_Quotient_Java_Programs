package com.switch_case;
import java.util.*;

public class Even_odd_Switch {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	switch(num%2)
	{
	case(0):System.out.println("Even number");
	break;
	default:System.out.println("Odd Number");
	}
	
	

}
}
