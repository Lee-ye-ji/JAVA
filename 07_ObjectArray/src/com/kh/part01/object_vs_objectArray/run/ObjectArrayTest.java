package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 1. 기본 자료형 배열을 사용해보자
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr); // arr은 레퍼런스 변수 이기 떄문에 -> 주소값이 나옴
		System.out.println(arr[0]); // arr[0]은 값을 담았기 떄문에 -> 값이 나옴
		
		// arr의 자료형 int[] --> 레퍼런스 == 주소 값을 가지는 변수
		// arr[index]의 자료형 : int --> 기본자료형 == 실제 값을 가지는 변수
		
		// 2. 객체 배열을 사용
		Book[] bk = new Book[3];
		
		bk[0] = new Book();
		bk[1] = new Book();
		bk[2] = new Book();
		
		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getPrice());
		
		// bk의 자료형 : Book[] --> 레퍼런스
		// bk[index]의 자료형 : Book -->레퍼런스
		// bk[index].getPrice의 자료형 : int --> 변수
		
		
		
		// 객체 배열은 인덱스를 가지므로 정보 입력, 출력, 검색 모두 반복문으로 변경하자
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < bk.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 :");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			bk[i] = new Book(title, author, price, publisher);
		}
		
		for(int i = 0; i < bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		System.out.print("검색할 도서 제목 : ");
		String search = sc.nextLine();
		
		for(int i = 0; i < bk.length; i++) {
			if(bk[i].getTitle().equals(search)) {
				System.out.println(bk[i].information());
			}
		}
		
		// ............................................
		// 객체 배열 선언과 동시에 초기화
		Book[] bArr = { new Book("제목1", "저자1", 3000, "출판사1"),
						new Book("제목2", "저자2", 4000, "출판사2"),
						new Book("제목3", "저자3", 5000, "출판사3") };

		Book[] bArr2 = new Book[]{ new Book("제목1", "저자1", 3000, "출판사1"),
									new Book("제목2", "저자2", 4000, "출판사2"),
									new Book("제목3", "저자3", 5000, "출판사3") };
		}

	}

