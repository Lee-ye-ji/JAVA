package com.kh.chap01_inherit.before.model.vo;

public class Tv {
	private String brand;	// �귣��
	private String pCode;	// ��ǰ�ڵ�
	private String pName;	// ��ǰ��
	private int price;		// ����
	
	private int inch;		// ��ġ
	
	public Tv() {}

	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName 
				+ ", price : " + price + ", inch : " + inch;
	}
}