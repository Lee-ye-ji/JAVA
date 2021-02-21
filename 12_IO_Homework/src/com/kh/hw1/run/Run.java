package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.dao.FileDao;

public class Run {

	//FileController Ŭ���� ��ü ���� �� �� �޼ҵ带 �޴� ���ÿ� ���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		// �ݺ����� ���� �޴� ����
		while(true) {
			System.out.println("****** My Note ******");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			// �ݺ��� ������ �Է� ���� ��ȣ�� ���� 
			// FileDao�� �޼ҵ带 ����
			switch(num) {
			case 1 : fd.fileSave(); // ���� ���� 
					break; 
			case 2 : fd.fileOpen(); // ����(�б�)
					break;
			case 3 : fd.fileEdit(); // ����
					break;
			case 4 : System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
					return; //������
			default :  System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break; // �ٸ� ��ȣ �Է� ��
			}
			
		}

	}

}
