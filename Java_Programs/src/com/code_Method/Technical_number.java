package com.code_Method;

import java.util.*;

public class Technical_number {
	public void check(int num) {
		int org_num = num;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		int power = 1;
		for (int i = 1; i <= count / 2; i++)
			power = power * 10;
		if (count % 2 == 0) {
			int num1 = org_num / power;
			int num2 = org_num % power;
			int sum1 = num1 + num2;
			int square = sum1 * sum1;
			if (square == org_num)
				System.out.println(org_num + ":Is Technical Number");
			else
				System.out.println(org_num + ":Is Not Technical Number");
		}

		else
			System.out.println(org_num + ":Is Not Technical Number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Please Enter number ");
		int num = obj.nextInt();
		Technical_number sc = new Technical_number();
		sc.check(num);
	}

}
