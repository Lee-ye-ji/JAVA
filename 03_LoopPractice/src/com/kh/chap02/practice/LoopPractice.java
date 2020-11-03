package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	//1, 3, 5, 6, 8, 9, 11, 12, 13�� ����
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int userNum = sc.nextInt();
		
		if(userNum >= 1) {
			for(int i = 1; i <= userNum; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int userNum = sc.nextInt();
			
			if(userNum >= 1) {
				for(int i = 1; i <= userNum; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int userNum = sc.nextInt();
		
		if(userNum >= 1) {
			for(int i = userNum ; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int userNum = sc.nextInt();
			
			if(userNum >= 1) {
				for(int i = userNum ; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
			if(i != num) {
				System.out.print(" + ");
			}
			sum += i;
		}
		System.out.print(" = " + sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(first > second) {
			max = first;
			min = second;
		}else {
			max = second;
			min = first;
		}
		
		if(max >= 1 && min >= 1) {
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ù ��° ���� : ");
			int first = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int second = sc.nextInt();
			
			int max = 0;
			int min = 0;
			
			if(first > second) {
				max = first;
				min = second;
			}else {
				max = second;
				min = first;
			}
			
			if(max >= 1 && min >= 1) {
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void  practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan + "�� ====");
		
		for(int i =1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int user = sc.nextInt();
		
		if( (1 < user) && (user < 10) ) {
			for(int dan = user; dan <= 9; dan++) {
				System.out.println("==== " + dan + "�� ====");
				for(int su =1; su < 10; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, (dan * su));	
				}
			}
		}else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int user = sc.nextInt();
			
			if( (1 < user) && (user < 10) ) {
				for(int dan = user; dan <= 9; dan++) {
					System.out.println("==== " + dan + "�� ====");
					for(int su =1; su < 10; su++) {
						System.out.printf("%d * %d = %d\n", dan, su, (dan * su));	
					}
				}
				break;
			}else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	//11
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		System.out.print("���� : ");
		int d = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(num + " ");
			num += d;
		}
		
		
	}
	
	//12
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int star = sc.nextInt();
		
		for(int i = 1; i <= star ; i++) {
			for(int j = 1; j <= star; j++) {
				if(i >= j) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	//13
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int star = sc.nextInt();
		
		for(int i = 1; i <= star ; i++) {
			for(int j = 1; j <= star; j++) {
				if(i <= j) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������(+,-,*,/,%) : ");
			String ope = sc.next();
			
			if(ope.equalsIgnoreCase("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
//				break;
				return;
			}
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			int result = 0;
			
			if(ope.equals("/") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			}else if(!ope.equals("+") && !ope.equals("-") && 
					!ope.equals("*") && !ope.equals("/") && !ope.equals("%")) {
				System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.");
			}else {
				switch(ope) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				case "%":
					result = num1 % num2;
					break;
				}
				System.out.println(num1 + " " + ope + " " + num2  + " = " + result);
//				continue;
			}
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt(); //�Է� ���� ��
		int i = 2; //2���� n���� 1�� �����Ǵ� ��
		
		if(n < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		else {
			while(n % i != 0) {
				i++;
			}
			
			if(n == i) {
				System.out.println("�Ҽ��Դϴ�.");
			}else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� :");
			int num = sc.nextInt();
			int sosu = 2;
			
			if(num < 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else {
				
				while(num % sosu != 0) {
					sosu++;
				}
				
				if(num == sosu) {
					System.out.println("�Ҽ��Դϴ�.");
					break;
				}else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				}
			}	
		}
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		int count = 0;
		
		if(num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			for(int i = 2; i <= num; i++) {	
				for(int j = 2; j <= i; j++) {
					if( i != j && i % j == 0) {
						break;
					}else if(i == j) {
						System.out.print(i + " ");
						count++;
					}

				}
			}
			System.out.println();
			System.out.printf("2���� %d���� �Ҽ��� ������ %d�� �Դϴ�." , num, count);
		}
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ���: ");
		int multipe = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= multipe; i++) {
			if( (i % 2 == 0) || (i % 3 == 0) ) {
				System.out.print(i + " ");
			}if( i % 6 == 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		//���� �ﰢ��
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//�Ʒ��� �ﰢ��
		for(int m = 0; m < num-1; m++) {
			for(int n = num-m-1; n > 0; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num-i-1 ; j++) {
				System.out.print(" ");
			}
			for(int s = 0; s < i*2+1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(i == 0 || i == (num-1)) {
					System.out.print("*");
				}else {
					if(j == 0 || j == (num-1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void practice23() {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		do {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			System.out.println("ù ��° �ֻ��� ���� �� : " + dice1);
			System.out.println("�� ��° �ֻ��� ���� �� : " + dice2);
			
			int sum = dice1 + dice2;
			
			System.out.println("�� �ֻ��� ���� �� : " + sum);
			
			if(sum == num) {
				System.out.println("�¾ҽ��ϴ�.");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
			System.out.print("����Ͻðڽ��ϱ�?(y/n) : ");
			ch = sc.next().charAt(0);
			
		}while(ch != 'n' && ch != 'N');
		
	}

}
