package com.Array_Object;

public class Account {
	 
		private String name;
		private long accno;
		private double balance;
		
		Account()
		{
			
		}
		Account(String name,long an,double ba)
		{
			this.name=name;
			this.accno=an;
			this.balance=ba;
		}
		public void setName(String n)
		{
			this.name=n;
		}
		public void setAccno(long  a)
		{
			this.accno=a;
		}
		public void setBalance(double b)
		{
			this.balance=b;
		}
		public long getAccno()
		{
			return accno;
		}
		public String getName()
		{
			return name;
		}
		public double getBalance()
		{
			return balance;
		}
		public String toString()
		{
			return "Name:"+name+"\nAccount_Number:"+accno+"\nBalance:"+balance;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account obj=new Account();
			System.out.println(obj);
			Account obj1=new Account("Abhi",123456789,45654.54);
			obj1.setName("Abhishek");
			System.out.println(obj1);
 
		}

	}
