package com.aprilFinalWrittenTest2019;

/*
 * Q3.Accept String from user and display it in forllong pattern.
E.g.  String Entered is  “Hello” then String in following pattern
 should be displayed		    [1]
        H
      eHe
     leHel
    lleHell
  olleHello

 */
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		char ch[]=str.toCharArray();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j>=4-i&&j<=4+i)
				{
					System.out.print(ch[i]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
