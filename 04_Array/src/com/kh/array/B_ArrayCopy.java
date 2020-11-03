package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사: 배열의 주소만을 복사
	// 깊은 복사: 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사
	
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = origin;
		
		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 복사 된 copy 배열을 이용해서 2번 인덱스의 값을 99로 수정
		copy[2] = 99;
		
		System.out.println("===== 복사 본 배열 값 변경 후 ======");
		
		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 단지 copy 배열의 2번 인덱스 값만 변경했을 뿐인데
		// 원본까지 값이 변경되어 있는 것을 확인할 수 있음
		
		// 그 이유는 같은 곳을 참조하고 있기 때문(즉, 같은 주소값을 가짐)
		System.out.println("origin의 주소값: " + origin.hashCode());
		System.out.println("copy의 주소 값:" + copy.hashCode());
	}
	
	// 복사 된 새로운 배열을 만들기 위해서는 깊은 복사가 필요함
	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		// 1. for문
		//		새로운 배열을 생성하며 반복문을 통해 실제 값을 집어 넣는 방법
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[5]; //5 크기의 빈 배열 만들기, 현재는 0으로 값 초기화 되어 있음.
		
		for(int i = 0; i < origin.length; i++) { // 반복문을 통해 origin에 있는 값들을 copy에 대입
			copy[i] = origin[i];
		}

		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		// 복사 된 copy 배열을 이용해서 2번 인덱스의 값을 99로 수정
		copy[2] = 99;
		
		System.out.println("===== 복사 본 배열 값 변경 후 ======");
		
		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 단지 copy 배열의 2번 인덱스 값만 변경했을 뿐인데
		// 원본까지 값이 변경되어 있는 것을 확인할 수 있음
		
		// 그 이유는 같은 곳을 참조하고 있기 때문(즉, 같은 주소값을 가짐)
		System.out.println("origin의 주소값: " + origin.hashCode());
		System.out.println("copy의 주소 값:" + copy.hashCode());
		
	}
	
	public void method3() {
		
		System.out.println("------ method 3 ------");
		
		// 2. System 클래스에서 arraycopy() 메소드를 이용한 복사
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; //넉넉하게 크기 생성
		
		// (원본배열명, 복사 시작할 인덱스, 복사본배열명, 복사본배열의 복사 시작될 위치, 복사 길이)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		// origin 배열을 copy 배열에 복사하는 데 이 때
		// origin 배열의 0번 인덱스부터 마지막에 넣은 길이만큼을
		// copy 배열의 2번 인덱스부터 채우겠다는 의미
		
		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("------ method 4 ------");
		
		// 3. Arrays 클래스에서 제공하는 copyOf 메소드 사용
		// Arrays 클래스는 배열을 이용할 때 유용한 메소드를 모아놓은 클래스
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Array.copyOf(원본 배열, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 10);
		
		// Arrays.copyOf() -> 내가 지정한 길이만큼 무조건 크기 할당
		// 지정한 길이가 원본 배열보다 긴 경우 기존 배열에 있는 내용 모두 복사(남는 인덱스는 0)
		// 지정한 길이가 원본 배열보다 짧은 경우 기존 배열에서 지정한 길이만큼 복사
		// 앞에서부터 출력됨 위치 바꿀 수 없음
	
		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();	
	}
	
	
	public void method5() {
		
		System.out.println("------ method 5 ------");
		
		// 4. clone() 메소드 이용한 복사
		// 시작 인덱스 지정할 수 없으며 원본 배열 통째로 복사해 새로운 배열 할당
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		// 원본 출력
		System.out.println("원본 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();	
		
	}
}
