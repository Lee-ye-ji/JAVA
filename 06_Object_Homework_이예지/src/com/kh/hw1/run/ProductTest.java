package com.kh.hw1.run;

import com.kh.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// �Ű����� �����ڸ� �̿��Ͽ� 3���� ��ü ���� (���� ��뵥���� ����)
		// ��ü�� ���� �ʵ� �� ��� Ȯ��
		
		Product p1 = new Product();
		System.out.println(p1.information());
		
		Product p2 = new Product();
		p2.setProductId("gxnote5");
		p2.setProductName("LG����Ʈ��5");
		p2.setProductArea("��⵵ ����");
		p2.setPrice(780000);
		p2.setTax(0.7);
		System.out.println(p2.information());
		
		Product p3 = new Product();
		p3.setProductId("ktsnote3");
		p3.setProductName("KT����Ʈ��3 ");
		p3.setProductArea("����� ����");
		p3.setPrice(250000);
		p3.setTax(0.3);
		System.out.println(p3.information());
		
		System.out.println("================================================");
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		System.out.println(p1.information()+ "\n" + p2.information() + "\n" + p3.information());
		
		System.out.println("================================================");
		
		// 1
		System.out.println("��ǰ�� = " + p1.getProductName());
		System.out.println("�ΰ��� ���� ���� : " + (int) (p1.getPrice() + (p1.getPrice() * p1.getTax())) + "��");
		// 2
		System.out.println("��ǰ�� = " + p2.getProductName());
		System.out.println("�ΰ��� ���� ���� : " + (int) (p2.getPrice() + (p2.getPrice() * p2.getTax())) + "��");
		// 3
		System.out.println("��ǰ�� = " + p3.getProductName());
		System.out.println("�ΰ��� ���� ���� : " + (int) (p3.getPrice() + (p3.getPrice() * p3.getTax())) + "��");


	}

}
