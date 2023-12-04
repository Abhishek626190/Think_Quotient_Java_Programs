package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Apple {
	float price;
	String name;

	public Apple(float price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "Apple [price=" + price + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int result;
		result = (this.name == null) ? 0 : name.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o) {
		Apple other = (Apple) o;
		if (this.price != other.price)
			return true;
		if (this.name == null) {
			if (other.name == null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Apple, Integer> appleMap = new HashMap<>();
		Apple a1 = new Apple(420, "Nepali");
		appleMap.put(a1, 101);
		System.out.println(a1.hashCode());
		Apple a2 = new Apple(786, "Kashmiri");
		appleMap.put(a2, 102);
		System.out.println(a2.hashCode());
		Apple a3 = new Apple(376, "Shimla");
		appleMap.put(a3, 103);
		System.out.println(a3.hashCode());
		Apple a4 = new Apple(144, "Govandi");
		appleMap.put(a4, 104);
		System.out.println(a4.hashCode());
		// System.out.println(appleMap);
		Apple a5 = new Apple(199, "Bihari");
		appleMap.put(a5, 105);
		System.out.println(a5.hashCode());
		Apple a6 = new Apple(144, "Govandi");
		appleMap.put(a6, 108);
		System.out.println(a6.hashCode());
		for (Entry<Apple, Integer> apm : appleMap.entrySet()) {
			System.out.println("Key" + apm.getKey() + ": Value " + apm.getValue());
		}
		// Apple a7 = new Apple(144, "Govandi");
		// appleMap.put(a6, 104);
		// System.out.println(a7.hashCode());
		// System.out.println(appleMap.get(a7));

	}

}
