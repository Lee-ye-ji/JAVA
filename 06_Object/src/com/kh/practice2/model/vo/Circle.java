package com.kh.practice2.model.vo;

public class Circle {
	
	public static final double PI =3.14;
	private static int radius = 5;
	
	public Circle(){}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : "+ (PI*radius*radius));
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : "+ (2*PI*radius));
	}
	
	

}
