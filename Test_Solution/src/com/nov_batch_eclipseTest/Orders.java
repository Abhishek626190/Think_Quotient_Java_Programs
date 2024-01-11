package com.nov_batch_eclipseTest;

public class Orders {
	private int oid;
	private String menuName;
	private float price;
	private int qty;
	
	public Orders(int oid, String menuName, float price, int qty) {
		super();
		this.oid = oid;
		this.menuName = menuName;
		this.price = price;
		this.qty = qty;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", menuName=" + menuName + ", price=" + price + ", qty=" + qty + "]";
	}

	 

}
