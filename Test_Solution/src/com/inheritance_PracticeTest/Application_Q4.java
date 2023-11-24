package com.inheritance_PracticeTest;

import com.Test_Questions.Mobile_Application;

public class Application_Q4 {
	private float version;
	private String technologyUsed;

	public Application_Q4() {
		// TODO Auto-generated constructor stub
	}

	public Application_Q4(float ver, String tech) {
		this.technologyUsed = tech;
		this.version = ver;
	}

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	public String getTechnologyUsed() {
		return technologyUsed;
	}

	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}

	public void createSetUp() {
		System.out.println("SetUp Creation Successfully for Application ");

	}
 
	@Override
	public String toString() {
		return "[version=" + version + ", technologyUsed=" + technologyUsed + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application_Q4 a=new Application_Q4(5.6f,"ReactNative");
		System.out.println(a);
		a.createSetUp();
		WebApplication w=new WebApplication(8.2f,"React_JS");
		System.out.println(w);
		w.createSetUp();
		DesktopApplication d=new DesktopApplication(9.5f,"Java");
		System.out.println(d);
		d.createSetUp();
		Mobile_Application m=new Mobile_Application(11.5f,"Flutter");
		System.out.println(m);
		m.createSetUp();

	}

}

class WebApplication extends Application_Q4 {

	public WebApplication() {
		// TODO Auto-generated constructor stub
	}

	WebApplication(float ver, String tech) {
		super(ver, tech);
	}
	public void createSetUp()
	{
		System.out.println("SetUp creation SuccessFully for WebApplication");
	}

}

class DesktopApplication extends Application_Q4 {
	public DesktopApplication() {
		// TODO Auto-generated constructor stub
	}

	DesktopApplication(float ver, String tech) {
		super(ver, tech);
	}
	public void createSetUp()
	{
		System.out.println("SetUp creation SuccessFully for DesktopApplication");
	}

}
