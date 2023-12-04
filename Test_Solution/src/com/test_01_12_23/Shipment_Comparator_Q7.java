package com.test_01_12_23;

import java.util.Comparator;

public class Shipment_Comparator_Q7 implements Comparator<Shipment_Q7> {
//comapare only by date if city is same............
// 	@Override
//	public int compare(Shipment_Q7 o1, Shipment_Q7 o2) {
//		// TODO Auto-generated method stub
// 		Integer d1=o1.getShipdate().getDd();
// 		Integer d2=o2.getShipdate().getDd();
//
//  		if(o1.getAddress().getCity().equals(o2.getAddress().getCity()))
//			return d1.compareTo(d2);
// 		else
// 			return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
// 	}
	
	//Compare only by date,month,year if city is same............
 	@Override
	public int compare(Shipment_Q7 o1, Shipment_Q7 o2) {
		// TODO Auto-generated method stub
		 
		MyDate_Q7 m1 = o1.getShipdate();
		MyDate_Q7 m2 = o2.getShipdate();

		if (o1.getAddress().getCity().equals(o2.getAddress().getCity()))
			return m1.compareTo(m2);
		else
			return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());

	}

}
