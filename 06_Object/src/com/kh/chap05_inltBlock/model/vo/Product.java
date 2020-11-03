package com.kh.chap05_inltBlock.model.vo;

public class Product {
	// ��� ���� == �ν��Ͻ� ����
	private String pName = "���ϼ�";
	private int price = 9000000;
	
	// Ŭ���� ����
	private static String brand = "����";
	
	// �ν��Ͻ� ��� - �ν��Ͻ� ������ �ʱ�ȭ ��Ű�� ������ ��ü ���� �� ���� �ʱ�ȭ ��
	{
		pName = "cyon";
		price = 200000;
		
		
		brand = "����";
		// �ν��Ͻ� �������� static �ʵ嵵 �ʱ�ȭ ����
		// static �ʵ�� �̹� ���α׷� ���� �� ������� �ִ� �����̹Ƿ�
		// ��ü ���� ���� ���� �ʱ�ȭ�ϴ� �ν��Ͻ� �ʱ�ȭ ���� ������ ����� ��
	}
	
	// static ��� - Ŭ���� ������ �ʱ�ȭ ��Ű�� ������ ���α׷� ���� �� �� �ѹ��� �ʱ�ȭ
	static {
		brand = "���";
		
		//pName = "���̻�";
		// static �������� �ν��Ͻ� ���� �ʱ�ȭ �Ұ��� (��ü == �ν��Ͻ��� �������� ����)
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
		// ��ü�� �ʵ忡 �����ϴ� ���� �ƴ� ���� �޸��� brand�� �����ؾ��ϹǷ� this ���X
	}
	
	public String information() {
		return "Product [pName=" + pName + ",price = " + price + " brand = " + brand + "]";
	}

}
