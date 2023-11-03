package com.Array_Object;

import java.util.Arrays;

public class Supplier {
	private String supName;
	private int supId;
	Item_Array itemarr[];

	Supplier() {
		supName = "";
		supId = 0;
		itemarr = null;
	}

	Supplier(int i, String n, Item_Array a[]) {
		this.itemarr = a;
		this.supId = i;
		this.supName = n;

	}

	public String toString() {
		return "Supplier_Id: " + supId + "\nSupplier_Name: " + supName + "\n" + "Supllied_Items"
				+ Arrays.toString(itemarr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item_Array arr[] = new Item_Array[5];
		Item_Array arr1[] = new Item_Array[5];
		arr[0] = new Item_Array(101, "A", 6000f);
		arr[1] = new Item_Array(102, "B", 2000f);
		arr[2] = new Item_Array(103, "C", 900f);
		arr[3] = new Item_Array(104, "D", 4000f);
		arr[4] = new Item_Array(105, "E", 5000f);

		arr1[0] = new Item_Array(101, "A", 6000f);
		arr1[1] = new Item_Array(102, "B", 2000f);
		arr1[2] = new Item_Array(103, "C", 900f);
		arr1[3] = new Item_Array(104, "D", 4000f);
		arr1[4] = new Item_Array(105, "E", 5000f);

		Supplier obj = new Supplier(101, "A", arr);
		Supplier obj1 = new Supplier(102, "B", arr1);

		System.out.println(obj);
		System.out.println(obj1);

	}

}
