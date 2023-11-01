package com.loop_assignements;

import java.util.*;

public class Milk_Oil {
	static int milk_rs = 40, oil_rs = 50, total_money = 500, money = 0, quantity, milk, oil, milk_q = 0, oil_q = 0;
	Scanner sc = new Scanner(System.in);

	public void sell() {
		for (int i = 1; money <= total_money; i++) {

			System.out.println("Enter quantity of milk in litre");
			milk = sc.nextInt();
 			money = money + (milk * milk_rs);
			milk_q = milk + milk_q;
			
			if (money > 501) {
				System.out.println("Limit Exceed");
				break;
			}
			
				System.out.println("Enter quantity of oil in litre");
				oil = sc.nextInt();
				money = money + (oil * oil_rs);
				oil_q = oil + oil_q;
				if (money >500)
				{
					System.out.println("Limit Exceed");
					break;
				}
			
			if (money == total_money)
				break;

		}
	}

	public void display() {

		{
			System.out.println("Quantity of milk is :" + milk_q + "");
			System.out.println("Quantity of oil is :" + oil_q + "");
	    	System.out.println("The Total Amount You Have To Pay is Rs:" + money + "");
			System.out.println("Please Pay First:👍👍");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Milk_Oil obj = new Milk_Oil();
		obj.sell();
		obj.display();

	}

}
