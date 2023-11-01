//import java.io.*;

package com.variables;


public class CI1 
	 
	  
	 
	{
	    public static void main(String args[])
	    {
	        double principal = 1200, rate = 5.4, time = 2;
	  
	        /* Calculate compound interest */
	        double A= principal *
	                    (Math.pow((1 + rate / 100), time));
//	        double b=(Math.pow((1+rate/100),time));
	          
	        System.out.println("Compound Interest is "+ A);
//	        System.out.println("Compound Interest is "+ b);
	    }
	}


