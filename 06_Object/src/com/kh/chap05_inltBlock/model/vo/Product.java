package com.kh.chap05_inltBlock.model.vo;

public class Product {
	// 멤버 변수 == 인스턴스 변수
	private String pName = "은하수";
	private int price = 9000000;
	
	// 클래스 변수
	private static String brand = "생성";
	
	// 인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성 시 마다 초기화 됨
	{
		pName = "cyon";
		price = 200000;
		
		
		brand = "헬지";
		// 인스턴스 블럭에서는 static 필드도 초기화 가능
		// static 필드는 이미 프로그램 시작 시 만들어져 있는 공간이므로
		// 객체 생성 이후 값을 초기화하는 인스턴스 초기화 블럭의 값으로 덮어쓰게 됨
	}
	
	// static 블록 - 클래스 변수를 초기화 시키는 블럭으로 프로그램 시작 시 단 한번만 초기화
	static {
		brand = "사과";
		
		//pName = "아이뽄";
		// static 블럭에서는 인스턴스 변수 초기화 불가능 (객체 == 인스턴스가 존재하지 않음)
	}
	
	public Product() {}
	
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
	
	public static String getBrand() {
		return brand;
	}
	
	public static void setBrand(String brand) {
		Product.brand = brand;
		// 객체의 필드에 접근하는 것이 아닌 정적 메모리의 brand에 접근해야하므로 this 사용X
	}
	
	public String information() {
		return "Product [pName=" + pName + ",price = " + price + " brand = " + brand + "]";
	}

}
