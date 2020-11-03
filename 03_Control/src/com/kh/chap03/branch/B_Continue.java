package com.kh.chap03.branch;

public class B_Continue {
	// continue : 반복문 안에서만 사용 가능하며
	// 			  continue를 만나게 되면 아래의 내용을 실행하지 말고
	//			    가장 가까운 반복문의 처음으로(=for문의 증감식, while문의 조건식) 돌아가라는 의미
	
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		// 1부터 10까지의 홀수 출력
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) 
				continue; //짝수 일 경우 다음 출력문 실행하지 않고 반복문의 처음(증감식)으로 감
			System.out.println(i);
		}
	}
	
	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		// 1부터 100까지의 정수들의 합 출력
		// 단, 4의 배수는 뺴고 계산
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 4 == 0)
				continue; //4의 배수인 경우 아래 구문 (합산) 수행X
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	public void method3() {
		
		System.out.println("------ method 3 ------");
		
		// 2~9단까지의 구구단 출력
		// 단, 4의 배수의 단은 빼고 출력
		
		for(int dan = 2; dan <= 9; dan++) {
			
			if( dan % 4 == 0) continue;
			
			System.out.println("===" + dan + "단 ===");
			for(int su =1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
	}
	
	public void method4() {
		
		System.out.println("------ method 4 ------");
		
		// 2~9단까지의 구구단 출력 
		// 단, 곱하는 수에서 짝수는 빼고 출력
		// 2 * 1 = 2
		// 2 * 3 = 6
		
		for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println("===" + dan + "단 ===");
			
			for(int su = 1; su <= 9; su++) {
				
				if(su % 2 == 0) { 
					continue;	
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
	}

}
