package com.ContainmentAssignements;

public class Address {
	public String city,state,country;
	Address()
	{
		
	}
	Address(String c,String s,String co)
	{
		this.city=c;
		this.state=s;
		this.country=co;
	}
	public void setCity(String c)
	{
		this.city=c;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String s)
	{
		this.state=s;
	}
	public String getState()
	{
		return state;
	}
	public void setCountry(String co)
	{
		this.country=co;
	}
	public String getCountry()
	{
		return country;
	}
	public String toString()
	{
		return "City:"+city+"\nState:"+state+"\nCountry:"+country;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj=new Address();
		System.out.println(obj);
		Address obj1=new Address("Karve_Nagar","Maharashtra","INDIA");
		System.out.println(obj1);


	}

}
