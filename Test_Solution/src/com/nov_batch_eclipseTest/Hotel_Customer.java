package com.nov_batch_eclipseTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Hotel serves delicious Menus to its Customers. It maintains
 * list of Orders given on daily basis. Order list is maintained
 * as ArrayList<Order>. Each Order contains orderid, MenuName, 
 * price,  qtyOrdered. (Price of same Menu may vary according 
 * hours).
From ArrayLsit of Orders create a map <String,Float> where Menu 
Name is key and total sale in a day for theMenu as Value. 
(sale for the menu is Price*qty ordered).Eg. Order List for a 
day is :
[(80,”Pav Bhajee”,120.00,5),	(90,”Grilled Sandwitch”,72.00,10),
(92,”Hakka Noodles”,220.00,2),	(96,”Pav Bhajee”,125.00,8),
(101,”Grilled Sandwitch”,70.00,2)]
Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},{“Hakka Noodles”, 440}, 
{“Grilled Sandwitch”,860}}	 

 */
public class Hotel_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orders obj1 = new Orders(80, "Pav Bhajee", 120.00f, 5);
		Orders obj2 = new Orders(90, "Grilled Sandwitch", 72.00f, 10);
		Orders obj3 = new Orders(92, "Hakka Noodles", 220.00f, 2);
		Orders obj4 = new Orders(96, "Pav Bhajee", 125.00f, 8);
		Orders obj5 = new Orders(101, "Grilled Sandwitch", 70.00f, 2);
		ArrayList<Orders> l = new ArrayList<>();
		l.add(obj1);
		l.add(obj2);
		l.add(obj3);
		l.add(obj4);
		l.add(obj5);

		HashMap<String, Float> map = new HashMap<>();

		Iterator<Orders> itr = l.iterator();
		while (itr.hasNext()) {
			Orders o = itr.next();
			String menuName = o.getMenuName();
			float sum = 0;
			for (int i = 0; i < l.size(); i++) {
				String mn = l.get(i).getMenuName();
				if (menuName.equals(mn)) {
					sum = sum+(l.get(i).getQty() * l.get(i).getPrice());
				}
			}
			if (!map.containsKey(menuName)) {
				map.put(menuName, sum);
			}
		}

		Set<Entry<String, Float>> set = map.entrySet();
		Iterator<Entry<String, Float>> itrmap = set.iterator();
		while (itrmap.hasNext()) {
			Entry<String, Float> e = itrmap.next();
			System.out.println("Menu Name:" + e.getKey());
			System.out.println("Total Price:" + e.getValue());
			System.out.println("********************");

		}

	}

}
