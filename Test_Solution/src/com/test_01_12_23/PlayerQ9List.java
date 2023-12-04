package com.test_01_12_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayerQ9List {
	public static void countFrequency1(ArrayList<String> bl) {
		int count = 0;
		int max = 0;
		String s = null;
		for (int i = 0; i < bl.size(); i++) {
			count = 0;
			for (int j = 0; j < bl.size(); j++) {
				if (bl.get(i).equals(bl.get(j)) && j < i)
					break;
				else if (bl.get(i).equals(bl.get(j)))
					count++;
 			}
			if (count > 0)
				System.out.println(bl.get(i) + " has " + count + " Australaian Player");
			if (count > max) {
				max = count;
				s = bl.get(i);
			}
		}
		System.out.println(s+" has maxmimum number of australian player i.e. "+max+" Players");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerQ9 obj1 = new PlayerQ9(701, "Thala", "India", "CSK");
		PlayerQ9 obj2 = new PlayerQ9(702, "Jaddu", "India", "CSK");
		PlayerQ9 obj3 = new PlayerQ9(703, "Chiku", "India", "RCB");
		PlayerQ9 obj4 = new PlayerQ9(704, "Bapu", "India", "KXIP");
		PlayerQ9 obj5 = new PlayerQ9(705, "Surya", "India", "MI");
		PlayerQ9 obj6 = new PlayerQ9(706, "Cummins", "Australia", "CSK");
		PlayerQ9 obj7 = new PlayerQ9(707, "Green", "Australia", "RCB");
		PlayerQ9 obj8 = new PlayerQ9(708, "Warner", "Australia", "CSK");
		PlayerQ9 obj9 = new PlayerQ9(709, "Hazelwood", "Australia", "CSK");
		PlayerQ9 obj10 = new PlayerQ9(710, "Maxwell", "Australia", "RCB");
		PlayerQ9 obj11 = new PlayerQ9(711, "David", "Australia", "MI");

		List<PlayerQ9> plist = Arrays.asList(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);

		// Iterator<PlayerQ9>pitr=plist.iterator();
//		
//		 while(pitr.hasNext())
//		 {
//			 PlayerQ9 p=pitr.next();
//			 if(p.getTeam().equals("CSK"))
//				 count++;
//		 }
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < plist.size(); i++) {
			if (plist.get(i).getCountry().equals("Australia"))
				al.add(plist.get(i).getTeam());

		}
		System.out.println(al);
		countFrequency1(al);

	}

}
