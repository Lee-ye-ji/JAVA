package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		
		int[][] arr = new int[4][4];
		int value = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int value = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
			}
		}
		
	
	public void practice4() {
		int arr[][] = new int[4][4];
		
		for(int i = 0 ; i < (arr.length-1); i++) {
			for(int j = 0; j< (arr[i].length-1); j++) {
				
				arr[i][j] = (int)(Math.random() * 10)+1;
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
//			System.out.println();
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		int row;
		int col;
		
		while(true) {
			
			// row ��
			System.out.print("�� ũ�� : ");
			row = sc.nextInt();
			
			// colum ��
			System.out.print("�� ũ�� : ");
			col = sc.nextInt();
			
			if( row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}else {
				char[][] cArr = new char[row][col];
				
				for(int i = 0; i < cArr.length; i++) {
					for(int j =0; j < cArr[i].length; j++) {
						cArr[i][j] = (char)((Math.random()*25)+65);
						System.out.print(cArr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
			
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, 
											{"��", "��", "��", "��", "��"}, 
											{"��", "��", "��", "��", "��"}, 
											{"��", "��", "��", "��", "��"}, 
											{"��", "��", "! ", "��", "!! "}};
											
		for(int j = 0; j < strArr.length; j++) {
			for(int i = 0; i < strArr[j].length; i++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char[][] rArr = new char[row][];
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "���� ũ�� :");
			int iRow = sc.nextInt();
			rArr[i] = new char[iRow];
			// 1���� �迭�� �Ҵ�
//			arr[i] = new char[col];
		} 
		int a = 97;
		
		for(int i = 0; i < rArr.length; i++) {
			for(int j = 0; j < rArr[i].length; j++) {
//				System.out.print("(" + i + ", " + j + ")");
				rArr[i][j] = (char)(a++);
				System.out.print(rArr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	public void practice8() {
		String[] stu = new String[]{"�迹��", "�迵�� ", "����", "������", "������", "������",
				"�̿���", "�ӽ�ȯ ", "������", "������ ", "���¿�", "������"};
		
		String[][] newStu = new String[6][2];
		
		int index = 0; // ������ �迭�� 0�� ~ ������ �ε������� �����ϱ� ���� ����
		
		for(int i = 0; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				newStu[i][j] = stu[index++];
			}
		}
		//���
		System.out.println("== 1�д� ==");
		for(int i = 0; i < newStu.length/2; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 3; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		String[] stu = new String[]{"�迹��", "�迵�� ", "����", "������", "������", "������",
				"�̿���", "�ӽ�ȯ ", "������", "������ ", "���¿�", "������"};
		
		String[][] newStu = new String[6][2];
		
		int index = 0; // ������ �迭�� 0�� ~ ������ �ε������� �����ϱ� ���� ����
		
		for(int i = 0; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				newStu[i][j] = stu[index++];
			}
		}
		//���
		System.out.println("== 1�д� ==");
		for(int i = 0; i < newStu.length/2; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 3; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �л� �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		for(int i = 0; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				if(name.equals(newStu[i][j])) {
					System.out.printf("�˻��Ͻ� %s �л��� %d�д� %d��° �� %s�� �ֽ��ϴ�.", 
							name,  (i < 3 ? 1 : 2), (i < 3 ? i : i-2), (j==0 ? "����" : "������") );
				}
			}
		}
		
		
	}

}
