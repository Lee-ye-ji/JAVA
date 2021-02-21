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
		// ������ �߰��� �� Map�� key���� ������ȣ�� �ϰ� value���� book��ü�� �Ѵ�.
		// �̶� Ű��(������ȣ)�� ������ ���� ��ȣ�� ������ȣ�� �ο��ؾߵ�
		int lastNo = 0; // �켱 ���� ���� �� �ʱ�ȭ
		
		// bookMap�� keySet()�� iterator()�� ���� key���� �ݺ��ڸ� ���� Ȯ��
		Set<Integer> keySet = bookMap.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			// -> �ݺ����� �����ܰ��� key���� ������ȣ�� �������� -> lastNo�� ����
			lastNo = key;
		}
		// bookMap�� �߰��� �� key������ lastNo+1, value������ ���޹��� book�� ��Ʈ�� �ִ´�.
		bookMap.put(lastNo+1, book);
	}
	
	public HashMap<Integer, Book> selectMap(){
		return bookMap;	
	}
	
	public int deleteBook(int bNo) {
		int result = 0;
		// bookMap�� keySet() �޼ҵ带 ���� Key���� ����ü�� SetŸ������ �ٲ��ְ�
		Set<Integer> keySet = bookMap.keySet();
		// �װ� iterator()�޼ҵ带 ���� Iterator Ÿ������ �ٲ��ش�.
		Iterator<Integer> it = keySet.iterator();
		// while���� ���� ���� ���� ���� bNo�� Ű ������ �����ϴ� ���
		while(it.hasNext()) {
			Integer key = it.next();
			if(key == bNo) {
//				bookMap.remove(key); -> java.util.ConcurrentModificationException ���� �߻�
				// Iterator�̿��Ͽ� ���� �ϸ� ���� �߻����� ����!
				it.remove();
				// �ش� ���� �����ϰ� �ݺ��� ��������
				// ���������� ���� �� ��� 1 ����
				result = 1;
			}
		}
		// ���� ���� ���� ��� ��, �����ϴ� ���� ��ȣ�� Key���� ���� ��� 0 ����
		return result;
		
	}
	
	public HashMap<Integer, Book> searchBook(String title){
		// �˻� ��������� ������ ��
		HashMap<Integer, Book> searchMap = new HashMap<Integer, Book>();
		
		// map�� entrySet(), Iterator�� ���� �ݺ��� ����
		Iterator<Entry<Integer, Book>> it2 = bookMap.entrySet().iterator();
		
		while(it2.hasNext()) {
			Entry<Integer, Book> entry = it2.next();
			// -> entry�� getValue() �� ���޹��� title�� ������ ������ ���� ���
			if(entry.getValue().getTitle().contains(title)) {
				// searchMap�� entry�� getKey()���� entry�� getValue()���� ������ ����
				searchMap.put(entry.getKey(), entry.getValue());
			}
		}
		// searchMap ����
		return searchMap;
		
	}
}
