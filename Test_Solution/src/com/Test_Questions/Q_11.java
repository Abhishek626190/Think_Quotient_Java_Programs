package com.Test_Questions;
import java.util.*;
public class Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    int number, max;
	    System.out.println("Enter number");
	    number = input.nextInt();
	    max = number;

	    while (number != 0) {
		    System.out.println("Enter number");

	      number = input.nextInt();
	      if (number > max)
	        max = number; 
	    }

	    System.out.println("max is " + max);
	    System.out.println("number " + number);


	}

}
