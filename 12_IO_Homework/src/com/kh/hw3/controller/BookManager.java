package com.kh.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.hw3.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {} // 기본 생성자
	
	//5가지 도서에 대한 정보를 객체배열과 Object스트림을 통해 파일에 저장하는 메소드
	public void fileSave() {
		Book[] bk = new Book[5]; // Book 객체를 받을 객체 배열
		
		// 객체 배열을 3번의 사용 데이터로 초기화
		// (출판날짜는 아래 setCalendar 메소드를 활용)
		{
			bk[0] = new Book("C언어", "김길동", 10000, setCalendar(2012, 2, 2), 0.1);
			bk[1] = new Book("자바", "이길동", 20000, setCalendar(2013, 3, 3), 0.2);
			bk[2] = new Book("C++", "박길동", 30000, setCalendar(2014, 4, 4), 0.3);
			bk[3] = new Book("파이썬", "서길동", 40000, setCalendar(2015, 5, 5), 0.4);
			bk[4] = new Book("오라클", "최길동", 50000, setCalendar(2016, 6, 6), 0.5);
		}
		
		// try with resource 구문으로 “books.dat”파일에 저장되게 ObjectOutputStream과
		// FileOutputStream을 생성
		// 파일에 객체 배열의 값 저장
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"))){

			for(int i  = 0; i < bk.length; i++) {
				oos.writeObject(bk[i]);
			}
			
			//bk[] 한번에 출력
			//oos.writeObject(bk);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public Calendar setCalendar(int year, int month, int date) {
		// 매개변수로 들어온 년, 월, 일로 설정된 Calendar형 반환
	
		/**/
		
		return new GregorianCalendar(year, month-1, date);
		
	}
	
	public void fileRead() {
		Book[] bk = new Book[10];
		// try with resource 구문
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"))) {
			// (FileNotFoundException과 ClassNotFoundException,
			// EOFException, IOException 처리	
			// 으로 “books.dat”파일을 불러오게 ObjectInputStream과 FileInputStream을 생성

			// 반복문을 통해 값을 다 읽어 들인 후 “books.dat 읽기 완료!” 출력
			for(int i = 0; i < bk.length; i++) {
				bk[i] = (Book) ois.readObject();
			}
			
//			bk = (Book[]) ois.readObject();
		
		} catch(EOFException e) {
			System.out.println("books.txt 읽기 완료!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 읽어온 리스트 출력
		for(int i  = 0; i < bk.length; i++) {
			if(bk[i] == null) {
				break;
			}else {
				System.out.println(bk[i]);	
			}
		}

	}

}
