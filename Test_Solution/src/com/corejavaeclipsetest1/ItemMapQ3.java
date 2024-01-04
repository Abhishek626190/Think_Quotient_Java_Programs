package com.corejavaeclipsetest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ItemMapQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ItemQ3> item = new ArrayList<>();
		HashMap<String, Integer> itemMap = new HashMap<>();

		ItemQ3 item1 = new ItemQ3(112, "ParleG", 10, 20.00);
		ItemQ3 item2 = new ItemQ3(113, "GoodDay", 30, 40.00);
		ItemQ3 item3 = new ItemQ3(112, "ParleG", 5, 20.00);
		ItemQ3 item4 = new ItemQ3(113, "GoodDay", 10, 4.00);
		item.add(item1);
		item.add(item2);
		item.add(item3);
		item.add(item4);


		Iterator<ItemQ3> itr = item.iterator();
		while (itr.hasNext()) {
			ItemQ3 i = itr.next();
			int id = i.getId();
			String name = i.getName();
			int sum = 0;
			 for(int j=0;j<item.size();j++)
			 {
				 if(id==item.get(j).getId())
				 {
					 sum=sum+item.get(j).getQuantity();
				 }
			 }

			 if(!itemMap.containsKey(name))
			 {
				 itemMap.put(name, sum);
			 }
		}
		System.out.println(itemMap);

	}
}
