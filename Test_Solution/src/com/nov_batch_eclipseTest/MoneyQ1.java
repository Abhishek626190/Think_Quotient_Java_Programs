package com.nov_batch_eclipseTest;

/*
 * Q1.Find how many 2000, 500, 100, 50 notes will be required
 *  to make specified amount. Amount should be multiple of 50.
 *   E.g. To make amount 2,550 it required 1 note of 2000,
 *  one note of 500 and 1 of rupees 50.
 */
import java.util.Scanner;

public class MoneyQ1 {
	public void notes(int amt) {
		while (amt > 0) {

			if (amt / 2000 >= 1) {
				int a;
				a = amt / 2000;
				amt = amt % 2000;
				System.out.println(a + "Notes Of 2000");
			} else if (amt / 500 >= 1) {
				int a = amt / 500;
				amt = amt % 500;
				System.out.println(a + "Notes Of 500");
			} else if (amt / 100 >= 1) {
				int a = amt / 100;
				amt = amt % 100;
				System.out.println(a + "Notes Of 100");
			} else if (amt / 50 >= 1) {
				int a = amt / 50;
				amt = amt % 50;
				System.out.println(a + "Notes Of 50");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MoneyQ1 obj = new MoneyQ1();
		while (true) {
			System.out.println("Enter amount which is divisible by 50");
			int amt = sc.nextInt();
			if (amt % 50 == 0) {
				obj.notes(amt);

			} else {
				System.out.println("Invalid Amount Please Enter Amount Which divisble by 50");
			}
			System.out.println("Press Y to exit to continue press any key");
			char ch = sc.next().charAt(0);
			if (ch == Character.toLowerCase(ch)) {
				break;
			} else
				continue;
		}

	}

}
