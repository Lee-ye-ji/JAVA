package com.kh.chap01_inherit.after.model.vo;

public class Tv extends Product {
	
	private int inch;
	
	public Tv() {
		// super(); -> 명시적으로 표기하지 않아도 동작
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		return super.information() + ", inch : " + inch;
	}
	
	@Override
	public void print() {
		System.out.println("나 Tv 객체야!");
	}
	

}
