package com.oops_assignments;

import java.util.Scanner;

public class Country_National_Game {
 	static String country_name;
 
	public void setData(String ch) {
		country_name = ch;
	}

	public void display() {
		switch (country_name) {
		case "india":
			System.out.println("The national game of "+country_name+" is Hockey:");
			break;
		case "china":
			System.out.println("The national game of"+country_name+" is Table_Tennis:");
			break;
		case "bangladesh":
			System.out.println("The national game of "+country_name+" is Kabaddi:");
			break;
		case "italy":
			System.out.println("The national game of "+country_name+" is Football,:");
			break;
		case "unitedstates":
			System.out.println("The national game of "+country_name+" is Baseball.:");
			break;
			default:System.out.println("Invalid Country Name:");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country_National_Game obj = new Country_National_Game();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country Name");
		country_name = sc.next();
		obj.setData(country_name);
		obj.display();
		sc.close();

	}

}
