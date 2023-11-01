package com.loop_assignements;

import java.util.Scanner;

public class Barrel_Price {
	static int piece, barrel_cost = 89, num, pay;

	public void setPrice() {
		for (int i = 1; i <= 20; i++) {
			if (i <= 10) {
				System.out.println("The price of " + i + "  barrel is: " + i * barrel_cost);
			} else if (i >= 11 && i <= 20) {
				System.out.println("The price of " + i + " barrel is: " + i * (barrel_cost - i));

			}
		}
	}

	public void sell_barrel() {
		if (num <= 10) {

			System.out.println("The price of " + num + "  barrel is: " + num * barrel_cost+"\n");
			System.out.println("You have to pay Rs:" +num * barrel_cost +"\n\nPlease Pay First:👍👍");

		}

		else if (num > 10) {
			System.out.println("The price of " + num + "  barrel is: " + num * (barrel_cost - num)+"\n");
			System.out.println("You have to pay Rs:" +num * (barrel_cost - num)+"\n\nPlease Pay First:👍👍");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Barrel_Price obj = new Barrel_Price();
		obj.setPrice();
		System.out.println("Enter number of barrel you want to buy");
		num = sc.nextInt();
		obj.sell_barrel();

	}

}
