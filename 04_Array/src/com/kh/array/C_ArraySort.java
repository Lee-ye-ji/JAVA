package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	// 배열 정렬  //정렬 알고리즘
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		// 배열을 정렬하기에 앞서서 변수를 가지고 값을 변경해보자
		
		// 우선 두 개의 변수의 값을 서로 변경하는 법
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("=== 변경 전 ===");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
		// num1과  num2의 값을 서로 바꾼다고 생각해보자.
		// num1 = num2;
		// num2 = num1;
		
		// 따라서 값을 임시로 보관할 새로운 변수를 만들어 값을 이동시키자
		int temp; // 임시로 값을 보관해 둘 변수
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("=== 변경 후 ===");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
	}

	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		// 배열도 동등하게 위치 변경 가능
		int[] arr = {2, 1, 3}; // -> 하나씩 왼쪽으로 밀기: 1, 3, 2
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
	}
	
	public void method3() {
		
		System.out.println("------ method 3 ------");
		
		int[] arr = {2, 5, 4, 1, 3};
		
		// 삽입 정렬(insertion sort)
		// 작은 값이 앞으로, 큰 값이 뒤로 
		// 배열의 n번 인덱스 값을 0번~ n-1번 인덱스까지 비교
		
		// 비교 주제 비교 대상
		// i = 1	j = 0 ~ 0
		// i = 2	j = 0 ~ 1
		// i = 3	j = 0 ~ 2
		// i = 4	j = 0 ~ 3
		
		// i = 1부터 배열 마지막 인덱스까지 반복 할 때
		// j = 0부터 i-1까지 반복
		
		// 오름차순 정렬
		for(int i = 1; i < arr.length; i++) { // 기준이 되는 인덱스를 한 개씩 증가시키는 반복문
			for(int j = 0; j < i; j++) { // 인덱스가 증가할 때 마다 처음부터 해당 인덱스 전까지 값을 비교하는 반복문
				System.out.println("현재 인덱스 위치 : " + i + ", " + j);
				
				// 오름차순 정렬을 위한 처리 //arr[i] < arr[j]
				// 만약 내림차순 정렬을 하고 싶다면 부등호를 반대로 사용하면 됨 // arr[i] > arr[j]
				if(arr[i] < arr[j]) { // 앞에 있는 값 arr[j]가 더 크면 오름차순 정렬을 위해 순서를 바꿔야 함
					System.out.println("==== 교환 발생 ====");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// 수행 결과를 바로 확인해보는 구문
				// Arrays.toString(배열) : 간단하게 배열을 한 줄로 출력해서 확인 할 수 있는 메소드
				System.out.println(i + "회전: " + Arrays.toString(arr));
			}
		}
		// 최종 결과 확인 반복문
		System.out.println("========================");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("------ method 4 ------");
		
		int[] arr = {2, 5, 4, 1, 3};
		
		// 오름차순만 제공
		Arrays.sort(arr);
//		Arrays.sort(arr, 0, 3);
		// fromIndex, toIndex
		// 0번 인덱스부터 3번 인덱스 전까지 정렬 : 0 ~ 2정렬
		
		System.out.println(Arrays.toString(arr));
		
		// 내림차순은 별도로 제공하지 않으므로
		// 새로운 배열을 만들어서 거꾸로 복사
		int[] copy = new int[5];
		for(int i = 0; i < copy.length; i++) {
			copy[i] = arr[copy.length - 1 - i];
		}
		System.out.println(Arrays.toString(copy));
	}
}
