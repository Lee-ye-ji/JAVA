package com.kh.hw1.model.vo;

public class Triangle implements IShape{
	private double base; // �غ�
	private double height; // ����

	public Triangle() {}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// ���� = (�غ� * ����)/2
		return (base * height)/2;
	}

	@Override
	public double perimeter() {
		// �ѷ� = �غ� + ���� + ��������
		return base + height + Math.sqrt(base * base + height * height) ;
	}
	
	
	// ���� ���� ���
	public double hypotenuse() {
		//���� ���� = Math.sqrt( �غ� * �غ� + ���� * ����)
		return  Math.sqrt(base * base + height * height);
	}
	
}
