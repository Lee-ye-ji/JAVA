package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() { 
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		int num = sc.nextInt();
		
		int[] nArr = new int[num];
		
		for(int i = 0; i < num; i++) {
			nArr[i] = i+1;
			System.out.print(nArr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] fruit = {"���", "��", "����", "������", "����"};
		
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] arrStr = new char[str.length()];
		
		System.out.print("���� : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���): ");
		
		for(int i = 0; i < str.length(); i++) {
			arrStr[i] = str.charAt(i);
			if(ch == arrStr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " ���� : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int day = sc.nextInt();
		
		String[] week = new String[]{"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		
		if(day > 6 || day < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println(week[day]);
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println("�迭 " + i +"��° �ε����� ���� ��: ");
			int inNum = sc.nextInt();
			numArr[i] = inNum;
			sum += inNum;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		System.out.println("���� : " + sum);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if( num >= 3 && num % 2 == 1) {
				
				int[] oddNum = new int[num];
				
				//�޸� , ��� ������ ������ 3�� �Է����� �� 1, 2, 1,����
				for(int i = 0; i < (num/2)+1; i++) {
					oddNum[i] = i+1;
					System.out.print(oddNum[i] + ", ");
				}
				for(int j = (num/2)+1; j < oddNum.length; j++) {
					oddNum[j] = oddNum.length-j;
					System.out.print(oddNum[j] + ", ");
				}
				break;
				
				//���
//				for(int i = 0; i < oddNum.length; i++) {
//					if(i< oddNum.length-1) {
//						System.out.print(oddNum[i] + ", ");
//					}
//				}
				
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String chicken = sc.nextLine();
		
		String[] menu = {"���", "�Ķ��̵�", "����", "����", "����"};
		
		
		//for�� �ȿ� ��¹� ������ �ȵ�!
		int i = 0;
		for(; i < menu.length; i++) {
			if(menu[i].equals(chicken)) {
				break;
			}
		}
		
		if(i < menu.length) {
			System.out.println(chicken +"ġŲ ��� ����");
		}else {
			System.out.println(chicken +"ġŲ�� ���� �޴��Դϴ�.");
		}
	
	}
	
	public void practice10() {
		int[] nansu = new int[10];
		
		for(int i = 0; i < nansu.length; i++) {
			nansu[i] = (int)(Math.random()* 10) + 1;
			
			System.out.print(nansu[i] + " ");
		}
	}
	
	public void practice11() {

		int[] nansu = new int[10];
		
		//�ߺ��� ���ֱ�
		for(int i = 0; i < nansu.length; i++) {
				nansu[i] = (int)(Math.random()* 10) + 1;
				for(int j = 0; j < i; j++) { 
					if(nansu[i] == nansu[j]) { 
						i--; // �ߺ��� �Ǹ� �ٽ� �ܺ� for������ ���ư��� ����
						break;
					}
				}
			}
		// ���
		for(int i = 0; i < nansu.length; i++) {
			System.out.print(nansu[i] + " ");
		}
		}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String jumin = sc.nextLine();
		
		char[] chArr = new char[jumin.length()];
		char[] copyChArr = chArr;
		
		for(int i = 0; i < jumin.length(); i++) {
			chArr[i] = jumin.charAt(i);
			if(i > 7) {
				copyChArr[i] = '*';
			}else {
				copyChArr[i] = chArr[i];
			}
			System.out.print(copyChArr[i]);
		}
	}
	
	public void practice13() {
		int[] lotto = new int[6];
		
		//�ߺ� �� ���ֱ�
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// �������� ����
//		Arrays.sort(lotto);
		for(int i = 1;  i < lotto.length; i++) {
			for(int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}	
			}
		}
		
		// �� ���
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		int count = 0;
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for(int i = 0; i < str.length(); i++) {
			
			boolean check = true; // �ߺ� üũ
			
			chArr[i] = str.charAt(i);
			
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					check = false;
					continue;
				}
			}
			if(check) {
				if(i == 0) {
					System.out.print(chArr[i]);
				}else {
					System.out.print(", " + chArr[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.print("���ڰ��� : " + count);
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int arrNum = sc.nextInt();
		sc.nextLine();
		
		String[] strArr = new String[arrNum];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print((i+1) + "��° ���ڿ� : ");
			strArr[i] = sc.nextLine();	
		}
		
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) :");
			char yn = sc.next().charAt(0);
			
			if(yn == 'Y' || yn == 'y') {
				
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int more = sc.nextInt();
				sc.nextLine();
				
				String[] moreArr = new String[arrNum + more];
				
				for(int i = 0; i < moreArr.length; i++) {
					if( i < strArr.length) {
						moreArr[i] = strArr[i];
					}else {
						System.out.print((i+1) + "��° ���ڿ� : ");
						moreArr[i] = sc.nextLine();
					}
				}
				//���� ����
				strArr = moreArr; // ���� �迭�� ���ο� �迭�� �ּҰ� ���� --> ���� �迭 ������� �� 
				
			}else if(yn == 'N' || yn == 'n') {
				break;
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
}
