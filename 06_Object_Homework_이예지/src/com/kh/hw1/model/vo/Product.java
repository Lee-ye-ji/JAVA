package com.kh.hw1.model.vo;

public class Product {
	private String productId = "ssgnote9 "; // ��ǰ���̵�
	private String productName = "�����ó�Ʈ9"; // ��ǰ��
	private String productArea = "��⵵ ����"; // ������
	private int price = 960000; // ����
	private double tax = 10.0; // �ΰ��� ����
	
	
	// getter()/setter()
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}

	public Product() {};
	
	public void Product(String productId, String productName, String productArea, int price, double tex) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	};
	
	public String information(){
//		return "��ǰ�� = " + productName
//				+ "\n �ΰ��� ���� ���� = "+price + (price * tax);
		return productId + " " + productName + " " + productArea + " " +
				price + " " + tax;
	}

}
