package com.kh.practice2.controller;

import java.util.Scanner;

import com.kh.practice2.model.vo.Product;

public class ProductController {
	
	private Product[] pro = new Product[10]; // = null
	public int count = 0; // 현재 추가된 객체 수
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 메뉴 출력 --> do~while 문으로 반복 실행 처리함
		do{
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가"); // productInput() 메소드 실행
			System.out.println("2. 제품 전체 조회"); // productPrint() 메소드 실행
			System.out.println("3. 제품 전체 삭제"); // productDelete() 메소드 실행
			System.out.println("4. 제품 수정");  // productUpdate() 메소드 실행
			System.out.println("5. 제품명 검색"); // productSearch() 메소드 실행
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				 productInput();
				break;
			case 2:
				 productPrint();
				break;
			//삭제
			case 3:
				productDelete();
				break;
			//수정
			case 4:
				productUpdate();
				break;
			// 검색
			case 5:
				productSearch();
				break;
			case 9:
				System.out.println("프로그램이 종료됩니다.");
				return;
			default:
				System.out.println("다시 입력해주세요."); 
				break;
				
			}
			
			
			
		}while(true);
	}

	private void productInput() {
		// 키보드로 도서 정보를 입력 받아 객체 생성
		
		System.out.println(" === 도서 정보 입력 === ");
		
		// 제품 번호
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		
		// 제품명
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		// 제품 가격
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		// 제품 세금
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		// -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
		// 현재 카운트 인덱스에 생성한 주소 저장
		if(count < pro.length) {
			pro[count++] = new Product(pId, pName, price, tax);
			System.out.println("도서 정보 저장이 완료되었습니다.");
		}else {
			System.out.println("도서 정보 입력에 실패하였습니다.");
		}
		
	}

	private void productPrint() {
		// 현재까지 기록된 도서 정보 모두 출력
		if(count == 0 || pro[0].getpId() == 0) {
			System.out.println("현재 등록된 도서 정보가 없습니다.");
		}else {
			for(int i = 0; i < count; i++) {
				System.out.println(pro[i].information());
			}
		}
		
	}
	
	// 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~
	
	// 삭제
	private void productDelete() {
		if(count == 0) {
			System.out.println("삭제 될 도서 정보가 없습니다.");
		}else {
			for(int i = 0; i < count; i++) {
				pro[i] = null;
				System.out.println("모든 도서 정보가 삭제되었습니다.");
			}
			count = 0;
		}	
	}
	
	// 수정
	private void productUpdate() {
		
		if(count == 0 ) {
			System.out.println("수정할 도서 정보가 없습니다.");
		}else if(count > 0) {
		while(true) {
			System.out.println(" ----- 제품 수정 메뉴 -----");
			System.out.println("1. 모든 제품 번호");
			System.out.println("2. 모든제품명");
			System.out.println("3. 모든 제품 가격");
			System.out.println("4. 모든 제품 세금");
			System.out.println("9. 이전 메뉴로");
			System.out.print("수정할 메뉴 : ");
			int update = sc.nextInt();
			sc.nextLine();
			
				switch(update) {
				case 1:
					// 제품 번호
					for(int i = 0; i < count; i++) {
						System.out.print("제품 번호 : ");
						int pId = sc.nextInt();
						pro[i].setpId(pId);
					}
					break;
				case 2:
					// 제품명
					for(int i = 0; i < count; i++) {
						System.out.print("제품명 : ");
						String pName = sc.nextLine();
						pro[i].setpName(pName);
					}
					break;
				case 3:
					// 제품 가격
					for(int i = 0; i < count; i++) {
						System.out.print("제품 가격 : ");
						int price = sc.nextInt();
						pro[i].setPrice(price);	
					}
					break;
				case 4:
					// 제품 세금
					for(int i = 0; i < count; i++) {
						System.out.print("제품 세금 : ");
						double tax = sc.nextDouble();
						pro[i].setTax(tax);
					}
					break;
				case 9:
					return;
				default:
					System.out.println("없는 메뉴 입니다. 다시 골라주세요.");
					break;
				}	
			}

		}
		
	}
	
	// 검색
	private void productSearch() {
		System.out.print("검색할 제품 명: ");
		String search = sc.nextLine();
		
		Product[] searchProduct = new Product[10];
		
		int index = 0; //searchProduct의 인덱스
		
		for(int i = 0; i < count; i++) {
			if(pro[i].getpName().contains(search)) {
				searchProduct[index++] = pro[i];
			}
		}
		
		if(searchProduct[0] != null) {
			for(int i = 0; i < count; i++) {
				if(searchProduct[i] != null) {
					System.out.println(searchProduct[i].information());
				}
			}	
		}else {
			System.out.println("검색된 제품명이 없습니다.");
		}
		
	}
	
}
