package com.kh.hw1.model.vo;

public class Product {
	private String productId = "ssgnote9 "; // 상품아이디
	private String productName = "갤럭시노트9"; // 상품명
	private String productArea = "경기도 수원"; // 생산지
	private int price = 960000; // 가격
	private double tax = 10.0; // 부가세 비율
	
	
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
//		return "상품명 = " + productName
//				+ "\n 부가세 포함 가격 = "+price + (price * tax);
		return productId + " " + productName + " " + productArea + " " +
				price + " " + tax;
	}

}
