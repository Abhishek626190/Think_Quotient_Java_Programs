package com.nov_batch_eclipseTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Q2. Write a code for below case study:
 6 Friends went for dinner and contributed some amount to pay Hotel
   bill of Rs.4500.  Some friends contributed less or some 
   contributed more amount than the individual’s actual contribution
   Accept contribution and name of each in code.  Store this 
   information in a HashMap. 
   Create another map which contains details of amount for each 
   friend that he should get or he should pay more to somebody 
   from group so that they will pay exact contribution for dinner.
    If they have paid excess their amount will be negative else
     positive.
 */
public class DinnerQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Bill in RS without decimal");
		int amt = sc.nextInt();
		int ctbn = amt / 6;
		System.out.println("You All 6 have to pay " + ctbn + " per person");
		HashMap<String, Integer> map = new HashMap<>();
		int i = 1;
		while (i <= 6) {
			System.out.println("Enter Your Name:");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Enter Your Contribution Amount");
			int rs = sc.nextInt();
			map.put(name, rs);
			amt = amt - rs;
			System.out.println(amt + " Rs: Left");
			i++;
		}
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		HashMap<String, Integer> newMap = new HashMap<>();
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			String n = e.getKey();
			int a = e.getValue();
			if (a < ctbn) {
				a = ctbn - a;
				newMap.put(n, a);
			} else if (a >= ctbn) {
				a = ctbn - a;
				newMap.put(n, a);
			}

		}
		System.out.println(newMap);

	}

}
