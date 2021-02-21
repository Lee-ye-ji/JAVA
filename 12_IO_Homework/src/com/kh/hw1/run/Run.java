package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.dao.FileDao;

public class Run {

	//FileController 클래스 객체 생성 후 각 메소드를 메뉴 선택에 따라 실행
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		// 반복문을 통한 메뉴 실행
		while(true) {
			System.out.println("****** My Note ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			// 반복문 내에서 입력 받은 번호에 따라서 
			// FileDao의 메소드를 실행
			switch(num) {
			case 1 : fd.fileSave(); // 새로 쓰기 
					break; 
			case 2 : fd.fileOpen(); // 열기(읽기)
					break;
			case 3 : fd.fileEdit(); // 수정
					break;
			case 4 : System.out.println("프로그램이 종료 되었습니다.");
					return; //끝내기
			default :  System.out.println("잘못 입력하셨습니다.");
					break; // 다른 번호 입력 시
			}
			
		}

	}

}
