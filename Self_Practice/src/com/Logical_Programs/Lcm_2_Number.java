package com.Logical_Programs;

import java.util.Scanner;

public class Lcm_2_Number {
	public void findLcm(int a, int b) {
		 int lcm;
		 if(a>b)
			 lcm=a;
		 else 
			 lcm=b;
		 for(int i=1;;i++)
		 {
			 if(lcm%a==0&&lcm%b==0)
			 {
				 System.out.println("LCM of "+a+" and "+b+" is "+lcm);
				 break;
			 }
			 lcm++;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers to find lcm");
		System.out.println("Enter First number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		Lcm_2_Number obj = new Lcm_2_Number();
		obj.findLcm(num1, num2);

	}

}
