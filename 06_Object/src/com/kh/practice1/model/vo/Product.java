package com.kh.practice1.model.vo;

public class Product {
	private String pName; //��ǰ��
	private int price; // ����
	private String brand; // ������
	
	public Product() {} // �����ں� -> �ۿ��� ������ �� �ְ� ����������
	
	public void setpName(String pName) {
		this.pName =  pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return "��ǰ�� : " + pName + ", ���� : " + price + ", ������ : " + brand;
	}

}
