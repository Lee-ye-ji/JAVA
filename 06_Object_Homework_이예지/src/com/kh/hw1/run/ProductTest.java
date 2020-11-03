package com.kh.hw1.run;

import com.kh.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		
		Product p1 = new Product();
		System.out.println(p1.information());
		
		Product p2 = new Product();
		p2.setProductId("gxnote5");
		p2.setProductName("LG스마트폰5");
		p2.setProductArea("경기도 평택");
		p2.setPrice(780000);
		p2.setTax(0.7);
		System.out.println(p2.information());
		
		Product p3 = new Product();
		p3.setProductId("ktsnote3");
		p3.setProductName("KT스마트폰3 ");
		p3.setProductArea("서울시 강남");
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
		System.out.println("상품명 = " + p1.getProductName());
		System.out.println("부가세 포함 가격 : " + (int) (p1.getPrice() + (p1.getPrice() * p1.getTax())) + "원");
		// 2
		System.out.println("상품명 = " + p2.getProductName());
		System.out.println("부가세 포함 가격 : " + (int) (p2.getPrice() + (p2.getPrice() * p2.getTax())) + "원");
		// 3
		System.out.println("상품명 = " + p3.getProductName());
		System.out.println("부가세 포함 가격 : " + (int) (p3.getPrice() + (p3.getPrice() * p3.getTax())) + "원");


	}

}
