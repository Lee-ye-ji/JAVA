package com.kh.chap01_inherit.after.model.vo;

public class SmartPhone extends Product {
	
	private String mobileAgency;

	public SmartPhone() {
		super();
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
	
	@Override
	public void print() {
		System.out.println("�� SmartPhone ��ü��!");
	}
	
}
