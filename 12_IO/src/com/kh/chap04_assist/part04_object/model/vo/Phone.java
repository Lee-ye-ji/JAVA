package com.kh.chap04_assist.part04_object.model.vo;

import java.io.Serializable;

// 객체 입출력 시 반드시 직렬화 처리 해야 함
public class Phone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5360818841505606660L;
	// price -> productId로 버전 변경하여 테스트 해보기
	// serialversionUID 저장할 때와 불러올 때 다른 경우 오류가 발생
	// 필드 값으로 명시해주지 않으면 JVM이 자동으로 기본 값 지정
	// 클래스 내부 코드 변경이 없으면 오류가 나지 않지만 나중에 유지보수, 버전 업그레이드 등으로
	// 클래스 내부 코드 변경이 있을 경우 필드로 버전 아이디를 명시해주어야 동일 클래스임을 표현 할 수 있음
	
	private String brand;
	private int price;
	
	public Phone() {}

	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + "]";
	}
	
	
	

}
