package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	// �ߺ� ����
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		// ����ڿ��� 5���� ���� �Է¹޾� �迭�� ����
		// ��, �ߺ� ���� ������� ����
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "��° ���� ��: ");
			arr[i] = sc.nextInt();
			
			// ������ �Է¹��� �� �� �ߺ� ���� �ִ��� Ȯ���ϴ� �ݺ���
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { // �ߺ� ���� �����ϴ� ���
					System.out.println("�ߺ� ���� �����մϴ�.");
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		int[] arr = new int[5];
		// 1~10������ ������ �ߺ����� ä���
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(j + "��°�� " + i + "��° :" +arr[i] + "�ߺ�");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
