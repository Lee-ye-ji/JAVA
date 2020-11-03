package com.kh.chap03.branch;

public class B_Continue {
	// continue : �ݺ��� �ȿ����� ��� �����ϸ�
	// 			  continue�� ������ �Ǹ� �Ʒ��� ������ �������� ����
	//			    ���� ����� �ݺ����� ó������(=for���� ������, while���� ���ǽ�) ���ư���� �ǹ�
	
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		// 1���� 10������ Ȧ�� ���
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) 
				continue; //¦�� �� ��� ���� ��¹� �������� �ʰ� �ݺ����� ó��(������)���� ��
			System.out.println(i);
		}
	}
	
	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		// 1���� 100������ �������� �� ���
		// ��, 4�� ����� ���� ���
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 4 == 0)
				continue; //4�� ����� ��� �Ʒ� ���� (�ջ�) ����X
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	public void method3() {
		
		System.out.println("------ method 3 ------");
		
		// 2~9�ܱ����� ������ ���
		// ��, 4�� ����� ���� ���� ���
		
		for(int dan = 2; dan <= 9; dan++) {
			
			if( dan % 4 == 0) continue;
			
			System.out.println("===" + dan + "�� ===");
			for(int su =1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
	}
	
	public void method4() {
		
		System.out.println("------ method 4 ------");
		
		// 2~9�ܱ����� ������ ��� 
		// ��, ���ϴ� ������ ¦���� ���� ���
		// 2 * 1 = 2
		// 2 * 3 = 6
		
		for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println("===" + dan + "�� ===");
			
			for(int su = 1; su <= 9; su++) {
				
				if(su % 2 == 0) { 
					continue;	
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
	}

}
