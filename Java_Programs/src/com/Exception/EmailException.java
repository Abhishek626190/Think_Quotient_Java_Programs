package com.Exception;

public class EmailException extends Exception {
	String email;
	public EmailException() {
		// TODO Auto-generated constructor stub
	}
	public EmailException(String e)
	{
		this.email=e;
	}
	public String toStirng()
	{
		return "Inavalid email"+email;
	}

	 

	}


