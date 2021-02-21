package com.kh.library.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.library.model.vo.Book;

public class BookManager {
	private HashMap<Integer, Book> bookMap = new HashMap<>();

	public BookManager() {}
	
	public void insertBook(Book book) {
		// 도서가 추가될 때 Map의 key값을 도서번호로 하고 value값을 book객체로 한다.
		// 이때 키값(도서번호)은 마지막 도서 번호의 다음번호로 부여해야됨
		int lastNo = 0; // 우선 변수 생성 및 초기화
		
		// bookMap의 keySet()의 iterator()를 통해 key들을 반복자를 통해 확인
		Set<Integer> keySet = bookMap.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			// -> 반복문의 최종단계의 key값이 도서번호의 마지막값 -> lastNo에 대입
			lastNo = key;
		}
		// bookMap에 추가할 때 key값으로 lastNo+1, value값으로 전달받은 book를 세트로 넣는다.
		bookMap.put(lastNo+1, book);
	}
	
	public HashMap<Integer, Book> selectMap(){
		return bookMap;	
	}
	
	public int deleteBook(int bNo) {
		int result = 0;
		// bookMap을 keySet() 메소드를 통해 Key들의 집합체인 Set타입으로 바꿔주고
		Set<Integer> keySet = bookMap.keySet();
		// 그걸 iterator()메소드를 통해 Iterator 타입으로 바꿔준다.
		Iterator<Integer> it = keySet.iterator();
		// while문을 통해 내가 전달 받은 bNo이 키 값으로 존재하는 경우
		while(it.hasNext()) {
			Integer key = it.next();
			if(key == bNo) {
//				bookMap.remove(key); -> java.util.ConcurrentModificationException 예외 발생
				// Iterator이용하여 삭제 하면 오류 발생하지 않음!
				it.remove();
				// 해당 도서 삭제하고 반복문 빠져나옴
				// 성공적으로 삭제 할 경우 1 리턴
				result = 1;
			}
		}
		// 삭제 되지 않은 경우 즉, 존재하는 도서 번호가 Key값에 없는 경우 0 리턴
		return result;
		
	}
	
	public HashMap<Integer, Book> searchBook(String title){
		// 검색 결과값들을 보관할 맵
		HashMap<Integer, Book> searchMap = new HashMap<Integer, Book>();
		
		// map의 entrySet(), Iterator를 통해 반복문 실행
		Iterator<Entry<Integer, Book>> it2 = bookMap.entrySet().iterator();
		
		while(it2.hasNext()) {
			Entry<Integer, Book> entry = it2.next();
			// -> entry의 getValue() 중 전달받은 title을 포함한 도서가 있을 경우
			if(entry.getValue().getTitle().contains(title)) {
				// searchMap에 entry의 getKey()값과 entry의 getValue()값을 가지고 저장
				searchMap.put(entry.getKey(), entry.getValue());
			}
		}
		// searchMap 리턴
		return searchMap;
		
	}
}
