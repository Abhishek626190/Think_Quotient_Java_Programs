package com.do_while_loop;

import java.util.Scanner;

public class Frequency_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count;
		int temp;
		for (int i = 0; i <= 9; i++) {
			count = 0;
			temp = num;
			while (temp > 0) {
				int rem = temp % 10;
				if (rem == i)
					count++;
				temp = temp / 10;
			}
			if (count > 0)
				System.out.println(i + ":" + count);
		}

	}

}
