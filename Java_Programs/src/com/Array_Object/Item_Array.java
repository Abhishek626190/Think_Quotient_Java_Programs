package com.Array_Object;

public class Item_Array {
	private int itemId;
	private String itemName;
	private float itemCost;

	Item_Array() {
		itemId = 0;
		itemName = "";
		itemCost = 0f;

	}

	Item_Array(int i, String n, float c) {
		this.itemCost = c;
		this.itemId = i;
		this.itemName = n;
	}

	public void print(Item_Array a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
			System.out.println("**************");
		}
	}

	public void maxPrice(Item_Array a[]) {
		float max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].itemCost > max) {
				max = a[i].itemCost;
			}

		}
		System.out.println("The Highest price is: " + max);
	}

	public void show(Item_Array a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].itemCost > 2000) {
				System.out.println(a[i].itemName);
			}
		}
	}

	public void averageItem(Item_Array a[]) {
		float sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i].itemCost;
		}
		float avg = sum / a.length;
		System.out.println("The average price is: " + avg);
	}

	public void increasePrice(Item_Array a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].itemCost < 1000) {
				a[i].itemCost = a[i].itemCost + 200;
				System.out.println(a[i].itemCost);
			}

		}
	}

	public String toString() {
		return "Item_Id: " + itemId + " Item_Name: " + itemName + " Item_Cost: " + itemCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item_Array obj = new Item_Array();
		Item_Array arr[] = new Item_Array[5];
		arr[0] = new Item_Array(101, "A", 6000f);
		arr[1] = new Item_Array(102, "B", 2000f);
		arr[2] = new Item_Array(103, "C", 900f);
		arr[3] = new Item_Array(104, "D", 4000f);
		arr[4] = new Item_Array(105, "E", 5000f);
		// obj.print(arr);
		// obj.show(arr);
		// obj.maxPrice(arr);
		// obj.averageItem(arr);
		obj.increasePrice(arr);

	}

}
