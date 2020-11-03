package com.kh.chap05_inltBlock.run;

import com.kh.chap05_inltBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.information());
		// 필드 초기화 순서
		// 1. JVM이 정한 기본 값으로 객체 생성 
		// -> Product [pName=null,price=0 brand = null]
		// 2. 명시적 초기화
		// -> Product [pName=은하수,price=9000000 brand = 생성]
		// 3. 인스턴스 블록 / static 블럭
		// -> Product [pName=cyon,price = 200000 brand = 사과]
		// static 블록(프로그램 시작 시 한 번 실행) / 인스턴스 블록(객체 생성 시마다 실행)
		// -> Product [pName=cyon,price = 200000 brand = 헬지]
		// 4. 인스턴스 변수의 경우 - 생성자 초기화
		


	}

}
