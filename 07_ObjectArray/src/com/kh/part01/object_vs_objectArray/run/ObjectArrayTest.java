package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 1. �⺻ �ڷ��� �迭�� ����غ���
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr); // arr�� ���۷��� ���� �̱� ������ -> �ּҰ��� ����
		System.out.println(arr[0]); // arr[0]�� ���� ��ұ� ������ -> ���� ����
		
		// arr�� �ڷ��� int[] --> ���۷��� == �ּ� ���� ������ ����
		// arr[index]�� �ڷ��� : int --> �⺻�ڷ��� == ���� ���� ������ ����
		
		// 2. ��ü �迭�� ���
		Book[] bk = new Book[3];
		
		bk[0] = new Book();
		bk[1] = new Book();
		bk[2] = new Book();
		
		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getPrice());
		
		// bk�� �ڷ��� : Book[] --> ���۷���
		// bk[index]�� �ڷ��� : Book -->���۷���
		// bk[index].getPrice�� �ڷ��� : int --> ����
		
		
		
		// ��ü �迭�� �ε����� �����Ƿ� ���� �Է�, ���, �˻� ��� �ݺ������� ��������
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < bk.length; i++) {
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� :");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			bk[i] = new Book(title, author, price, publisher);
		}
		
		for(int i = 0; i < bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		System.out.print("�˻��� ���� ���� : ");
		String search = sc.nextLine();
		
		for(int i = 0; i < bk.length; i++) {
			if(bk[i].getTitle().equals(search)) {
				System.out.println(bk[i].information());
			}
		}
		
		// ............................................
		// ��ü �迭 ����� ���ÿ� �ʱ�ȭ
		Book[] bArr = { new Book("����1", "����1", 3000, "���ǻ�1"),
						new Book("����2", "����2", 4000, "���ǻ�2"),
						new Book("����3", "����3", 5000, "���ǻ�3") };

		Book[] bArr2 = new Book[]{ new Book("����1", "����1", 3000, "���ǻ�1"),
									new Book("����2", "����2", 4000, "���ǻ�2"),
									new Book("����3", "����3", 5000, "���ǻ�3") };
		}

	}

