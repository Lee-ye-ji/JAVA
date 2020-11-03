package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {
	// ������ �迭 : ������ �迭 ���� ���� �ϳ��� ���� ��
	
	public void method1() {
		
		System.out.println("----- method 1 -----");
		
		/* ������ �迭 ����
		 * 
		 * �ڷ���[][] �迭��;
		 * �ڷ���[] �迭��[];
		 * �ڷ��� �迭��[][];
		 */
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		// ������ �ϰ� �Ǹ� stack�� ���۷��� ���� ����
		
		/* ������ �迭 �Ҵ� 
		 * 
		 * �迭�� = new �ڷ���[��ũ��][��ũ��];
		 */
		
		arr1 = new int[3][5];
		// �Ҵ��� �ϰ� �Ǹ� heap������ �ش� ũ�� ��ŭ�� ������ �Ҵ� ��
		
		System.out.println("���� ���� : " + arr1.length);
		
		System.out.println("���� ���� : " + arr1[0].length);
		
		// ****
		// ****
		// ****
		// ****
		
		// �ܺ� for�� --> ���� ������ŭ �ݺ�
		// ���� for�� --> ���� ������ŭ �ݺ�
		
		// ������ �迭�� �����ϰ� ����
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		
		System.out.println("----- method 2 -----");
		
		int[][] arr = new int[3][5];
		
		// 1 2 3 4 5 
		// 6 7 8 9 10
		// 11 12 13 14 15
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}	
	}
	
	public void method3() {
		
		System.out.println("----- method 3 -----");
		
		// ������ �迭�� �Ҵ�� �ʱ�ȭ ���ÿ�
		int[][] arr = {{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " \t");
				//  \t --> tab�� ���� �� ���� ���ִ� �� 
			}
			System.out.println();
		}
	}
	
	public void method4() {
		
		System.out.println("----- method 4 -----");
		
		// ���� �迭
		// ���� ���������� �� �࿡ ���� ���� ������ �������� ���� ����
		// �ڷ����� ���� 1���� �迭 ���� ���� �ϳ��� ���� ���� 2���� �迭�̹Ƿ�
		// �����ִ� 1���� �迭�� ���̰� �ݵ�� ���� �ʿ�� ����
		
		int [][] arr = new int[3][]; // ���� �迭 �Ҵ�(���� ũ�⸸ ����)
		
		arr[0] = new int[2]; // 0���� 2��
		arr[1] = new int[1]; // 1���� 1��
		arr[2] = new int[3]; // 2���� 3��
		// -> �� �࿡ �� �ٸ� �迭�� ������ �� �ֵ��� �Ҵ�
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method5() {
		
		System.out.println("----- method 5 -----");
		
		// ���� �迭�� �Ҵ�� �ʱ�ȭ ���ÿ�
		int[][] arr = {{1,2},{3},{4,5,6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		
		System.out.println("----- method 6 -----");
		
		// double�� 2�� 4�� �迭�� �����
		// 3�� �л��� ����(0��), ����(1��) ������ �Է¹ް� ������ ��(3��)���� �հ踦 ���
		
		double[][] arr = new double[2][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			double sum = 0;
			
			for(int j = 0; j < arr[i].length-1; j++) { // 0, 1, 2���� ���� �Է� �޴� �ݺ���
				if(i == 0) {
					System.out.print(j+1 + "�� �л� ���� ����: ");
				}else {
					System.out.print(j+1 + "�� �л� ���� ����: ");
				}
				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];	
			}
			arr[i][3] = sum;
		}
		// ����ϴ� �ݺ���
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				System.out.print("���� ���� : ");
			}else {
				System.out.print("���� ���� : ");
			}
			
			for(int j = 0; j < arr[i].length; j++) { // 0, 1, 2, 3�� ��� ����ϴ� �ݺ���
				if(j < arr[i].length-1) {
					System.out.print(arr[i][j] + " ");
				}else {
					System.out.print("�հ� : " + arr[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public void method7() {
		
		System.out.println("----- method 7 -----");
		
		// char�� 2���� �迭 5�� 5���� ����� ��� ���� �Է� �޾�
		// �ش� ��ǥ�� ���� 'x'�� ��ȯ�� 2���� �迭 ����ϱ�
		// �ݺ� �����ϵ� ���̳� �� �Է½� 0 �̸� 5�̻��� ���� �ԷµǸ� ���α׷� ����
		
		char[][] arr = new char[5][5];
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		
		while(true) {
			System.out.print("�� �ε��� �Է� >>>");
			row = sc.nextInt();
			System.out.print("�� �ε��� �Է� >>>");
			col = sc.nextInt();
			
			if(row < 0 || row > 4 || col < 0 || col > 4) {
				break;
			}
			
			arr[row][col] = 'x';
			
			//��¹� �ۼ��ϱ�
			System.out.println("\t0\t1\t2\t3\t4\t");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i+ " \t");
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
//			System.out.println();
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void method8() {
		
		System.out.println("----- method 8 -----");
		
		// 1 ~ 10 ������ ���� ���� 3�� 3�� �迭�� �ߺ� ���� �ֱ�
		
		// 1. ������ �迭�� �̿��ؼ� ���� �ߺ� ����
		int[] arr = new int[3*3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		
			// �ߺ� Ȯ�� �� �ߺ� �� �ٽ� ���� �� ������ ���� i--
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("==== ������ �迭 ��� ====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ������ ������� �ߺ� ���� �� ������ �迭�� --> ������ �迭�� �ֱ�
		int[][] newArr = new int[3][3];
		
		int index = 0; // ������ �迭�� 0�� ~ ������ �ε������� �����ϱ� ���� ����
		
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++];
//				index++;
			}
		}
		System.out.println("==== ������ �迭 ��� ====");
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	

}
