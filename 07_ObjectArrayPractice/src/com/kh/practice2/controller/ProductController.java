package com.kh.practice2.controller;

import java.util.Scanner;

import com.kh.practice2.model.vo.Product;

public class ProductController {
	
	private Product[] pro = new Product[10]; // = null
	public int count = 0; // ���� �߰��� ��ü ��
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// �޴� ��� --> do~while ������ �ݺ� ���� ó����
		do{
			System.out.println("===== ��ǰ ���� �޴� =====");
			System.out.println("1. ��ǰ ���� �߰�"); // productInput() �޼ҵ� ����
			System.out.println("2. ��ǰ ��ü ��ȸ"); // productPrint() �޼ҵ� ����
			System.out.println("3. ��ǰ ��ü ����"); // productDelete() �޼ҵ� ����
			System.out.println("4. ��ǰ ����");  // productUpdate() �޼ҵ� ����
			System.out.println("5. ��ǰ�� �˻�"); // productSearch() �޼ҵ� ����
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				 productInput();
				break;
			case 2:
				 productPrint();
				break;
			//����
			case 3:
				productDelete();
				break;
			//����
			case 4:
				productUpdate();
				break;
			// �˻�
			case 5:
				productSearch();
				break;
			case 9:
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է����ּ���."); 
				break;
				
			}
			
			
			
		}while(true);
	}

	private void productInput() {
		// Ű����� ���� ������ �Է� �޾� ��ü ����
		
		System.out.println(" === ���� ���� �Է� === ");
		
		// ��ǰ ��ȣ
		System.out.print("��ǰ ��ȣ : ");
		int pId = sc.nextInt();
		sc.nextLine();
		
		// ��ǰ��
		System.out.print("��ǰ�� : ");
		String pName = sc.nextLine();
		
		// ��ǰ ����
		System.out.print("��ǰ ���� : ");
		int price = sc.nextInt();
		
		// ��ǰ ����
		System.out.print("��ǰ ���� : ");
		double tax = sc.nextDouble();
		
		// -> Product ������ ���ο��� ProductController�� count Ŭ���� ���� ���� 1�� ����
		// ���� ī��Ʈ �ε����� ������ �ּ� ����
		if(count < pro.length) {
			pro[count++] = new Product(pId, pName, price, tax);
			System.out.println("���� ���� ������ �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("���� ���� �Է¿� �����Ͽ����ϴ�.");
		}
		
	}

	private void productPrint() {
		// ������� ��ϵ� ���� ���� ��� ���
		if(count == 0 || pro[0].getpId() == 0) {
			System.out.println("���� ��ϵ� ���� ������ �����ϴ�.");
		}else {
			for(int i = 0; i < count; i++) {
				System.out.println(pro[i].information());
			}
		}
		
	}
	
	// �߰������� ��ǰ ����, ����, �˻� ����� �޼ҵ带 �����ؼ� �߰��غ�����~
	
	// ����
	private void productDelete() {
		if(count == 0) {
			System.out.println("���� �� ���� ������ �����ϴ�.");
		}else {
			for(int i = 0; i < count; i++) {
				pro[i] = null;
				System.out.println("��� ���� ������ �����Ǿ����ϴ�.");
			}
			count = 0;
		}	
	}
	
	// ����
	private void productUpdate() {
		
		if(count == 0 ) {
			System.out.println("������ ���� ������ �����ϴ�.");
		}else if(count > 0) {
		while(true) {
			System.out.println(" ----- ��ǰ ���� �޴� -----");
			System.out.println("1. ��� ��ǰ ��ȣ");
			System.out.println("2. �����ǰ��");
			System.out.println("3. ��� ��ǰ ����");
			System.out.println("4. ��� ��ǰ ����");
			System.out.println("9. ���� �޴���");
			System.out.print("������ �޴� : ");
			int update = sc.nextInt();
			sc.nextLine();
			
				switch(update) {
				case 1:
					// ��ǰ ��ȣ
					for(int i = 0; i < count; i++) {
						System.out.print("��ǰ ��ȣ : ");
						int pId = sc.nextInt();
						pro[i].setpId(pId);
					}
					break;
				case 2:
					// ��ǰ��
					for(int i = 0; i < count; i++) {
						System.out.print("��ǰ�� : ");
						String pName = sc.nextLine();
						pro[i].setpName(pName);
					}
					break;
				case 3:
					// ��ǰ ����
					for(int i = 0; i < count; i++) {
						System.out.print("��ǰ ���� : ");
						int price = sc.nextInt();
						pro[i].setPrice(price);	
					}
					break;
				case 4:
					// ��ǰ ����
					for(int i = 0; i < count; i++) {
						System.out.print("��ǰ ���� : ");
						double tax = sc.nextDouble();
						pro[i].setTax(tax);
					}
					break;
				case 9:
					return;
				default:
					System.out.println("���� �޴� �Դϴ�. �ٽ� ����ּ���.");
					break;
				}	
			}

		}
		
	}
	
	// �˻�
	private void productSearch() {
		System.out.print("�˻��� ��ǰ ��: ");
		String search = sc.nextLine();
		
		Product[] searchProduct = new Product[10];
		
		int index = 0; //searchProduct�� �ε���
		
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
			System.out.println("�˻��� ��ǰ���� �����ϴ�.");
		}
		
	}
	
}
