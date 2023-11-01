package com.Data_Member_Methods;

import java.util.Scanner;
  
public class Increasing_Digit {

 		public boolean check(int num) {
			int rem1 = num % 10;// 3
			boolean flag = true;
			while (num > 0) {
				int rem2 = num % 10;
				if (rem2 > rem1) {
					flag = false;
				}
				rem1 = rem2;
				num = num / 10;
			}

			return flag;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Increasing_Digit obj = new Increasing_Digit();
		boolean flag1 = obj.check(num);
		if (flag1)
			System.out.println("Increasing Number");
		else
			System.out.println("Not Increasing number");

		

	}

}
