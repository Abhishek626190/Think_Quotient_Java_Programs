package com.test_01_12_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shipment_List_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shipment_Q7 obj1 = new Shipment_Q7(301, "Kareena", new Address_Q7("KarveNagar", "Mumbai", "Maharastra"),
				new MyDate_Q7(14, 11, 2023));

		Shipment_Q7 obj2 = new Shipment_Q7(302, "Karishma", new Address_Q7("Karve Nagar", "Pune", "Maharastra"),
				new MyDate_Q7(17, 10, 2022));

		Shipment_Q7 obj3 = new Shipment_Q7(303, "Raveena", new Address_Q7("KarveNagar", "Nashik", "Maharastra"),
				new MyDate_Q7(19, 11, 2020));

		Shipment_Q7 obj4 = new Shipment_Q7(304, "Kaitrina", new Address_Q7("KarveNagar", "Indore", "Madhya Pradesh"),
				new MyDate_Q7(15, 06, 2021));

		Shipment_Q7 obj5 = new Shipment_Q7(305, "Madhuri", new Address_Q7("KarveNagar", "Mumbai", "Maharastra"),
				new MyDate_Q7(13, 11, 2023));
		
		List<Shipment_Q7>slist=Arrays.asList(obj1,obj2,obj3,obj4,obj5);
		System.out.println("Original List");
		System.out.println(slist);
		System.out.println("*************");
		System.out.println("Sorting Base on City");
 		Collections.sort(slist);
		System.out.println(slist);
		System.out.println("*************");
 		System.out.println("Sorting Base on Date If city same");
 		Shipment_Comparator_Q7 scobj=new Shipment_Comparator_Q7();
		Collections.sort(slist,scobj);
		System.out.println(slist);
		System.out.println("*************");


	}

}
