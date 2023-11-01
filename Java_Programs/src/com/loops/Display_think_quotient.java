package com.loops;
//WAC to display number b/w 1 to 50 if number is divisible by 3 then display think or if divisible by 5 then display Quotient and if divisible by 3&9 then display Think_Quotient

public class Display_think_quotient {

	public static void main(String[] args) {
   		// TODO Auto-generated method stub
      for(int i=1;i<=50;i++)
      {
    	  if(i%3==0&&i%5==0)
    	  {
    		  System.out.println("Think_Quotient"+i);
    	  }
    	  else if(i%5==0)
    	  {
    		  System.out.println("Think"+i);
    	  }
    	  else if(i%3==0)
    	  {
    		  System.out.println("Quotient"+i);
    	  }
    	  
      }
	}

}
