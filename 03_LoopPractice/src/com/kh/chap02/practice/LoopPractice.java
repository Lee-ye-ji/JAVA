package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	//1, 3, 5, 6, 8, 9, 11, 12, 13번 문항
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int userNum = sc.nextInt();
		
		if(userNum >= 1) {
			for(int i = 1; i <= userNum; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int userNum = sc.nextInt();
			
			if(userNum >= 1) {
				for(int i = 1; i <= userNum; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int userNum = sc.nextInt();
		
		if(userNum >= 1) {
			for(int i = userNum ; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int userNum = sc.nextInt();
			
			if(userNum >= 1) {
				for(int i = userNum ; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
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
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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
			System.out.println("1이상의 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int first = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
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
				System.out.println("1이상의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void  practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan + "단 ====");
		
		for(int i =1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int user = sc.nextInt();
		
		if( (1 < user) && (user < 10) ) {
			for(int dan = user; dan <= 9; dan++) {
				System.out.println("==== " + dan + "단 ====");
				for(int su =1; su < 10; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, (dan * su));	
				}
			}
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int user = sc.nextInt();
			
			if( (1 < user) && (user < 10) ) {
				for(int dan = user; dan <= 9; dan++) {
					System.out.println("==== " + dan + "단 ====");
					for(int su =1; su < 10; su++) {
						System.out.printf("%d * %d = %d\n", dan, su, (dan * su));	
					}
				}
				break;
			}else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	//11
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int d = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(num + " ");
			num += d;
		}
		
		
	}
	
	//12
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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
		System.out.print("정수 입력 : ");
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
			System.out.print("연산자(+,-,*,/,%) : ");
			String ope = sc.next();
			
			if(ope.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
//				break;
				return;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			int result = 0;
			
			if(ope.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}else if(!ope.equals("+") && !ope.equals("-") && 
					!ope.equals("*") && !ope.equals("/") && !ope.equals("%")) {
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
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
		System.out.print("숫자 : ");
		int n = sc.nextInt(); //입력 받은 수
		int i = 2; //2부터 n까지 1씩 증가되는 수
		
		if(n < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			while(n % i != 0) {
				i++;
			}
			
			if(n == i) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 :");
			int num = sc.nextInt();
			int sosu = 2;
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다.");
			}else {
				
				while(num % sosu != 0) {
					sosu++;
				}
				
				if(num == sosu) {
					System.out.println("소수입니다.");
					break;
				}else {
					System.out.println("소수가 아닙니다.");
					break;
				}
			}	
		}
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		int count = 0;
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
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
			System.out.printf("2부터 %d까지 소수의 개수는 %d개 입니다." , num, count);
		}
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요: ");
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
		System.out.print("정수 입력 : ");
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
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//위쪽 삼각형
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//아래쪽 삼각형
		for(int m = 0; m < num-1; m++) {
			for(int n = num-m-1; n > 0; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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
		System.out.print("정수 입력 : ");
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
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			System.out.println("첫 번째 주사위 눈의 값 : " + dice1);
			System.out.println("두 번째 주사위 눈의 값 : " + dice2);
			
			int sum = dice1 + dice2;
			
			System.out.println("두 주사위 눈의 합 : " + sum);
			
			if(sum == num) {
				System.out.println("맞았습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			
			System.out.print("계속하시겠습니까?(y/n) : ");
			ch = sc.next().charAt(0);
			
		}while(ch != 'n' && ch != 'N');
		
	}

}
