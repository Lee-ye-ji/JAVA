package com.kh.chap04_assist.part04_object.model.vo;

import java.io.Serializable;

// ��ü ����� �� �ݵ�� ����ȭ ó�� �ؾ� ��
public class Phone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5360818841505606660L;
	// price -> productId�� ���� �����Ͽ� �׽�Ʈ �غ���
	// serialversionUID ������ ���� �ҷ��� �� �ٸ� ��� ������ �߻�
	// �ʵ� ������ ���������� ������ JVM�� �ڵ����� �⺻ �� ����
	// Ŭ���� ���� �ڵ� ������ ������ ������ ���� ������ ���߿� ��������, ���� ���׷��̵� ������
	// Ŭ���� ���� �ڵ� ������ ���� ��� �ʵ�� ���� ���̵� �������־�� ���� Ŭ�������� ǥ�� �� �� ����
	
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