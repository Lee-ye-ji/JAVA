package com.kh.library.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.kh.library.controller.BookManager;
import com.kh.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void mainMenu() {
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.print("메뉴 번호 선택 : ");	
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: selectMap(); break;
			case 0: 
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			default: 
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;	
			}
		}
		
	}
	
	// 도서 추가
	public void insertBook() {
		// "도서 제목 : " >> 입력 받음 (title)
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		// "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : "
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		// >> 입력 받음 (category)
		int category = sc.nextInt();
		sc.nextLine();
		
		// "도서 저자 : " >> 입력 받음 (author)
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		// 위에서 입력 받은 title, category, author를 매개변수로 한 Book 객체 생성 (book)
		Book book = new Book(title, category, author);
		// BookManager의 insertBook 메소드로 book 전달
		bm.insertBook(book);
	}
	
	// 전체 조회
	public void selectMap() {
		// BookManager의 selectMap() 메소드 호출
		// -> 리턴 값 전달 받음 (bookMap)
		HashMap<Integer, Book> bookMap = bm.selectMap();
		
		// bookMap이 비어 있을 경우 >> “도서 목록이 존재하지 않습니다.”출력
		if(bookMap.isEmpty()) {
			System.out.println("도서 목록이 존재하지 않습니다.");
		}else {
			// bookMap이 비어있지 않을 경우 >> Iterator를 이용하여 출력
//			System.out.println(bookMap);
			Iterator<Integer> it = bookMap.keySet().iterator();
			while(it.hasNext()) {
				Integer key = it.next();
				System.out.printf("키 : %d, 값 : %s\n",key, bookMap.get(key));
			}
		}
		
	}
	
	// 도서 삭제
	public void deleteBook() {
		// “도서 번호 : “ >> 입력 받음 (bNo)
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		// BookManager의 deleteBook 메소드로 bNo 전달
		// ->리턴 값 전달 받음 (result)
		int result = bm.deleteBook(bNo);
		// result가 1일 경우 >> “성공적으로 삭제” 출력
		if(result == 1) {
			System.out.println("성공적으로 삭제");
		}else {
			// result가 0일 경우 >> “삭제할 글이 존재하지 않습니다.”출력
			System.out.println("삭제할 글이 존재하지 않습니다.");
		}
	}
	
	 // 도서 검색
	public void searchBook() {
		// “도서 제목 : “ >> 입력 받음 (title)
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		// BookManager의 searchBook 메소드로 title 전달
		// -> 리턴 값 전달 받음 (searchMap)
		HashMap<Integer, Book> searchMap = bm.searchBook(title);
		
		// searchMap이 비어 있을 경우 >> “검색 결과가 존재하지 않습니다.”출력
		if(searchMap.isEmpty()) {
			System.out.println(searchMap);
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else {
			// bookMap이 비어있지 않을 경우 >> Iterator를 이용하여 출력
			Iterator<Integer> its = searchMap.keySet().iterator();
			while(its.hasNext()) {
				Integer key = its.next();
				System.out.printf("키 : %d, 값 : %s\n", key, searchMap.get(key));
			}
		}
	}

}
