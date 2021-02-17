package com.kh.chap01_inherit.after.model.vo;

// Product�� ��� �޴� Desktop Ŭ����
public class Desktop extends Product{
	// extends -> Ȯ���ϴ�
	// �θ��� ���� ���� �ް� �ڽ��� ���� �߰��Ͽ� Ŭ������ Ȯ����
	private boolean allInOne;
	
	public Desktop() {}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super() : �θ� ��ü�� ������ ȣ��
		// �ļ��� ������ �ȿ� ���� ��Ű�� �ݵ�� ù �ٿ� ǥ�� -> �׻� �θ���� ������ �Ǳ� ����
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		// super. �θ� ��ü�� ����Ű�� ���� ����
		// �ڽ� Ŭ���� ������ �θ� Ŭ���� ��ü�� �����Ͽ� �ʵ峪 �޼ҵ� ȣ�� �� ���
		return super.information() + ", allInOne : " + allInOne;
	} 
	
	@Override
	public void print() {
		System.out.println("�� Desktop ��ü��!");
	}
	
	
	
}
