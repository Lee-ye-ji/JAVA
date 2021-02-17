package com.kh.chap01_inherit.after.model.vo;

// 3���� ��ǰ�� ��� ���������� ������ �ִ� ��Ҹ� �����Ͽ� �θ� Ŭ������ ������
public class Product /*extends Object*/{	
	private String brand;	// �귣��
	private String pCode;	// ��ǰ�ڵ�
	private String pName;	// ��ǰ��
	private int price;		// ����
	
	public Product() {
		super();
	} 

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
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
	
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName 
				+ ", price : " + price;
	}
	
	public void print() {
		System.out.println("�� Product ��ü��!");
	}
	
	
	
	
	
	
	
	
	
}
