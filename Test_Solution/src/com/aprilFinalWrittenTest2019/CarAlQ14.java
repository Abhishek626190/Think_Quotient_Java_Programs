package com.aprilFinalWrittenTest2019;

/*
 * 14) Class Car is as follows , { int carno  , String color } .
 *  By mistake multiple car objects are added in a collection. 
 *   Find out duplicate objects in that collection and remove them. 
 *   Car is same only if (carno  and  color both are same)[1M]
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CarAlQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CarQ14> car = new ArrayList<>();
		CarQ14 c1 = new CarQ14(101, "Black");
		CarQ14 c2 = new CarQ14(102, "White");
		CarQ14 c3 = new CarQ14(103, "Red");
		CarQ14 c4 = new CarQ14(104, "Grey");
		CarQ14 c5 = new CarQ14(105, "Magenta");
		CarQ14 c6 = new CarQ14(101, "Black");
		CarQ14 c7 = new CarQ14(106, "Yellow");
		CarQ14 c8 = new CarQ14(102, "White");
		CarQ14 c9 = new CarQ14(105, "Magenta");
		CarQ14 c10 = new CarQ14(107, "Magenta");

		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);
		car.add(c5);
		car.add(c6);
		car.add(c7);
		car.add(c8);
		car.add(c9);
		car.add(c10);
		HashSet<CarQ14> set = new HashSet<>(car);
		Iterator<CarQ14> itrset = set.iterator();
		System.out.println();
		while (itrset.hasNext()) {
			CarQ14 c = itrset.next();
			System.out.println(c);

		}

	}

}
