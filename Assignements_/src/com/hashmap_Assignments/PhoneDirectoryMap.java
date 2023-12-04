package com.hashmap_Assignments;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneDirectoryMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> numlist1 = new ArrayList<>();
		numlist1.add(6261904221l);
		numlist1.add(7509302866l);
		numlist1.add(911776424l);

		ArrayList<Long> numlist2 = new ArrayList<>();
		numlist2.add(9340103588l);
		numlist2.add(9479830377l);
		numlist2.add(6261778598l);

		ArrayList<Long> numlist3 = new ArrayList<>();
		numlist3.add(8852574986l);
		numlist3.add(6266456587l);
		numlist3.add(9698979592l);

		ArrayList<Long> numlist4 = new ArrayList<>();
		numlist4.add(6261904221l);
		numlist4.add(9497989210l);
		numlist4.add(6162656745l);

		HashMap<String, ArrayList<Long>> pdmap = new HashMap<>();
		pdmap.put("Abhi", numlist1);
		pdmap.put("Dhaani", numlist2);
		pdmap.put("Ragini", numlist3);
		pdmap.put("Sejal", numlist4);

		System.out.println("Your Phone Directory ....");
		Set<Entry<String, ArrayList<Long>>> pdset = pdmap.entrySet();
		Iterator<Entry<String, ArrayList<Long>>> pditr = pdset.iterator();
		while (pditr.hasNext()) {
			Entry<String, ArrayList<Long>> e = pditr.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		while (true) {
			ArrayList<Long> addlist = new ArrayList<>();
			System.out.println(" For Adding New  Contact Press '+' else press any key  for exit ");
			char ch = sc.next().charAt(0);
			if (ch == '+') {
				System.out.println("Enter Name");
				String str = sc.next();
				while (true) {
					System.out.print("Enter Phone Number");
					long number = sc.nextLong();
					addlist.add(number);
					System.out.println("For adding other number enter 'yes' else press any key for exit ");
					String choice = sc.next();
					if (choice.toLowerCase().equals("yes")) {
						continue;
					} else {
						System.out.println("see you again");
						break;
					}
				}
				pdmap.put(str, addlist);
				System.out.println("Adding contact successfull...");

			} else {
				System.out.println("See you again thank you");
				System.out.println("Your Phone Directory After Adding new Contact");
				Set<Entry<String, ArrayList<Long>>> pdset1 = pdmap.entrySet();
				Iterator<Entry<String, ArrayList<Long>>> pditr1 = pdset1.iterator();
				while (pditr1.hasNext()) {
					Entry<String, ArrayList<Long>> e = pditr1.next();
					System.out.println(e.getKey() + ":" + e.getValue());
				}
				break;
			}

		}

	}

}
