package com.Containment;

public class Address__ {
	private String city,street,state;
	Address__()
	{
		
	}
	Address__(String c,String s,String st)
	{
		this.city=c;
		this.state=st;
		this.street=s;
	}
	public void setCity(String s)
	{
		this.city=s;
	}
	public void setState(String st)
	{
		this.state=st;
	}
	public void setStreet(String s)
	{
		this.street=s;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getStreet()
	{
		return street;
	}
	public String toString()
	{
		return "Street:"+street+"\nCity:"+city+"\nState:"+state;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address__ obj=new Address__();
		//System.out.println(obj);
	}

}
