package com.Print_Numbers;

//40. Write a program to print All Strong numbers 1 to 100000
import java.util.Scanner;

public class Perfect_number_1to1000 {
	static int num, sum;

	public void check() {

		for (int i = 1; i <= 10000; i++) {
			sum = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					if (sum < i)
						sum = sum + j;
				}

			}
			if (sum == i)
				System.out.println(sum);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Perfect_number_1to1000 obj = new Perfect_number_1to1000();
		obj.check();

	}

}
