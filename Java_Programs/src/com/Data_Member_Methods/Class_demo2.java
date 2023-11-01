package com.Data_Member_Methods;

import java.util.*;

public class Class_demo2 {
	String pname, pcategory, pdescription;
	int pid, pquantity;
	float discount, discountprice, price, totalprice, payableprice;

	public void setData(String pc, String pn, String pd, int id, int pq, float di, float pp) {

		pname = pn;
		pcategory = pc;
		pdescription = pd;
		pid = id;
		pquantity = pq;
		discount = di;
		price = pp;
	}

	public void calculateDiscountPrice() {

		discountprice = (totalprice * discount) / 100;
	}

	public void calculateTotalPrice() {

		totalprice = price * pquantity;
	}

	public void calculatePayablePrice() {

		payableprice = totalprice - discountprice;
	}

	public void displayProduct() {

		System.out.println("Product_Category:" + pcategory);
		System.out.println("Product_Name:" + pname);
		System.out.println("Product_Id:" + pid);
		System.out.println("Product_Description:" + pdescription);
		System.out.println("Product_Price:Rs" + price);
		System.out.println("Product_Quantity:" + pquantity);
		System.out.println("Discount_We_Offer:" + discount + "%");
		System.out.println("Total_Price:Rs" + totalprice);
		System.out.println("Discount_You_Got:Rs" + discountprice);
		System.out.println("You_Have_to_Pay:Rs" + payableprice);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_demo2 obj = new Class_demo2();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Category");
		String pca = sc.nextLine();

		System.out.println("Enter Product Name");
		String prn = sc.nextLine();

		System.out.println("Enter Product Id");
		int prid = sc.nextInt();

		System.out.println("Enter Product Quantity");
		int prqu = sc.nextInt();

		obj.setData(pca, prn, "Good For Memory", prid, prqu, 5, 150);

		obj.calculateTotalPrice();

		obj.calculateDiscountPrice();

		obj.calculatePayablePrice();

		obj.displayProduct();

	}
}
