package com.Test_Assignments_30_10_2023;

public class Pen_Q_3 {
	float capLength;
	String brand;
	Refill r;
	Pen_Q_3(String b,float l,Refill r)
	{
		this.capLength=l;
		this.brand=b;
		this.r=r;
	}
	public void SetBrand(String b)
	{
		this.brand=b;
	}
	public String getBrand()
	{
		return brand;
	}
	public void SetLength(float l)
	{
		this.capLength=l;
	}
	public float getLength()
	{
		return capLength;
	}
	public String toString()
	{
		return "\nBrand:"+brand+"\nLength:"+capLength+r;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nib n=new Nib("Rubber",1);
		Refill r=new Refill("Blue",2,n);
		Pen_Q_3 p=new Pen_Q_3("Reloynd", 1, r);
		System.out.println(p);
		System.out.println("\n*******************");
		n.setMaterial("Lather");
		n.setWidth(5);
		r.SetColor("Black");
		r.SetLength(4);
		p.SetBrand("Montex");
		p.SetLength(3);
		System.out.println(p);

	}

}
class Refill
{
	String inkColor;
	float length;
	Nib n;
	Refill(String i,float l,Nib n)
	{
		this.inkColor=i;
		this.length=l;
		this.n=n;
	}
	public void SetColor(String c)
	{
		this.inkColor=c;
	}
	public String getColor()
	{
		return inkColor;
	}
	public void SetLength(float l)
	{
		this.length=l;
	}
	public float getLength()
	{
		return length;
	}
	public String toString()
	{
		return "\nColor:"+inkColor+"\nLength:"+length+n;
	}
	
}

class Nib {
	String materialType;
	float width;

	Nib(String m, int w) {
		this.materialType = m;
		this.width = w;

	}

	public void setMaterial(String m) {
		this.materialType = m;
	}

	public String getMaterial() {
		return materialType;
	}

	public void setWidth(float w) {
		this.width = w;

	}

	public float getWidth() {
		return width;
	}

	public String toString() {
		return "\nMaterial Type:" + materialType + "\nWidht:" + width;
	}
}
